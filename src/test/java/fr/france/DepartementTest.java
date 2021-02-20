package fr.france;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItem;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
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

    @ParameterizedTest(name = "Doit retourner le département {0} lorsque l'on fait une recherche avec le code {1}")
    @MethodSource("genererArgumentsPourtest_rechercheParCode")
    void test_rechercheParCode(Departement excepted, int input) {
        assertEquals(excepted, Departement.rechercherParCode(input));
    }

    private static Stream<Arguments> genererArgumentsPourtest_rechercheParCode() {
        return Stream.of(//
                Arguments.of(Departement.COTE_D_OR, 21), //
                Arguments.of(Departement.HERAULT, 34), //
                Arguments.of(Departement.HERAULT, 34000), //
                Arguments.of(null, -1), //
                Arguments.of(null, 294385), //
                Arguments.of(Departement.GUYANE, 973));
    }

    @Test
    void test_rechercheCorseDuSud() {
        assertEquals(Departement.CORSE_DU_SUD, Departement.rechercherParCode("2A"));
    }

    @Test
    void test_rechercheHauteCorse() {
        assertEquals(Departement.HAUTE_CORSE, Departement.rechercherParCode("2B"));
    }

    @Test
    void test_getCaumunes() {
        List<Caumune> caumunesHerault = Departement.HERAULT.getCaumunes();
        assertThat(caumunesHerault, hasItem(RepertoireCaumune.rechercherParNomEtCodePostal("Montpellier", 34000)));
    }
}
