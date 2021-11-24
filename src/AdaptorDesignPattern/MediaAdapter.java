package AdaptorDesignPattern;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    MediaAdapter(String audioType) {
        if (audioType.equals("VLC")) {
            advancedMediaPlayer = new VLCPlayer();
        } else if (audioType.equals("MP4")) {
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("VLC")) {
            advancedMediaPlayer.playVLC(fileName);
        } else if (audioType.equals("MP4")) {
            advancedMediaPlayer.playMP4(fileName);
        }
    }
}
