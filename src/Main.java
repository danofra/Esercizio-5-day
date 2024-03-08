import Multimedia_element.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("IMAGE");
        System.out.println("---------------------------");
        Image image = new Image("Carte Siciliane su tela", 100, "png", 50);
        image.show();
        image.upBrightness();
        image.show();
        image.downBrightness();
        image.show();
        System.out.println("PLAYER");
        System.out.println("---------------------------");
        Player player = new Player("Bohemian Rhapsody", 100, "mp3", 20, "Queen", 6);
        player.show();
        player.upVolume();
        player.show();
        player.downVolume();
        player.show();
        player.play();
        System.out.println("VIDEO");
        System.out.println("---------------------------");
        Video video = new Video("The Matrix", 100, "mp4", 50, 20, 6);
        video.show();
        video.upBrightness();
        video.upVolume();
        video.show();
        video.downBrightness();
        video.downVolume();
        video.show();
        video.play();

    }
}