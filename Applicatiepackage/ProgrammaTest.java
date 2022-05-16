package Applicatiepackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammaTest {

    @Test
    void weigerWasprogramma() {
        Programma programma = new katoenProgramma();
        assertFalse(programma.weigerWasprogramma("wol", 10));
        assertFalse(programma.weigerWasprogramma("wol", 1));
        // bij de assertFalse hieronder; bij gewicht 0 ingevoerd,
        // want kan niet false zijn  bij voorwaarde B en C tegelijk eigenlijk
        assertFalse(programma.weigerWasprogramma("wol", 0));
        assertTrue(programma.weigerWasprogramma("katoen", 5));
    }
}