package feb10.inheritance;

public class MotorCycle extends vehicle{

    int NumberOfCylinders;
    String motorType;
    int price;

    public MotorCycle(String make, String model, int year, int numberOfCylinders, String motorType, int price) {
        super(make, model, year);
        NumberOfCylinders = numberOfCylinders;
        this.motorType = motorType;
        this.price = price;
    }

    public void bikeDetails(){
        start();
        displayInfo();
        System.out.println("Motor Type " + this.motorType);
        System.out.println("NUmber Of Cylinders " + this.NumberOfCylinders);
        System.out.println("Price " + this.price);
        stop();
    }


}
