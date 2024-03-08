import Multimedia_element.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("IMAGE");
        System.out.println("---------------------------");
        Image image = new Image("Carte Siciliane su tela", 100, "png", 50);
        image.show();
        image.alzaLuminance();
        image.show();
        image.bassaLuminance();
        image.show();
        System.out.println("PLAYER");
        System.out.println("---------------------------");
        Player player = new Player("Bohemian Rhapsody", 100, "mp3", 20, "Queen", 6);
        player.show();
        player.alzaVolume();
        player.show();
        player.bassaVolume();
        player.show();
        player.play();

    }
}