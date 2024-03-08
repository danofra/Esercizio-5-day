package Multimedia_element;

public abstract class MultimediaElement {
    String title;
    int dimension;
    String type;
    
    public MultimediaElement(String title, int dimension, String type) {
        this.title = title;
        this.dimension = dimension;
        this.type = type;
    }

    
}
