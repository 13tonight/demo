package assignments.multiPlayer;

public class ImageDisplay extends MediaDevice {


    @Override
    public void play() {
        System.out.println("you viewing images");
    }

    @Override
    public void displayDetails() {
        System.out.println("you are seeing the image details");
    }

    @Override
    void name() {
        System.out.println("name of the image");
    }
}
