package ma.arkAcademy.week2.day6.Vehicle;

public class Car extends Vehicle {
    private String VehicleRange;
    public Car(String make,String model,int rentalPrice,String VehicleRange){
        super(make, model, rentalPrice);
        this.VehicleRange=VehicleRange;
    }

    public String getVehicleRange() {
        return VehicleRange;
    }
}
