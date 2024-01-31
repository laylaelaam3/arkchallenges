package ma.arkAcademy.week2.day6;

import java.util.ArrayList;

public class RentalAgency {
    private ArrayList<Vehicle> fleet;

    public RentalAgency() {
        fleet = new ArrayList<>();
    }
    public void addVehicule(Vehicle vehicle){
        fleet.add(vehicle);
    }
    public void rentVehicule(Vehicle vehicle){
        if (fleet.contains(vehicle)){
            fleet.remove(vehicle);
            System.out.println("vehicle rented Successfully");
        }else {
            System.out.println("vehicle is not found in the fleet");
        }
    }
    public void displayAvailableVehicles(){
            System.out.println("Available Vehicles:");
            for (Vehicle vehicle : fleet) {
                System.out.println(vehicle.getMake()+" "+vehicle.getModel());
            }
        }

    }

