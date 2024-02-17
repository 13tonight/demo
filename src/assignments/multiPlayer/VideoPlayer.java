package assignments.multiPlayer;

public class VideoPlayer extends MediaDevice implements PlayableInterface{
    @Override
    void name() {
        System.out.println("you are in video player");
    }

    @Override
    public void play() {
        System.out.println("you are playing video");
    }

    @Override
    public void displayDetails() {
        System.out.println("video details");
    }
}
