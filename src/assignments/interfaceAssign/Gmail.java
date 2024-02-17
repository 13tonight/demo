package assignments.interfaceAssign;

public class Gmail implements Website, MobileApp{
    @Override
    public String appStore() {
        System.out.println("Gmail is available in both appstore and play store");
        return null;
    }

    @Override
    public String browserName() {
        System.out.println("Gmail has a browser supported");
        return null;
    }
}
