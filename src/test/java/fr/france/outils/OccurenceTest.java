package fr.france.outils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class OccurenceTest {
    @ParameterizedTest(name = "Doit retourner {0} lorsque l'on récupére la différence de l'occure {1}")
    @MethodSource("genererArgumentsPourtest_getDifference")
    void test_getDifference(int excepted, Occurence ocr1) {
        assertEquals(excepted, ocr1.getDifference());
    }

    private static Stream<Arguments> genererArgumentsPourtest_getDifference() {
        return Stream.of(//
                Arguments.of(-2, new Occurence("saput", "salut")), //
                Arguments.of(0, new Occurence("saput", "")), //
                Arguments.of(0, new Occurence("salut", "salut")));
    }
}
