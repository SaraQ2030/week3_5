public class Truck implements Vehicle{
    public String type;
    public int week;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return week*500 ;
    }

    @Override
    public void displyDetails() {
        System.out.println("Entered Truck type :"+type);
        System.out.println("Weekly rental rate :"+ 500 +"  Dollar");
        System.out.println("rental cost :"+ calculateRentalCost() +"  Dollar");



    }
}
