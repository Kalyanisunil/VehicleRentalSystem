public class Vehicle {
    private String brand;
    private String model;
    private double rentPerDay;
    private boolean isAvilable;
    Vehicle(String brand,String model,double rentPerDay,boolean isAvilable)
    {
        this.brand=brand;
        this.model=model;
        this.rentPerDay=rentPerDay;
        this.isAvilable=true;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public boolean isAvailable() {
        return isAvilable;
    }

    public void setAvilable(boolean avilable) {
        isAvilable = avilable;
    }

    public void displayInfo()
    {
        System.out.print("Brand: "+getBrand()+" Model: "+getModel()+" Rent/day: "+getRentPerDay());
        System.out.println();
    }
}
