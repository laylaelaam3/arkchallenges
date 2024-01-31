package ma.arkAcademy.week2.day6;

public class Bike extends Vehicle {
    private String BicycleType;

    public Bike(String make, String model, int rentalPrice, String bicycleType) {
        super(make, model, rentalPrice);
        BicycleType = bicycleType;
    }

    public String getBicycleType() {
        return BicycleType;
    }
}