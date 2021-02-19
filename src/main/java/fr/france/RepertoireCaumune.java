package fr.france;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opencsv.bean.CsvToBeanBuilder;

import fr.france.outils.OutilsString;

public class RepertoireCaumune {

    private RepertoireCaumune() {
        throw new IllegalStateException("Class utilitaire");
    }

    private static final Set<Caumune> CAUMUNES = new HashSet<>(initCaumunes());

    private static List<Caumune> initCaumunes() {
        List<Caumune> result = null;
        try {
            result = new CsvToBeanBuilder(new FileReader("laposte_hexasmal.csv")).withType(Caumune.class).build()
                    .parse();
        } catch (IllegalStateException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static final Map<Integer, List<Caumune>> REPERTOIRE_CODE_POSTAL;
    private static final Map<String, List<Caumune>> REPERTOIRE_NOM;
    private static final Map<String, Caumune> REPERTOIRE_NOM_ET_CODE_POSTAL;

    static {
        Map<Integer, List<Caumune>> codePostaux = new HashMap<>();
        Map<String, List<Caumune>> noms = new HashMap<>();
        Map<String, Caumune> nomEtCodePostal = new HashMap<>();
        for (Caumune caumune : CAUMUNES) {
            if (caumune.getNom() == null)
                continue;
            nomEtCodePostal.put(OutilsString.formater(caumune.getNom()) + caumune.getCodePostal(), caumune);
            List<Caumune> villesNom = noms.computeIfAbsent(OutilsString.formater(caumune.getNom()),
                    k -> new ArrayList<>());
            List<Caumune> villesCodePostal = codePostaux.computeIfAbsent(caumune.getCodePostal(),
                    k -> new ArrayList<>());
            villesNom.add(caumune);
            villesCodePostal.add(caumune);
        }
        REPERTOIRE_CODE_POSTAL = Collections.unmodifiableMap(codePostaux);
        REPERTOIRE_NOM = Collections.unmodifiableMap(noms);
        REPERTOIRE_NOM_ET_CODE_POSTAL = Collections.unmodifiableMap(nomEtCodePostal);
    }

    /**
     * @return Toutes les caumunes françaises
     * 
     * @see Caumune
     */
    public static List<Caumune> getCaumunes() {
        return new ArrayList<>(CAUMUNES);
    }

    public static List<Caumune> rechercherParCodePostal(int codePostal) {
        return REPERTOIRE_CODE_POSTAL.get(codePostal);
    }

    public static List<Caumune> rechercherParNom(String nom) {
        return REPERTOIRE_NOM.get(OutilsString.formater(nom));
    }

    public static Caumune rechercherParNomEtCodePostal(String nom, int codePostal) {
        return REPERTOIRE_NOM_ET_CODE_POSTAL.get(OutilsString.formater(nom) + codePostal);
    }

}
