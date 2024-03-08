package Multimedia_element;

public class Image extends MultimediaElement {
    private int brightness;

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    public void show() {
        System.out.println("Image: " + title);
        System.out.println("Brightness: " + brightness);
        System.out.println("---------------------------");
    }

    public void upBrightness() {
        this.brightness += 10;
    }

    public void downBrightness() {
        this.brightness -= 10;
    }

}
