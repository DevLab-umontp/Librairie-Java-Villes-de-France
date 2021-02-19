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

    /**
     * @return Toutes les caumunes françaises
     * 
     * @see Caumune
     */
    public static List<Caumune> getCaumunes() {
        return new ArrayList<>(CAUMUNES);
    }

	public static List<Object> rechercherParCodePostal(int i) {
		return null;
	}

	public static List<Object> rechercherParNom(String string) {
		return null;
	}


}
