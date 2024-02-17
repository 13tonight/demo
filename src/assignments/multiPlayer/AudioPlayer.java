package assignments.multiPlayer;


public class AudioPlayer extends MediaDevice implements PlayableInterface{
    @Override
    void name() {
        System.out.println("you are in audio player");
    }

    @Override
    public void play() {
        System.out.println("playing audio");
    }

    @Override
    public void displayDetails() {
        System.out.println("displaying the audio details");

    }
}
