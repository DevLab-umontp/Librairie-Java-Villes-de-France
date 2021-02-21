package fr.france;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RegionTest {

    @Test
    void test_getDepartements() {
        for (Region region : Region.values()) {
            assertThat(getDepartementsFiltrePar(region), containsInAnyOrder(region.getDepartements().toArray(new Departement[0])));
        }
    }

    private List<Departement> getDepartementsFiltrePar(Region region) {
        List<Departement> result = new ArrayList<>();
        for (Departement dep : Departement.values())
            if (dep.getRegion().equals(region))
                result.add(dep);
        return result;
    }

    @ParameterizedTest(name = "Doit retourner la région {0} lorsque l'on fait une recherche avec le nom {1}")
    @MethodSource("genererArgumentsPourtest_rechercheParNom")
    void test_rechercheParNom(Region excepted, String input) {
        assertEquals(excepted, Region.rechercherParNom(input));
    }

    private static Stream<Arguments> genererArgumentsPourtest_rechercheParNom() {
        return Stream.of(//
                Arguments.of(Region.GUADELOUPE, "guadeeloup"), //
                Arguments.of(Region.GUADELOUPE, "guadeloupe"), //
                Arguments.of(Region.PROVENCE_ALPES_COTE_D_AZUR, "provencealpescotedazure"), //
                Arguments.of(Region.GUADELOUPE, "Guadeloupe"));
    }

    @Test
    void test_getCaumunes() {
        List<Caumune> excepted = new ArrayList<>();
        excepted.addAll(Departement.ALPES_DE_HAUTES_PROVENCE.getCaumunes());
        excepted.addAll(Departement.HAUTES_ALPES.getCaumunes());
        excepted.addAll(Departement.ALPES_MARITIMES.getCaumunes());
        excepted.addAll(Departement.BOUCHES_DU_RHONE.getCaumunes());
        excepted.addAll(Departement.VAR.getCaumunes());
        excepted.addAll(Departement.VAUCLUSE.getCaumunes());
        assertThat(excepted,  containsInAnyOrder(Region.PROVENCE_ALPES_COTE_D_AZUR.getCaumunes().toArray(new Caumune[0])));
    }

}
