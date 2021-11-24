package AdaptorDesignPattern;

public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        // Do Nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 File " + fileName);
    }
}
