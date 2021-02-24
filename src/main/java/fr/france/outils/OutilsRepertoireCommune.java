package fr.france.outils;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opencsv.bean.CsvToBeanBuilder;

import fr.france.Commune;
import fr.france.RepertoireCommune;

/**
 * <b>OutilsRepertoireCommune est la classe utilitaire de la class
 * RepertoireCommune.</b>
 * <p>
 * Elle permet d'alléger la class {@link fr.france.RepertoireCommune}
 * </p>
 * 
 * @see RepertoireCommune
 * 
 * @author MathieuSoysal
 * @version 1.0.0
 */
public class OutilsRepertoireCommune {

    private OutilsRepertoireCommune() {
        throw new IllegalStateException("Class utilitaire");
    }

    public static List<Commune> convertirCsvEnCommune(Reader reader) {
        return new CsvToBeanBuilder<Commune>(reader).withType(Commune.class).build().parse();
    }

    public static Reader getRessource(String fileName) throws FileNotFoundException {
        InputStream resource = RepertoireCommune.class.getClassLoader().getResourceAsStream(fileName);
        if (resource == null)
            throw new FileNotFoundException("Le fichier contenant les communes n'a pas été trouvé");
        return new InputStreamReader(resource);
    }

    public static void initialiserRepertoires(Map<Integer, List<Commune>> codePostaux, Map<String, List<Commune>> noms,
            Map<String, Commune> nomEtCodePostal, final List<Commune> communes) {
        for (Commune Commune : communes) {
            nomEtCodePostal.put(OutilsString.formater(Commune.getNom()) + Commune.getCodePostal(), Commune);
            List<Commune> villesNom = noms.computeIfAbsent(OutilsString.formater(Commune.getNom()),
                    k -> new ArrayList<>());
            List<Commune> villesCodePostal = codePostaux.computeIfAbsent(Commune.getCodePostal(),
                    k -> new ArrayList<>());
            villesNom.add(Commune);
            villesCodePostal.add(Commune);
        }
    }

}
