package fr.france.outils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RepertoireGeneriqueTest {

    private static final RepertoireGenerique<EnumExemple> REPERTOIRE = new RepertoireGenerique<>(EnumExemple.class);

    @ParameterizedTest(name = "Doit retourner {0} lorsque que l'on fait une rechercher avec le nom {1}")
    @MethodSource("genererArgumentsPourtest_rechercherParNom")
    void test_rechercherParNom(EnumExemple excepted, String nom) {
        assertEquals(excepted, REPERTOIRE.rechercherParNom(nom));
    }

    private static Stream<Arguments> genererArgumentsPourtest_rechercherParNom() {
        return Stream.of(//
                Arguments.of(EnumExemple.MICHEL, "mich"), //
                Arguments.of(EnumExemple.PATRI, "patri"), //
                Arguments.of(null, "patr"));
    }

}

enum EnumExemple {
    PATRICK, PATRI, JEAN, MICHEL
}