package fr.france;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.StringReader;

import com.opencsv.bean.CsvToBeanBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaumuneTest {

    private Caumune caumune;

    @BeforeEach
    void setup() {
        buildCaumune("34000,Montpellier,34000");
    }

    private void buildCaumune(String ligneCsv) {
        StringReader sr = new StringReader(ligneCsv);
        caumune = new CsvToBeanBuilder<Caumune>(sr).withType(Caumune.class).build().parse().get(0);
    }

    @Test
    void test_getCodeINSEE() {
        assertEquals("34000", caumune.getCodeINSEE());
    }

    @Test
    void test_getMontpellier() {
        assertEquals("Montpellier", caumune.getNom());
    }

    @Test
    void test_getCodePostal() {
        assertEquals(34000, caumune.getCodePostal());
    }

    @Test
    void test_getDepartement() {
        assertEquals(Departement.HERAULT, caumune.getDepartement());
    }

    @Test
    void test_getDepartementCorseDuSud() {
        buildCaumune("2A004,Ajaccio,20000");
        assertEquals(Departement.CORSE_DU_SUD, caumune.getDepartement());
    }

    @Test
    void test_getRegion() {
        assertEquals(Region.OCCITANIE, caumune.getRegion());
    }
}
