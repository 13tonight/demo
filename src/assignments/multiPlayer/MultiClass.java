package assignments.multiPlayer;

public class MultiClass {
    public static void main(String[] args) {
        AudioPlayer audio = new AudioPlayer();
        VideoPlayer video = new VideoPlayer();
        ImageDisplay image = new ImageDisplay();

        audio.displayDetails();
        audio.name();
        audio.play();

        video.name();
        video.play();
        video.displayDetails();

        image.name();
        image.play();
        image.displayDetails();
    }
}
