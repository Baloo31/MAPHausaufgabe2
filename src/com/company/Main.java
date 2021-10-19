package com.company;

import Sports.Leichtathletik.Hochsprung;
import Sports.Mannschaftssport.Fussball;
import Sports.Sport;
import User.Benutzer;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Zwei Sport Sessionen
        Sport fussball = new Fussball();
        Sport hochsprung = new Hochsprung();

        // Ein Benutzer
        Benutzer benutzer = new Benutzer("x","y",Arrays.asList(fussball, hochsprung));
        benutzer.setNachName("Balu");
        benutzer.setVorName("Andrei");
        System.out.println("User: " + benutzer.getNachName() + ' ' + benutzer.getVorName());
        System.out.println(benutzer);


        // Durchschnittzeit fur treiben der Sports aus seiner Stundenplan
        try{
            System.out.println(benutzer.kalkuliereDurchschnittzeit());
        } catch (Exception exception){
            Assertions.fail();
        }

        // Die totale Zeit die er fur treiben der Sports aus der Stundenplan braucht
        System.out.println(benutzer.kalkuliereZeit());

        // Die Zeit die er fur treiben einer Fussball Session braucht
        System.out.println(benutzer.kalkuliereZeit(fussball));
    }
}
