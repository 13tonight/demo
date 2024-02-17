package assignments.interfaceAssign;

public class Facebook implements SocialMedia, Website, MobileApp{
    @Override
    public String appStore() {
        System.out.println("Facebook is available in both appstore and play store");
        return null;
    }

    @Override
    public String userName() {
        System.out.println("Facebook wii create a username");
        return null;
    }

    @Override
    public String gmail() {
        System.out.println("Facebook will need gmail to send access code");
        return null;
    }

    @Override
    public String browserName() {
        System.out.println("Facebook has a browser supported");
        return null;
    }
}
