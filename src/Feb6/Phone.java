package Feb6;

public class Phone {
    String model;
    String call;
    int screenSize;

    public Phone(String model, String call, int screenSize) {
        this.model = model;
        this.call = call;
        this.screenSize = screenSize;
    }

    public void PhoneDetails(){
        System.out.println("Model :" +this.model);
        System.out.println("Do you have call option:" +this.call);
        System.out.println(this.screenSize);
    }
}
