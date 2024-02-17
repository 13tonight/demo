package assignments.interfaceAssign;

public class Instagram implements SocialMedia, Website, MobileApp{
    @Override
    public String appStore() {
        System.out.println("Instagram is available in both appstore and play store");
        return null;
    }

    @Override
    public String userName() {
        System.out.println("Instagram wii create a username");

        return null;
    }

    @Override
    public String gmail() {
        System.out.println("Instagram will need gmail to send access code");
        return null;
    }

    @Override
    public String browserName() {
        System.out.println("Instagram has a browser supported");
        return null;
    }
}
