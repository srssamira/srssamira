import java.util.Scanner;

public class IO {

    public static Scanner input(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }
}
