package fr.france;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CaumuneTest {

    private Caumune caumune;

    @BeforeAll
    void setup() {
        StringReader sr = new StringReader("34000,Montpellier,34000");
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
}
