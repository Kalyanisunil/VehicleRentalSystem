public class Bike extends Vehicle{

    private String type;
    private boolean helmetIncluded;

    Bike(String brand,String model,double rentPerDay,boolean isAvilable,String type,boolean helmetIncluded)
    {
        super(brand,model,rentPerDay,isAvilable);
        this.helmetIncluded=helmetIncluded;
        this.type=type;
    }

    public boolean isHelmetIncluded() {
        return helmetIncluded;
    }

    public void setHelmetIncluded(boolean helmetIncluded) {
        this.helmetIncluded = helmetIncluded;
    }
    public String getType()
    {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Helmet included:"+isHelmetIncluded()+"Type:"+getType());
    }
}
