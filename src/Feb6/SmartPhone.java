package Feb6;

public class SmartPhone extends Phone{

    String PhoneType;
    boolean surfInternet;
    String color;

    public SmartPhone(String model, String call, int screenSize,String phoneType, boolean surfInternet, String color) {
        super(model, call, screenSize);
        PhoneType = phoneType;
        this.surfInternet = surfInternet;
        this.color = color;
    }

    public void SmartPhoneDetails(){
        PhoneDetails();
        System.out.println(this.PhoneType);
        System.out.println(this.surfInternet);
        System.out.println(this.color);
    }
}
