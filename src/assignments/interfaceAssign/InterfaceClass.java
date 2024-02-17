package assignments.interfaceAssign;

public class InterfaceClass {
    public static void main(String[] args) {
        Facebook face= new Facebook();
        Instagram insta = new Instagram();
        SnapChart snap = new SnapChart();
        Gmail gmail = new Gmail();

        System.out.println("====================FaceBook=======================");
        face.appStore();
        face.gmail();
        face.browserName();
        face.userName();
        System.out.println();
        System.out.println("======================Instagram=====================");
        insta.appStore();
        insta.gmail();
        insta.userName();
        insta.browserName();
        System.out.println();
        System.out.println("========================Snap chart====================");
        snap.appStore();
        snap.gmail();
        snap.userName();
        System.out.println();
        System.out.println("=========================Gmail========================");
        gmail.appStore();
        gmail.browserName();


    }
}
