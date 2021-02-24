package fr.france.outils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class OutilsRepertoireCommuneTest {

    @Test
    void test_getRessources() {
        Throwable e = assertThrows(FileNotFoundException.class, () -> OutilsRepertoireCommune.getRessource("noFile"));
        assertEquals("Le fichier contenant les communes n'a pas été trouvé", e.getMessage());
    }

}
