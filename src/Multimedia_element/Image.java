package Multimedia_element;

public class Image extends MultimediaElement {
    private int luminance;

    public Image(String title, int dimension, String type, int luminance) {
        super(title, dimension, type);
        this.luminance = luminance;
    }

    public void show() {
        System.out.println("Image: " + title);
        System.out.println("Dimension: " + dimension);
        System.out.println("Type: " + type);
        System.out.println("Luminance: " + luminance);
        System.out.println("---------------------------");
    }

    public void alzaLuminance() {
        this.luminance += 10;
    }

    public void bassaLuminance() {
        this.luminance -= 10;
    }

}
