package fr.france;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.bean.CsvToBeanBuilder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.france.outils.OutilsString;

/**
 * <b>RepertoireCommune est la classe repertoriant toutes les Communes de
 * France.</b>
 * <p>
 * Cette classe permet de faire des recherches :
 * </p>
 * <ul>
 * <li>Par nom.</li>
 * <li>Par code postal.</li>
 * <li>Par nom et code postal.</li>
 * </ul>
 * 
 * @see Commune
 * 
 * @author MathieuSoysal
 * @version 1.0.0
 */
public class RepertoireCommune {

    private static final Log log = LogFactory.getLog(RepertoireCommune.class);

    private RepertoireCommune() {
        throw new IllegalStateException("Class utilitaire");
    }

    private static final List<Commune> COMMUNES = initCommunes();

    private static List<Commune> initCommunes() {
        List<Commune> result = null;
        try {
            InputStream resource = RepertoireCommune.class.getClassLoader().getResourceAsStream("communes.csv");
            if (resource == null)
                throw new FileNotFoundException();
            Reader reader = new InputStreamReader(resource);
            result = new CsvToBeanBuilder<Commune>(reader).withType(Commune.class).build().parse();
        } catch (IllegalStateException | FileNotFoundException e) {
            log.error("Le fichier contenant les communes n'a pas été trouvé", e);
        }
        return result;
    }

    private static final Map<Integer, List<Commune>> REPERTOIRE_CODE_POSTAL;
    private static final Map<String, List<Commune>> REPERTOIRE_NOM;
    private static final Map<String, Commune> REPERTOIRE_NOM_ET_CODE_POSTAL;

    static {
        Map<Integer, List<Commune>> codePostaux = new HashMap<>();
        Map<String, List<Commune>> noms = new HashMap<>();
        Map<String, Commune> nomEtCodePostal = new HashMap<>();
        for (Commune Commune : COMMUNES) {
            if (Commune.getNom() == null)
                continue;
            nomEtCodePostal.put(OutilsString.formater(Commune.getNom()) + Commune.getCodePostal(), Commune);
            List<Commune> villesNom = noms.computeIfAbsent(OutilsString.formater(Commune.getNom()),
                    k -> new ArrayList<>());
            List<Commune> villesCodePostal = codePostaux.computeIfAbsent(Commune.getCodePostal(),
                    k -> new ArrayList<>());
            villesNom.add(Commune);
            villesCodePostal.add(Commune);
        }
        REPERTOIRE_CODE_POSTAL = Collections.unmodifiableMap(codePostaux);
        REPERTOIRE_NOM = Collections.unmodifiableMap(noms);
        REPERTOIRE_NOM_ET_CODE_POSTAL = Collections.unmodifiableMap(nomEtCodePostal);
    }

    /**
     * @return Toutes les Communes françaises
     * 
     * @see Commune
     */
    public static List<Commune> getCommunes() {
        return new ArrayList<>(COMMUNES);
    }

    /**
     * Retourne les {@link Commune} correspondantes au code postal donné en
     * paramètre.
     * 
     * @param codePostal des Communes devant être cherchées
     * 
     * @return Une liste des {@link Commune} correpondants au code postal donné
     * 
     * @see Commune
     */
    public static List<Commune> rechercherParCodePostal(int codePostal) {
        return REPERTOIRE_CODE_POSTAL.get(codePostal);
    }

    /**
     * Retourne les {@link Commune} correspondantes au nom donné en paramètre.
     * 
     * @param nom des Communes devant être cherchées
     * 
     * @return Une liste des {@link Commune} correpondants au nom donné
     * 
     * @see Commune
     */
    public static List<Commune> rechercherParNom(String nom) {
        return REPERTOIRE_NOM.get(OutilsString.formater(nom));
    }

    /**
     * Retourne la {@link Commune} correspondante au nom et au code postal donné en
     * paramètre.
     * 
     * @param nom        de la Commune devant être cherchée
     * @param codePostal de la Commune devant être cherchée
     * 
     * @return la {@link Commune} correpondants au nom et au code postal
     * 
     * @see Commune
     */
    public static Commune rechercherParNomEtCodePostal(String nom, int codePostal) {
        return REPERTOIRE_NOM_ET_CODE_POSTAL.get(OutilsString.formater(nom) + codePostal);
    }

}
