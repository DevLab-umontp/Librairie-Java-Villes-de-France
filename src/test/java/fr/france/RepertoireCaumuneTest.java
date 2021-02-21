package fr.france;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class RepertoireCommuneTest {

    @Test
    void test_CommunesInitialise() {
        assertNotEquals(Collections.emptyList(), RepertoireCommune.getCommunes());
    }

    @Test
    void test_CommunesInitialiseNonNull() {
        List<Commune> Communes = RepertoireCommune.getCommunes();
        assertNotNull(Communes.get(1).getNom());
        assertNotNull(Communes.get(1).getCodeINSEE());
        assertNotEquals(0, Communes.get(1).getCodePostal());
    }

    @Test
    void test_RechercherParCodePostal() {
        assertEquals(2, RepertoireCommune.rechercherParCodePostal(84450).size());
    }

    @Test
    void test_RechercherParNom() {
        assertEquals(1, RepertoireCommune.rechercherParNom("St saturnin les avignon").size());
    }

    @Test
    void test_RechercherParNomEtCodePostal() {
        assertNotNull(RepertoireCommune.rechercherParNomEtCodePostal("Montpellier", 34000));
    }

}
