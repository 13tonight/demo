package feb10.inheritance;

public class vehicle {
    String make;
    String model;
    int year;

    public vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("started");
    }
    public void stop(){
        System.out.println("stopped");
    }
    public void displayInfo(){
        System.out.println("Make " + this.make);
        System.out.println("Year " + this.year);
        System.out.println("Model " +  this.model);
    }
}
