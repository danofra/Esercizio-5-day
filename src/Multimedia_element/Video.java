package Multimedia_element;

public class Video extends MultimediaElement {
    private int luminance;
    private int volume;
    private int duration;

    public Video(String title, int dimension, String type, int luminance, int volume, int duration) {
        super(title, dimension, type);
        this.luminance = luminance;
        this.volume = volume;
        this.duration = duration;
    }

    public void show() {
        System.out.println("Video: " + title);
        System.out.println("Dimension: " + dimension);
        System.out.println("Type: " + type);
        System.out.println("Luminance: " + luminance);
        System.out.println("Volume: " + volume);
        System.out.println("---------------------------");
    }

    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.print("Playing: " + title + " ");
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.print(" " + "Luminosità" + " ");
            for (int k = 0; k < luminance; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------");

    }

    public void alzaLuminance() {
        this.luminance += 10;
    }

    public void bassaLuminance() {
        this.luminance -= 10;
    }

    public void alzaVolume() {
        this.volume += 10;
    }

    public void bassaVolume() {
        this.volume -= 10;
    }

}
