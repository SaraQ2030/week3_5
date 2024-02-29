public class Bike implements Vehicle{
    public String brand;
    public int hour;

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hour*10 ;
    }

    @Override
    public void displyDetails() {
        System.out.println("Entered Bike brand :"+brand);
        System.out.println(" rental rate :"+ 10 +"  Dollar");
        System.out.println("rental cost :"+ calculateRentalCost() +"  Dollar");



    }
}
