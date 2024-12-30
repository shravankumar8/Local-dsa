import java.util.Scanner;
public class Greeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your good Name please !! :");
        String name=in.nextLine();
        System.out.println("Welcome "+name);
    }
}
