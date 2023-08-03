import model.ride;
import model.user;
import model.vehicle;
import service.rideService;
import service.userService;

public class Main {
    public static void main(String[] args) {




        user u1 =userService.createUser("Rohan", 36, 'M');


        vehicle v1 =userService.addVehicle(u1,"Rohan","Swift","KA-01-12345");




        user u2 =userService.createUser("Shashank", 29, 'M');
        vehicle v2 = userService.addVehicle(u2,"Shashank", "Baleno", "TS-05-62395");


        user u3 =userService.createUser("Nandani", 29, 'F');


        //create user Shipra
        user u4 =userService.createUser("Shipra", 27, 'F');
        vehicle v41 = userService.addVehicle(u4,"Shipra", "Polo", "KA-05-41491");
        vehicle v42 = userService.addVehicle(u4,"Shipra", "Scooty", "KA-12-12332");


        user u5 = userService.createUser("Gaurav", 29, 'M');




        ride r1 = rideService.offerRide("Rohan", "KA-01-12345", 1, "Hyderabad", "Bangalore", "25 Jan, 2019 08",13);

        ride r2 = rideService.offerRide("Shipra", "KA-12-12332", 2, "Bangalore", "Mysore", "29 Jan, 2019 18",10);


        ride r3 = rideService.offerRide("Shipra","KA-05-41491", 2, "Bangalore", "Mysore", "30 Jan, 2019 18",4);

        //offer ride Shashank
        ride r4 = rideService.offerRide("Shashank", "TS-05-62395", 2, "Hyderabad", "Bangalore", "27 Jan, 2019 10",14);



        //select ride nandani
        ride rs1 = rideService.selectRide("Nandani", "Bangalore", "Mysore", "Fastest_Ride");

        //select ride gaurav
        ride rs2 = rideService.selectRide("Gaurav", "Bangalore", "Mysore", "Earliest_Ride");

        //select ride shashank
        ride rs3 = rideService.selectRide("Shashank", "Bangalore", "Mysore", "Fastest_Ride");

        //select ride Rohan
        ride rs4= rideService.selectRide("Rohan", "Hyderabad", "Bangalore", "Fastest_Ride");


        System.out.println();
        //getTotalFuelSavedByUsers
        rideService.fuelSavedByUser();


        System.out.println();

        //Find Total Rides by user
        rideService.totalRidesByUser();



    }
}