package Multimedia_element;

public class Player extends MultimediaElement {
    int volume;

    public Player(String title, int dimension, String type, int volume) {
        super(title, dimension, type);
        this.volume = volume;
    }

    public void alzaVolume() {
        this.volume += 1;
    }

    public void bassaVolume() {
        this.volume -= 1;
    }
    
}
