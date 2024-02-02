package ma.arkAcademy.week2.EncapsulationInheritancePolymorphism.Vehicle;

import ma.arkAcademy.week2.EncapsulationInheritancePolymorphism.Vehicle.Bike;
import ma.arkAcademy.week2.EncapsulationInheritancePolymorphism.Vehicle.Car;
import ma.arkAcademy.week2.EncapsulationInheritancePolymorphism.Vehicle.RentalAgency;

public class MainRentalAgency {
    public static void main(String[] args) {
        RentalAgency rentalAgency=new RentalAgency();
        Car car1 = new Car("Maseraty", " Granturismo", 100, "Luxury");
        Car car2 = new Car("Honda", "Accord", 60,  "Mid-range");
        Bike bike1 = new Bike("Trek", "Mountain Bike", 20, "Mountain");
        Bike bike2 = new Bike("Giant", "Road Bike", 30, "Road");
        rentalAgency.addVehicule(car1);
        rentalAgency.addVehicule(car2);
        rentalAgency.addVehicule(bike1);
        rentalAgency.addVehicule(bike2);
        rentalAgency.displayAvailableVehicles();
        rentalAgency.rentVehicule(car1);
        rentalAgency.rentVehicule(car1);
        rentalAgency.displayAvailableVehicles();

    }
}
