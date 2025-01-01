

public class ExcludeChar {
//  suppose you are given a string return a new string by exclusiing all the characters like if a string baccad was given return bccd    // 
static String Remov(String str,int index, String fin){

    if(index>=str.length()){
        return fin;
    }
    if(str.charAt(index)!='a'){
       fin+=str.charAt(index);
    }
    return  Remov ( str,index+1, fin);




}
static void skip(String p, String up){
if(up.isEmpty()){
    System.out.println(p);
    return ;
}
char ch=up.charAt(0);
if(ch=='a'){
skip(p,  up.substring(1));
}else{
    skip(p+ch,  up.substring(1));

}
}
public static void main(String[] args) {
    
    skip("", "banana");
}
}
