package User;

import Sports.Sport;
import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sports;

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

    public double kalkuliereZeit(){
        double ganzeZeit = 0;
        for (Sport sport : sports){
            ganzeZeit += sport.kalkuliereZeit();
        }
        return ganzeZeit;
    }

    public double kalkuliereZeit(Sport sport){
        return sport.kalkuliereZeit();
    }

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
