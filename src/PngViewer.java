public class PngViewer implements AdvancedMediaViewer {

    @Override
    public void playPng(String fileName) {
        System.out.println("Looking png file: "+ fileName);
    }

    @Override
    public void playJpg(String fileName) {
        // нет реализации
    }
}
