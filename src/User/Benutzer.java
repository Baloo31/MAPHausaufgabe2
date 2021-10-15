package User;

import Sports.Sport;
import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sports;

    /*
        Constructor
     */
    public Benutzer(String vorname, String nachname, List<Sport> sports){
        this.vorName = vorname;
        this.nachName = nachname;
        this.sports = sports;
    }

    @Override
    public String toString() {
        return "Benutzer{" +
                "vorName='" + vorName + '\'' +
                ", nachName='" + nachName + '\'' +
                ", sports=" + sports +
                '}';
    }


    /*
    - Kalkuliert die Zeit die ein Benutzer braucht fur treiben seiner Lieblingssports
    Pre: Ein Benutzer mit seiner Liste von Lieblingssports
    Post: Die Zeit die er braucht
     */
    public double kalkuliereZeit(){
        double ganzeZeit = 0;
        for (Sport sport : sports){
            ganzeZeit += sport.kalkuliereZeit();
        }
        return ganzeZeit;
    }


    /*
    - Kalkuliert die Zeit die man fur ein bestimmten Sport braucht
    Pre: Ein Benutzer und ein Sport
    Post: Die Zeit die man fur dieses Sport braucht
     */
    public double kalkuliereZeit(Sport sport){
        return sport.kalkuliereZeit();
    }


    /*
    - Kalkuliert den Durchschnittliche Zeit der Sports aus einer Liste
    Pre: Eun Benutzer mit seine Lieblingssports
    Post: Die Durchschnittzeit der Sports aus dieser Liste
    Throws: Wenn der Benutzer keine Lieblingssports hat
     */
    public double kalkuliereDurchschnittzeit() throws Exception {
        double ganzeZeit = this.kalkuliereZeit();
        if (sports.isEmpty()){
            throw new Exception("Keine Lieblingssports, Durchschnittzeit mach keinem Sinn");
        }
        return ganzeZeit / sports.size();
    }

    public String getNachName() {
        return nachName;
    }

    public String getVorName() {
        return vorName;
    }

    public List<Sport> getSport() {
        return sports;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setSport(List<Sport> sport) {
        this.sports = sport;
    }
}
