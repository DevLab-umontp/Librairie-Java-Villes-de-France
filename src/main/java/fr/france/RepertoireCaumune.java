package fr.france;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

public class RepertoireCaumune {

    private RepertoireCaumune() {
        throw new IllegalStateException("Class utilitaire");
    }

    private static final List<Caumune> CAUMUNES = initCaumunes();

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
     * @return the caumunes
     */
    public static List<Caumune> getCaumunes() {
        return CAUMUNES;
    }
}
