import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
public static void main(String[] args) {
    
    Pattern pattern =Pattern.compile("w3schools",Pattern.CASE_INSENSITIVE);
    Matcher matcher=pattern.matcher("Visit w3schools!");
    boolean matchFound=matcher.find();
    if(matchFound){
        System.out.println("Found");
    }else{
        System.out.println("Not Found");
    }
}



    
}
