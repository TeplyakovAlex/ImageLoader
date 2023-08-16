public class AdapterPatternDemo {

    public static void main(String[] args) {

        ImageViewer imageViewer = new ImageViewer();

        imageViewer.play("jpg", "photo cover.jpg");
        imageViewer.play("raw", "I am alone.raw");
        imageViewer.play("png", "My mother.png");
        imageViewer.play("ai", "sdfsadfaws.ai");
    }
}
