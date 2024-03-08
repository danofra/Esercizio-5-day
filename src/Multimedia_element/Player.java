package Multimedia_element;

public class Player extends MultimediaElement {
    private int volume;
    private String artist;
    private int duration;

    public Player(String title, int dimension, String type, int volume, String artist, int duration) {
        super(title, dimension, type);
        this.volume = volume;
        this.artist = artist;
        this.duration = duration;
    }

    public void show() {
        System.out.println("Player: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Dimension: " + dimension);
        System.out.println("Type: " + type);
        System.out.println("Duration: " + duration);
        System.out.println("Volume: " + volume);
        System.out.println("---------------------------");
    }

    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.print("Playing: " + title + " ");
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
        System.out.println("---------------------------");

    }

    public void upVolume() {
        this.volume += 10;
    }

    public void downVolume() {
        this.volume -= 10;
    }

}
