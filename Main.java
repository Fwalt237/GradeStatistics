import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point point = new Point();
        UserInterface ui = new UserInterface(scanner, point);

        ui.start();
    }
}
