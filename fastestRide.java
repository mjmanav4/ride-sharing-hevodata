package strategy;

import model.ride;

import java.util.Comparator;

public class fastestRide implements Comparator<ride> {
    public int compare(ride a,ride b){
        return a.getRide_duration()-b.getRide_duration();//ascending
    }

}
