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

    @Test
    void checkTijdsduur() {
        // de code is geschreven met gebruik van scanners, hierdoor zijn de testen iets wat lastiger
        // te begrijpen misschien, aangezien ik hier andere methodes voor hem aangemaakt om de scanners te omzeilen
        katoenProgramma katoenProgramma = new katoenProgramma();
        katoenProgramma.bepaalTijdsduur(1);
        katoenProgramma.setTijdsduurKort();
        katoenProgramma.setExtraWater();
        assertEquals(30, katoenProgramma.getTijdsduur());

        wolProgramma wolProgramma = new wolProgramma();
        wolProgramma.bepaalTijdsduur(1);
        // voor wol alsnog kortProgramma(), want wol heeft altijd een kort programma in dit programma! zie onder
        wolProgramma.kortProgramma();
        //geen extra water, dus wordt niet aangeroepen (wordt in code gedaan met scanner)
        assertEquals(30, wolProgramma.getTijdsduur());

        katoenProgramma katoenProgramma1 = new katoenProgramma();
        katoenProgramma1.bepaalTijdsduur(4);
        // geen kort programma dus er wordt niks aangeroepen... namelijk scanners in code
        // geen extra water dus er wordt niks aangeroepen... namelijk scanners in code
        assertEquals(45, katoenProgramma1.getTijdsduur());

        wolProgramma wolProgramma1 = new wolProgramma();
        wolProgramma1.bepaalTijdsduur(4);
        wolProgramma1.kortProgramma();
        wolProgramma1.setExtraWater();
        assertEquals(30, wolProgramma1.getTijdsduur());

        katoenProgramma katoenProgramma2 = new katoenProgramma();
        katoenProgramma2.bepaalTijdsduur(6);
        // geen kort programma dus er wordt niks aangeroepen... namelijk scanners in code
        katoenProgramma2.setExtraWater();
        assertEquals(60, katoenProgramma2.getTijdsduur());

        wolProgramma wolProgramma2 = new wolProgramma();
        wolProgramma2.bepaalTijdsduur(6);
        wolProgramma2.kortProgramma();
        assertEquals(30, wolProgramma2.getTijdsduur());
    }
}