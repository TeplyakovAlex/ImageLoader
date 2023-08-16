public class ImageViewer implements MediaPlayer {

    ImageAdapter imageAdapter;

    @Override
    public void play(String imageType, String fileName) {

        // встроенная поддержка воспроизведения
        // музыкальных файлов в формате mp3
        if (imageType.equalsIgnoreCase("jpg")) {
            System.out.println("Looking jpg file: " + fileName);
        }

        // mediaAdapter обеспечивает поддержку
        // воспроизведения файлов других форматов.
        else if (imageType.equalsIgnoreCase("png")

        ) {
            imageAdapter = new ImageAdapter(imageType);
            imageAdapter.play(imageType, fileName);
        } else {
            System.out.println("Invalid media. " + imageType + " format not supported");
        }
    }
}
