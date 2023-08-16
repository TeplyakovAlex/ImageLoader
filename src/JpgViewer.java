public class JpgViewer implements AdvancedMediaViewer {

    @Override
    public void playPng(String fileName) {
        // нет реализации
    }

    @Override
    public void playJpg(String fileName) {
        System.out.println("Looking jpg file: " + fileName);
    }
}
