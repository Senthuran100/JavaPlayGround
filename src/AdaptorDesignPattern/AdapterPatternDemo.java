package AdaptorDesignPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("VLC", "song1");
        audioPlayer.play("MP4", "song2");
    }
}
