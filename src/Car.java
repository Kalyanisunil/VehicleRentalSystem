public class Car extends  Vehicle{
    private int seatingCapacity;
    private String fuelType;
    Car(String brand,String model,double rentPerDay,boolean isAvilable,String fuelType,int seatingCapacity){
        super(brand,model,rentPerDay,isAvilable);
        this.fuelType=fuelType;
        this.seatingCapacity=seatingCapacity;

    }

    public String getFuelType() {
        return fuelType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = Integer.parseInt(seatingCapacity);
        return 0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seating capacity:"+getSeatingCapacity()+"Fuel type:"+getFuelType());
    }
}
