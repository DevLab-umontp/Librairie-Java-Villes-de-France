package fr.france.outils;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Collections;

import org.junit.jupiter.api.Test;

import fr.france.RepertoireCaumune;

class RepertoireCaumuneTest {

    @Test
    void test_CaumunesInitialise() {
        assertNotEquals(Collections.emptyList(), RepertoireCaumune.getCaumunes());
    }

}
