package Applicatiepackage;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammaTest {

    @Test
    void geldigeWas() {
        Was was1 = new Was(10, "wit", "materiaal");
        Was was2 = new Was(-1, "wit", "materiaal");
        Was was3 = new Was(-1, "wit", "katoen");
        Was was4 = new Was(5, "wit", "katoen");
        assertFalse(was1.geldigeWas());
        assertFalse(was2.geldigeWas());
        // bij de assertFalse hieronder; bij gewicht -1 ingevoerd,
        // want kan niet false zijn  bij voorwaarde B en C tegelijk eigenlijk
        assertFalse(was3.geldigeWas());
        assertTrue(was4.geldigeWas());
    }

    @Test
    void bepaalTijdsduur() {
        katoenProgramma programma = new katoenProgramma();
        katoenProgramma programma1 = new katoenProgramma();
        katoenProgramma programma2 = new katoenProgramma();
        katoenProgramma programma3 = new katoenProgramma();
        katoenProgramma programma4 = new katoenProgramma();
        katoenProgramma programma5 = new katoenProgramma();
        katoenProgramma programma6 = new katoenProgramma();
        katoenProgramma programma7 = new katoenProgramma();
        programma.bepaalTijdsduur(0);
        programma1.bepaalTijdsduur(1);
        programma2.bepaalTijdsduur(2);
        programma3.bepaalTijdsduur(3);
        programma4.bepaalTijdsduur(4);
        programma5.bepaalTijdsduur(5);
        programma6.bepaalTijdsduur(6);
        programma7.bepaalTijdsduur(7);
        assertEquals(0, programma.getTijdsduur());
        assertEquals(30, programma1.getTijdsduur());
        assertEquals(30, programma2.getTijdsduur());
        assertEquals(45, programma3.getTijdsduur());
        assertEquals(45, programma4.getTijdsduur());
        assertEquals(45, programma5.getTijdsduur());
        assertEquals(60, programma6.getTijdsduur());
        assertEquals(60, programma7.getTijdsduur());
    }
}