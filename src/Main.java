import Multimedia_element.*;

public class Main {
    public static void main(String[] args) {
        Image image = new Image("Asso di mazza", 100, "png", 10);
        image.show();
        image.alzaLuminance();
        image.show();
        image.bassaLuminance();
        image.show();

    }
}