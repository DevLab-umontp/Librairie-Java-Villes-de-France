package fr.france;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DepartementTest {

    @ParameterizedTest(name = "Doit retourner le département {0} lorsque l'on fait une recherche avec le nom {1}")
    @MethodSource("genererArgumentsPourtest_rechercheParNom")
    void test_rechercheParNom(Departement excepted, String input) {
        assertEquals(excepted, Departement.rechercherParNom(input));
    }

    private static Stream<Arguments> genererArgumentsPourtest_rechercheParNom() {
        return Stream.of(//
                Arguments.of(Departement.GUYANE, "guyyane"), //
                Arguments.of(Departement.GUYANE, "guyane"), //
                Arguments.of(Departement.GUYANE, "Guyane"));
    }
}
