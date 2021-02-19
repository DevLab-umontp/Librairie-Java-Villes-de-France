package fr.france.outils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import fr.france.Caumune;
import fr.france.RepertoireCaumune;

class RepertoireCaumuneTest {

    @Test
    void test_CaumunesInitialise() {
        assertNotEquals(Collections.emptyList(), RepertoireCaumune.getCaumunes());
    }

    @Test
    void test_CaumunesInitialiseNonNull() {
        List<Caumune> caumunes = RepertoireCaumune.getCaumunes();
        assertNotNull(caumunes.get(1).getNom());
        assertNotNull(caumunes.get(1).getCodeINSEE());
        assertNotEquals(0, caumunes.get(1).getCodePostal());
    }

    @Test
    void test_RechercherParCodePostal() {
        assertEquals(2, RepertoireCaumune.rechercherParCodePostal(84450).size());
    }

    @Test
    void test_RechercherParNom() {
        assertEquals(1, RepertoireCaumune.rechercherParNom("St saturnin les avignon").size());
    }

    @Test
    void test_RechercherParNomEtCodePostal() {
        assertNotNull(RepertoireCaumune.rechercherParNomEtCodePostal("Montpellier", 34000));
    }

}
