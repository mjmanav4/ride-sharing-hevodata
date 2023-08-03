package strategy;

import model.ride;

import java.util.Collections;
import java.util.List;

public class FastRideStrategy implements  RideSelectionStrategy{
    @Override
    public List<ride> process(List<ride> rideList) {
        Collections.sort(rideList, new fastestRide());
        return rideList;
    }
}
