package fr.france.outils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class OutilsStringTest {
    @ParameterizedTest(name = "Doit retourner une difference de {0} pour les chaines de caractères {1} et {2}")
    @MethodSource("genererArgumentsPourtest_indexOfDifference")
    void test_indexOfDifference(int excepted, String str1, String str2) {
        assertEquals(excepted, OutilsString.indexOfDifference(str1, str2));
    }

    private static Stream<Arguments> genererArgumentsPourtest_indexOfDifference() {
        return Stream.of(//
                Arguments.of(0, "salut", "salut"), //
                Arguments.of(2, "saLut", "salut"));
    }

    @ParameterizedTest(name = "Doit retourner {0} lrsque que l'on cherche la meilleure occurence pour {1} dans la collection")
    @MethodSource("genererArgumentsPourtest_trouverMeilleureOccurence")
    void test_trouverMeilleureOccurence(String excepted, String input) {
        assertEquals(excepted, OutilsString.trouverLaMeilleurOccurence(COLLECTION, input));
    }

    private static Stream<Arguments> genererArgumentsPourtest_trouverMeilleureOccurence() {
        return Stream.of(//
                Arguments.of("Blois", "Bloi"), //
                Arguments.of(null, "Loir"));
    }

    private static final Collection<String> COLLECTION = Arrays.asList("Grenoble", "Jura", "Lons-le-Saunier", "Landes",
            "Mont-de-Marsan", "Loir-et-Cher", "Blois", "Loire", "Saint-Étienne", "Haute-Loire", "Le Puy-en-Velay",
            "Loire-Atlantique", "Nantes", "Loiret");

}
