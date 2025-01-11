import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text=myObj.nextLine();
        int count=text.split("\\s+").length;
        System.out.println("Word count: " + count);
        
    }
}
