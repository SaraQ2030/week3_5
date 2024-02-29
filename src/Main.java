import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String vehicleModel ;
        int vehicleTimeRent;
         int stop=0;
        ArrayList<Vehicle> rentedVehicles=new ArrayList<Vehicle>();
             Display d=new Display();


        do{
            System.out.println("Welcome to rental vehicle system ");
            System.out.println("Choose number  :\n"+"1/rent a car  ");
            System.out.println("2/ rent bike ");
            System.out.println("3/ rent Truck ");
            System.out.println("4/ View rented vehicle ");
            System.out.println("5/ Exit ");
            stop=input.nextInt();
            switch (stop){

                case 1:
                    System.out.println("enter car model :");
                    vehicleModel=input.next();

                    System.out.print("enter rental days :");
                    vehicleTimeRent=input.nextInt();

                Vehicle c=new Car(vehicleModel,vehicleTimeRent);
                rentedVehicles.add(c);
                c.displyDetails();
                    break;
                case 2:

                    System.out.println("enter bike brand :");
                    vehicleModel=input.next();

                    System.out.print("enter rental hours :");
                    vehicleTimeRent=input.nextInt();

                    Vehicle b=new Bike(vehicleModel,vehicleTimeRent);
                    rentedVehicles.add(b);
                    b.displyDetails();

                    break;
                case 3:
                    System.out.println("enter truck type :");
                    vehicleModel=input.next();

                    System.out.print("enter rental weeks :");
                    vehicleTimeRent=input.nextInt();

                    Vehicle t=new Truck(vehicleModel,vehicleTimeRent);
                    rentedVehicles.add(t);
                    t.displyDetails();

                    break;
                case 4:
                    for (Vehicle vehicle:rentedVehicles){
                        vehicle.displyDetails();
                        System.out.println("------------------------------------");
                    }
                    break;
                          }

        }while (stop!=5);
        System.out.println("Thank you for using vehicle rental system ");
    }
}