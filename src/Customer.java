public class Customer {
    private String cust_name;
    private int phoneNumber;
    private String rentedVehicle;

    Customer(String cust_name, int phoneNumber, String rentedVehicle)
    {
        this.cust_name= cust_name;
        this.phoneNumber=phoneNumber;
        this.rentedVehicle=rentedVehicle;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCust_name() {
        return cust_name;
    }

    public String getRentedVehicle() {
        return rentedVehicle;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRentedVehicle(String rentedVehicle) {
        this.rentedVehicle = rentedVehicle;
    }

    public void displayDetails() {
        System.out.println("Name: " + getCust_name());
        System.out.println("Phone: " + getPhoneNumber());
        System.out.println("Rented vehicle"+getRentedVehicle());
    }

}
