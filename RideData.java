package dao;

import model.ride;
import model.user;

import java.util.ArrayList;
import java.util.List;

public class RideData {

    public static List<ride> allOffers = new ArrayList<ride>();

    public static void addRide(ride r){
        allOffers.add(r);
    }


    public static List<ride> getAllAvailableRidesWithSourceAndDestinationForUser(user u, String Source, String Destination){
        List<ride>specifiedRide = new ArrayList<ride>();
        for(ride r:allOffers) {
            //	should not have same user
            // should be having same source and destination
            //should have available seats
            if(!(u.getIds().equals(r.getRideUser().getIds())) && r.getOrigin().equals(Source) && r.getDestination().equals(Destination) && r.getAvailable_seats()!=0) {
                specifiedRide.add(r);
            }
        }
        return specifiedRide;
    }
}
