package Sports.Mannschaftssport;

import Sports.Sport;

public abstract class Mannschaftssport implements Sport {

    /* Kalkuliert die Zeit die man fur einem Mannschaftssport braucht */
    @Override
    public abstract double kalkuliereZeit();
}
