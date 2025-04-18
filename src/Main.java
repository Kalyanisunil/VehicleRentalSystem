import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicleList=new ArrayList<>();
        List<Customer>customerList=new ArrayList<>();
        Vehicle v1=new Vehicle("Toyota","Corolla",2500,true);
        Vehicle v2=new Vehicle("Toyota","Innova",5500,true);
        Vehicle v3=new Vehicle("Toyota","Fortuner",8500,true);
        Vehicle v4=new Vehicle("Hyundai","Elantra",2500,true);
        Vehicle v5=new Vehicle("Hyundai","Verna",4500,true);
        Vehicle v6=new Vehicle("Hyundai","Creta",5500,true);
        Vehicle v7=new Vehicle("Yamaha","R15",6000,true);

        vehicleList.addAll(Arrays.asList(v1,v2,v3,v4,v5,v6,v7));
        Scanner sc=new Scanner(System.in);
    while (true)
    {


        System.out.println("Welcome to Vehicle Rental System");
        System.out.println("Press 1 to proceed:");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("These are the available vehicles:");
                List<Vehicle> availableVehicles = new ArrayList<>();
                for (Vehicle v : vehicleList) {
                    if (v.isAvailable()) {
                        availableVehicles.add(v);
                    }
                }
               for(Vehicle v:availableVehicles)
               {
                   v.displayInfo();
               }
                System.out.println("Press 2 if you want to proceed:");
                int isProceed = sc.nextInt();
                sc.nextLine();
                if (isProceed == 2) {
                    System.out.println("Please provide your name: ");
                    String name = sc.nextLine();
                    System.out.println("Please provide your phone number");
                    int phone = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Are these details correct?:");
                    System.out.println(name + " " + phone);
                    System.out.println("Thank you " + name + "!");
                }
                System.out.println("Please select the vehicle you want to rent from the list below");

                for (int i = 0; i < availableVehicles.size(); i++) {
                    System.out.print((i + 1) + ". ");
                    availableVehicles.get(i).displayInfo();
                }
                System.out.println("Please select from the options above:");
                int userInput = sc.nextInt();
                Vehicle selected = availableVehicles.get(userInput - 1);

                System.out.println("Your chose vehicle details:");
                selected.displayInfo();

//
                selected.setAvilable(false);
            case 2:
                System.out.println("Thank you for visiting!");
//                return;
                break;
//                or use break if you are using an outer loop
            default:
                System.out.println("Invalid choice! Please try again.");
        }

    }

    }
}