import java.util.Scanner;

import Multimedia_element.*;

public class Main {
    public static void main(String[] args) {
        /*
         * All'inizio, tutto era in modo statico, per provare che funzionasse la classe
         * MultimediaElement.
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
        MultimediaElement[] multimediaElements = new MultimediaElement[0];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("---------------------------");
            System.out.println("Scegli il tipo di file che vuoi creare inserendo un numero tra 1 e 3");
            System.out.println("1. Player");
            System.out.println("2. Video");
            System.out.println("3. Image");
            System.out.println("---------------------------");
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
                    multimediaElements = addX(multimediaElements, player);
                    for (MultimediaElement element : multimediaElements) {
                        System.out.println(element.toString());
                    }
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
                    multimediaElements = addX(multimediaElements, video);
                    for (MultimediaElement element : multimediaElements) {
                        System.out.println(element.toString());
                    }

                    break;
                case 3:
                    System.out.println("Inserisci il nome dell' immagine");
                    String title2 = scanner.next();
                    System.out.println("Inserisci la luminosità del file");
                    int brightness2 = scanner.nextInt();
                    System.out.println("---------------------------");
                    Image image = new Image(title2, brightness2);
                    multimediaElements = addX(multimediaElements, image);
                    for (MultimediaElement element : multimediaElements) {
                        System.out.println(element.toString());
                    }

                    break;
                default:
                    System.out.println("Non è stato inserito un numero valido");
                    break;
            }
        }
        String play = "s";
        while (play.equals("s")) {
            System.out.println(
                    "Inserisci il numero del file che vuoi riprodurre (da 1 a " + multimediaElements.length + "):");
            int num = scanner.nextInt();
            if (num >= 1 && num <= multimediaElements.length) {
                multimediaElements[num - 1].play();

                if (multimediaElements[num - 1] instanceof Player) {
                    System.out.println("---------------------------");
                    System.out.println("Vuoi modificare il volume del file? (s/n)");
                    String volume = scanner.next().toLowerCase();
                    if (volume.equals("s")) {
                        System.out.println("---------------------------");
                        System.out.println("Inserisci + o - per modificare il volume");
                        String volume1 = scanner.next().toLowerCase();
                        switch (volume1) {
                            case "+":
                                ((Player) multimediaElements[num - 1]).upVolume();
                                multimediaElements[num - 1].show();
                                break;
                            case "-":
                                ((Player) multimediaElements[num - 1]).downVolume();
                                multimediaElements[num - 1].show();
                                break;
                            default:
                                System.out.println("Numero non valido.");
                                break;
                        }
                    } else {
                        System.out.println("---------------------------");
                        System.out.println("Nessun problema!");
                        System.out.println("---------------------------");
                    }
                } else if (multimediaElements[num - 1] instanceof Video) {
                    System.out.println("---------------------------");
                    System.out.println("Vuoi modificare il volume del file? (s/n)");
                    String volume = scanner.next().toLowerCase();
                    if (volume.equals("s")) {
                        System.out.println("---------------------------");
                        System.out.println("Inserisci + o - per modificare il volume");
                        String volume1 = scanner.next().toLowerCase();
                        switch (volume1) {
                            case "+":
                                ((Video) multimediaElements[num - 1]).upVolume();
                                multimediaElements[num - 1].show();
                                break;
                            case "-":
                                ((Video) multimediaElements[num - 1]).downVolume();
                                multimediaElements[num - 1].show();
                                break;
                            default:
                                System.out.println("Numero non valido.");
                                break;
                        }
                    } else {
                        System.out.println("---------------------------");
                        System.out.println("Nessun problema!");
                        System.out.println("---------------------------");
                    }
                    System.out.println("---------------------------");
                    System.out.println("Vuoi modificare la luminosità del file? (s/n)");
                    String lum = scanner.next().toLowerCase();
                    if (lum.equals("s")) {
                        System.out.println("---------------------------");
                        System.out.println("Inserisci + o - per modificare il luminosità");
                        String lum1 = scanner.next().toLowerCase();
                        switch (lum1) {
                            case "+":
                                ((Video) multimediaElements[num - 1]).upBrightness();
                                multimediaElements[num - 1].show();
                                break;
                            case "-":
                                ((Video) multimediaElements[num - 1]).downBrightness();
                                multimediaElements[num - 1].show();
                                break;
                            default:
                                System.out.println("Numero non valido.");
                                break;
                        }
                    } else {
                        System.out.println("---------------------------");
                        System.out.println("Nessun problema!");
                        System.out.println("---------------------------");
                    }

                } else if (multimediaElements[num - 1] instanceof Image) {
                    System.out.println("---------------------------");
                    System.out.println("Vuoi modificare la luminosità del file? (s/n)");
                    String lum = scanner.next().toLowerCase();
                    if (lum.equals("s")) {
                        System.out.println("---------------------------");
                        System.out.println("Inserisci + o - per modificare il luminosità");
                        String lum1 = scanner.next().toLowerCase();
                        switch (lum1) {
                            case "+":
                                ((Image) multimediaElements[num - 1]).upBrightness();
                                multimediaElements[num - 1].show();
                                break;
                            case "-":
                                ((Image) multimediaElements[num - 1]).downBrightness();
                                multimediaElements[num - 1].show();
                                break;
                            default:
                                System.out.println("Numero non valido.");
                                break;
                        }
                    } else {
                        System.out.println("---------------------------");
                        System.out.println("Nessun problema!");
                        System.out.println("---------------------------");
                    }

                }
                
                System.out.println("Vuoi riprodurre un altro file? (s/n)");
                play = scanner.next().toLowerCase();
            }
        }
        System.out.println("---------------------------");
        System.out.println("HAVE A GOOD DAY");
        System.out.println("---------------------------");
        scanner.close();

    }

    public static MultimediaElement[] addX(MultimediaElement[] array, MultimediaElement element) {
        MultimediaElement[] newArray = new MultimediaElement[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = element;
        return newArray;
    }
}