package Multimedia_element;

public abstract class MultimediaElement {
    String title;
    

    public MultimediaElement(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return title;
    }

}
