package strategy;

import model.ride;

import java.util.List;

public interface RideSelectionStrategy {
    List<ride>  process(List<ride> rideList);
}
