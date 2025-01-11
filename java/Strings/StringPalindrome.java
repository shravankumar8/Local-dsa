public class StringPalindrome {
    static boolean Palindrome(String str){
        str=str.toLowerCase();
       for(int i=0;i<=str.length()/2;i++){
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
    } 
    return true;
       
    }
    public static void main(String[] args) {
        
        String name="abccba";
       System.out.println( Palindrome(name));

    }
    
}
