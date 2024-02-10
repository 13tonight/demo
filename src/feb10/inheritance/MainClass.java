package feb10.inheritance;

public class MainClass {
    public static void main(String[] args) {
        car car= new car("Acura","Tl", 2009, 4, "Sedon");
        MotorCycle motor= new MotorCycle("Hero","cruzer", 2023, 4, "Racer", 15000);
        ElectricCar ev= new ElectricCar("Tesla", "Model 3", 2020, 4 ,"Sedan",1000, 3, 400);
        car.carDetails();
        System.out.println("===========================");
        motor.bikeDetails();
        System.out.println("============================");
        ev.chargeBattery();
    }
}
