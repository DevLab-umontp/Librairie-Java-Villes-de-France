package fr.france.outils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class OutilsGenerauxTest {

    @ParameterizedTest(name = "la chaine de caractères {0} une fois son accentuation supprimé doit être égale à {1}")
    @MethodSource("genererArgumentsPourtest_supprimerAccentuation")
    void test_supprimerAccentuation(String input, String excepted) {
        assertEquals(excepted, OutilsGeneraux.supprimerAccentuation(input));
    }

    private static Stream<Arguments> genererArgumentsPourtest_supprimerAccentuation() {
        return Stream.of(//
                Arguments.of("É", "E"), //
                Arguments.of("1234567890", "1234567890"), //
                Arguments.of("ô", "o"), //
                Arguments.of("à", "a"), //
                Arguments.of("è", "e"), //
                Arguments.of("ç", "c"), //
                Arguments.of("'", "'"), //
                Arguments.of("-", "-"), //
                Arguments.of(" ", " "), //
                Arguments.of("é", "e"));
    }

    @ParameterizedTest(name = "la chaine de caractères {0} une fois formaté doit être égale à {1}")
    @MethodSource("genererArgumentsPourtest_formater_1parametre")
    void test_formater_1parametre(String input, String excepted) {
        assertEquals(excepted, OutilsGeneraux.formater(input));
    }

    private static Stream<Arguments> genererArgumentsPourtest_formater_1parametre() {
        return Stream.of(//
                Arguments.of("", ""), //
                Arguments.of("test", "test"), //
                Arguments.of("D'Orge", "dorge"), //
                Arguments.of("D Orge", "dorge"), //
                Arguments.of("TeEsT", "teest"), //
                Arguments.of("Téèçà", "teeca"), //
                Arguments.of("ÉÈÇÀ", "eeca"), //
                Arguments.of("test   t@°0245est", "testtest"));
    }
}
