public class Car implements Vehicle{
    public String model;
    public int day;

    public Car(String model, int day) {
        this.model = model;
        this.day = day;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public double calculateRentalCost() {
        return day*50 ;
    }

    @Override
    public void displyDetails() {
        System.out.println("Entered car model :"+model);
        System.out.println("Daily rental rate :"+ 50 +"  Dollar");
        System.out.println("rental cost :"+ calculateRentalCost() +"  Dollar");


    }
}
