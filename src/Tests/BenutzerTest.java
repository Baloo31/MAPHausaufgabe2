package Tests;

import Sports.Leichtathletik.Hindernislauf;
import Sports.Leichtathletik.Hochsprung;
import Sports.Mannschaftssport.Basketball;
import Sports.Mannschaftssport.Fussball;
import Sports.Sport;
import User.Benutzer;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

public class BenutzerTest {
    private Benutzer benutzer1;
    private Benutzer benutzer2;
    private Benutzer benutzer3;
    private Benutzer benutzer4;

    /*
        Benutzer1:
        - 2 fussball
        - 2 basketball
        - 1 hindernislauf
        - 1 hochsprung
        Benutzer2:
        - 1 hindernislauf
        - 1 hochsprung
        Benutzer3:
        - 2 fussball
        - 1 hindernislauf
        Benutzer4:
        leer
     */

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Sport fussball1 = new Fussball();
        Sport basketball1 = new Basketball();
        Sport hindernislauf1 = new Hindernislauf();
        Sport hochsprung1 = new Hochsprung();
        Sport fussball2 = new Fussball();
        Sport basketball2 = new Basketball();
        benutzer1 = new Benutzer("Andrei", "Balu",
                Arrays.asList(fussball1, fussball2, basketball2, basketball1, hindernislauf1, hochsprung1));

        benutzer2 = new Benutzer("Vorname", "Nachname",
                Arrays.asList(hindernislauf1, hochsprung1));
        benutzer3 = new Benutzer("Zlatan", "Ibrahimovic",
                Arrays.asList(fussball1, fussball2, hindernislauf1));
        benutzer4 = new Benutzer("Fat", "Man", new ArrayList<>());
    }

    @org.junit.jupiter.api.Test
    public void kalkuliereZeit() {
        // 55 + 55 + 65 + 65 + 30 + 20 = 290 (Zeit)
        Assertions.assertEquals(290,benutzer1.kalkuliereZeit());

        // 30 + 20 = 50
        Assertions.assertEquals(50, benutzer2.kalkuliereZeit());

        // 65 + 65 + 30 = 160
        Assertions.assertEquals(160, benutzer3.kalkuliereZeit());

        // 0
        Assertions.assertEquals(0, benutzer4.kalkuliereZeit());
    }

    @org.junit.jupiter.api.Test
    public void testKalkuliereZeit() {

        Fussball fussball = new Fussball();
        Basketball basketball = new Basketball();
        Hindernislauf hindernislauf = new Hindernislauf();
        Hochsprung hochsprung = new Hochsprung();

        Assertions.assertEquals(65, benutzer1.kalkuliereZeit(fussball));
        Assertions.assertEquals(55, benutzer2.kalkuliereZeit(basketball));
        Assertions.assertEquals(30, benutzer3.kalkuliereZeit(hindernislauf));
        Assertions.assertEquals(20, benutzer1.kalkuliereZeit(hochsprung));
    }

    @org.junit.jupiter.api.Test
    public void kalkuliereDurchschnittzeit() {

        try {
            Assertions.assertEquals(290/(double) 6, benutzer1.kalkuliereDurchschnittzeit());
        } catch (Exception exception) {
            Assertions.fail();
        }

        try {
            Assertions.assertEquals(160/(double) 3, benutzer3.kalkuliereDurchschnittzeit());
        } catch (Exception exception) {
            Assertions.fail();
        }

        try {
            Assertions.assertEquals(25, benutzer2.kalkuliereDurchschnittzeit());
        } catch (Exception exception){
            Assertions.fail();
        }

        try {
            benutzer4.kalkuliereDurchschnittzeit();
            Assertions.fail();
        } catch (Exception exception){
            Assertions.assertTrue(true);
        }
    }
}
