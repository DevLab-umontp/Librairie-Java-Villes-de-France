package fr.france.outils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import fr.france.Region;

class OutilsRegionTest {
    @ParameterizedTest(name = "Doit retourner la région {0} lorsque l'on fait une recherche avec le nom {1}")
    @MethodSource("genererArgumentsPourtest_rechercheParNom")
    void test_rechercheParNom(Region excepted, String input) {
        assertEquals(excepted, OutilsRegion.rechercheParNom(input));
    }

    private static Stream<Arguments> genererArgumentsPourtest_rechercheParNom() {
        return Stream.of(//
                Arguments.of(Region.AUVERGNE_RHONE_ALPES, "Auvergne rhone aples"), //
                Arguments.of(null, "cote"), //
                Arguments.of(null, ""), //
                Arguments.of(Region.AUVERGNE_RHONE_ALPES, "Auvergne rhones aples"), //
                Arguments.of(Region.GUYANE, "guyane"), //
                Arguments.of(Region.GUYANE, "Guyane"));
    }
}
