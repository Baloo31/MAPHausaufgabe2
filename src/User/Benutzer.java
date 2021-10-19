/**
 * Benutzer
 *
 * Lieblingssports Time Management
 *
 * 19.10.2021
 */

package User;

import Sports.Sport;
import java.util.List;

public class Benutzer {

    private String vorName;
    private String nachName;
    private List<Sport> sports;

    /**
     * Constructor
     * @param vorname Vorname einer Benutzer
     * @param nachname Nachname einer Benutzer
     * @param sports Liste von Lieblingssports einer Benutzer
     */
    public Benutzer(String vorname, String nachname, List<Sport> sports){
        this.vorName = vorname;
        this.nachName = nachname;
        this.sports = sports;
    }

    /**
     * String Method
     * @return string einer Instanz von Benutzer
     */
    @Override
    public String toString() {
        return "Benutzer{" +
                "vorName='" + vorName + '\'' +
                ", nachName='" + nachName + '\'' +
                ", sports=" + sports +
                '}';
    }

    /**
     * Kalkuliert die Zeit die ein Benutzer braucht fur treiben seiner Lieblingssports
     * @return Die Zeit die er braucht
     */
    public double kalkuliereZeit(){
        double ganzeZeit = 0;
        for (Sport sport : sports){
            ganzeZeit += sport.kalkuliereZeit();
        }
        return ganzeZeit;
    }

    /**
     * Kalkuliert die Zeit die man fur ein bestimmten Sport braucht
     * @param sport Ein konkreter Sport
     * @return Die Zeit die man fur dieses Sport braucht
     */
    public double kalkuliereZeit(Sport sport){
        return sport.kalkuliereZeit();
    }

    /**
     * Kalkuliert den Durchschnittliche Zeit der Sports aus einer Liste
     * @return Die Durchschnittzeit der Sports aus dieser Liste
     * @throws Exception Wenn der Benutzer keine Lieblingssports hat
     */
    public double kalkuliereDurchschnittzeit() throws Exception {
        double ganzeZeit = this.kalkuliereZeit();
        if (sports.isEmpty()){
            throw new Exception("Keine Lieblingssports, Durchschnittzeit mach keinem Sinn");
        }
        return ganzeZeit / sports.size();
    }

    /**
     * Getter fur Nachname
     * @return Nachname des Benutzers
     */
    public String getNachName() {
        return nachName;
    }

    /**
     * Getter fur Vorname
     * @return Vorname des Benutzers
     */
    public String getVorName() {
        return vorName;
    }

    /**
     * Getter fur die Liste von Lieblingssports
     * @return Liste von Lieblingssports des Benutzers
     */
    public List<Sport> getSport() {
        return sports;
    }

    /**
     * Setter fur die Nachname des Benutzers
     * @param nachName Neuer Nachname
     */
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    /**
     * Setter fur die Vorname des Benutzers
     * @param vorName Neuer Vorname
     */
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    /**
     * Setter fur die Liste von Lieblingssports
     * @param sport Neue Liste von Lieblingssports
     */
    public void setSport(List<Sport> sport) {
        this.sports = sport;
    }
}
