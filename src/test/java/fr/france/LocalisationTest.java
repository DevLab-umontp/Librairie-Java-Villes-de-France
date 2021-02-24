package fr.france;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LocalisationTest {

    private Localisation localisation = new Localisation(43.6134409138d, 3.86851657896d);

    @Test
    void test_getLatitude() {
        assertEquals(43.6134409138d, localisation.getLatitude());
    }

    @Test
    void test_getLongitude() {
        assertEquals(3.86851657896d, localisation.getLongitude());
    }
}
