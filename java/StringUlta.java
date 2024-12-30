import java.util.Scanner;
public class StringUlta {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter a String too reverse");
        String text=myObj.nextLine();
        // String reversed=new StringBuilder(text).reverse().toString();
        String reversed="";
        for(int i=0;i<text.length();i++){

            reversed=text.charAt(i)+reversed;

        } 
      System.out.println(reversed);

    }
}
