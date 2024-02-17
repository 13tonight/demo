package assignments.interfaceAssign;

public class SnapChart implements MobileApp, SocialMedia{
    @Override
    public String appStore() {
        System.out.println("SnapChart is available in both appstore and play store");
        return null;
    }

    @Override
    public String userName() {
        System.out.println("SnapChart wii create a username");
        return null;
    }

    @Override
    public String gmail() {
        System.out.println("SnapChart will need gmail to send access code");
        return null;
    }
}
