package Multimedia_element;

public class Image extends MultimediaElement {
    public Image(String title, int dimension, String type) {
        super(title, dimension, type);
    }

    public void show() {
        System.out.println("Image: " + title + " " + "Dimension: " + dimension + " " + "Type: " + type);
    }

}
