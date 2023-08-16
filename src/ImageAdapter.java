public class ImageAdapter implements MediaPlayer {

    AdvancedMediaViewer advancedMusicPlayer;

    public ImageAdapter(String imageType) {

        if (imageType.equalsIgnoreCase("png")) {
            advancedMusicPlayer = new PngViewer();
        }
    }

    @Override
    public void play(String imageType, String fileName) {

        if (imageType.equalsIgnoreCase("png")) {
            advancedMusicPlayer.playPng(fileName);
        }
    }
}
