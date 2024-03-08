import java.util.Scanner;

import Multimedia_element.*;

public class Main {
    public static void main(String[] args) {
        /*
         * System.out.println("IMAGE");
         * System.out.println("---------------------------");
         * Image image = new Image("Carte Siciliane su tela", 100, "png", 50);
         * image.show();
         * image.upBrightness();
         * image.show();
         * image.downBrightness();
         * image.show();
         * System.out.println("PLAYER");
         * System.out.println("---------------------------");
         * Player player = new Player("Bohemian Rhapsody", 100, "mp3", 20, "Queen", 6);
         * player.show();
         * player.upVolume();
         * player.show();
         * player.downVolume();
         * player.show();
         * player.play();
         * System.out.println("VIDEO");
         * System.out.println("---------------------------");
         * Video video = new Video("The Matrix", 100, "mp4", 50, 20, 6);
         * video.show();
         * video.upBrightness();
         * video.upVolume();
         * video.show();
         * video.downBrightness();
         * video.downVolume();
         * video.show();
         * video.play();
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("---------------------------");
            System.out.println("Scegli il tipo di file che vuoi creare inserendo un numero tra 1 e 3");
            System.out.println("1. Player");
            System.out.println("2. Video");
            System.out.println("3. Image");
            System.out.println("---------------------------");
            Scanner scanner = new Scanner(System.in);
            int file = scanner.nextInt();
            switch (file) {
                case 1:
                    System.out.println("Inserisci il nome dell' audio");
                    String title = scanner.next();
                    System.out.println("Inserisci l'artista dell' audio");
                    String artist = scanner.next();
                    System.out.println("Inserisci il volume del file");
                    int volume = scanner.nextInt();
                    System.out.println("Inserisci la durata del file");
                    int duration = scanner.nextInt();
                    System.out.println("---------------------------");
                    Player player = new Player(title, artist, duration, volume);
                    player.show();
                    scanner.close();
                    break;
                case 2:
                    System.out.println("Inserisci il nome del video");
                    String title1 = scanner.next();
                    System.out.println("Inserisci la luminosità del file");
                    int brightness1 = scanner.nextInt();
                    System.out.println("Inserisci il volume del file");
                    int volume1 = scanner.nextInt();
                    System.out.println("Inserisci la durata del file");
                    int duration1 = scanner.nextInt();
                    System.out.println("---------------------------");
                    Video video = new Video(title1, duration1, brightness1, volume1);
                    video.show();
                    scanner.close();
                    break;
                case 3:
                    System.out.println("Inserisci il nome dell' immagine");
                    String title2 = scanner.next();
                    System.out.println("Inserisci la luminosità del file");
                    int brightness2 = scanner.nextInt();
                    System.out.println("---------------------------");
                    Image image = new Image(title2, brightness2);
                    image.show();
                    scanner.close();
                    break;
                default:
                    System.out.println("Non è stato inserito un numero valido");
                    break;
            }

        }
    }
}