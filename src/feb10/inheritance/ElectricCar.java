package feb10.inheritance;

public class ElectricCar extends car{
    int batteryCapacity;
    int timePeriod;
    int range;

    public ElectricCar(String make, String model, int year, int numberOfDoors, String carType, int batteryCapacity, int timePeriod, int range) {
        super(make, model, year, numberOfDoors, carType);
        this.batteryCapacity = batteryCapacity;
        this.timePeriod = timePeriod;
        this.range = range;
    }

    public void chargeBattery(){
        start();
        displayInfo();
        System.out.println("Battery Capacity " + this.batteryCapacity);
        System.out.println("Charge Time Period "+ this.timePeriod);
        System.out.println("Charge Range " + this.range);
        stop();
    }
}
