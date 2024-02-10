package feb10.inheritance;

public class car extends vehicle{

    int numberOfDoors;
    String carType;

    public car(String make, String model, int year, int numberOfDoors, String carType) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.carType = carType;
    }

    public void carDetails(){
        start();
        displayInfo();
        System.out.println(" Car Type " + this.carType);
        System.out.println("Number of Doors " + this.numberOfDoors);
        stop();
    }
}
