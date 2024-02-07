package Feb6;

public class Samsung extends SmartPhone{

    String color;
    String bodyType;
    boolean usesAI;
    String clickPictures;

    public Samsung(String model, String call, int screenSize, String phoneType, boolean surfInternet, String color, String color1, String bodyType, boolean usesAI, String clickPictures) {
        super(model, call, screenSize, phoneType, surfInternet, color);
        this.color = color1;
        this.bodyType = bodyType;
        this.usesAI = usesAI;
        this.clickPictures = clickPictures;
    }

    public void samsungDetails(){
        SmartPhoneDetails();
        System.out.println(this.color);
        System.out.println(this.bodyType);
        System.out.println(this.usesAI);
        System.out.println(this.clickPictures);
    }
}
