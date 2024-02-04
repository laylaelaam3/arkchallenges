package ma.arkAcademy.week2.day6.Vehicle;

public class Vehicle {
    private String make,model;
    private int rentalPrice;
    public Vehicle(String make,String model,int rentalPrice){
        this.make=make;
        this.model=model;
        this.rentalPrice=rentalPrice;
    }

    public int getRentalPrice() {

        return rentalPrice;
    }
    public void setRentalPrice(int rentalprice){
       this.rentalPrice=rentalPrice;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    }

