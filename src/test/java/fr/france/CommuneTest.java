package fr.france;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.StringReader;

import com.opencsv.bean.CsvToBeanBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommuneTest {

    private Commune Commune;

    @BeforeEach
    void setup() {
        buildCommune("34172,Montpellier,34000,43.6134409138,3.86851657896");
    }

    private void buildCommune(String ligneCsv) {
        StringReader sr = new StringReader(ligneCsv);
        Commune = new CsvToBeanBuilder<Commune>(sr).withType(Commune.class).build().parse().get(0);
    }

    @Test
    void test_getCodeINSEE() {
        assertEquals("34172", Commune.getCodeINSEE());
    }

    @Test
    void test_getMontpellier() {
        assertEquals("Montpellier", Commune.getNom());
    }

    @Test
    void test_getCodePostal() {
        assertEquals(34000, Commune.getCodePostal());
    }

    @Test
    void test_getLocalisation() {
        Localisation localisation = new Localisation(43.6134409138d, 3.86851657896d);
        assertEquals(localisation.getLatitude(), Commune.getLocalisation().getLatitude());
        assertEquals(localisation.getLongitude(), Commune.getLocalisation().getLongitude());
    }

    @Test
    void test_getDepartement() {
        assertEquals(Departement.HERAULT, Commune.getDepartement());
    }

    @Test
    void test_getDepartementCorseDuSud() {
        buildCommune("2A004,Ajaccio,20000");
        assertEquals(Departement.CORSE_DU_SUD, Commune.getDepartement());
    }

    @Test
    void test_getRegion() {
        assertEquals(Region.OCCITANIE, Commune.getRegion());
    }
}
