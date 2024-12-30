package BasicMath;

import java.util.Arrays;

public class PandovanSequence {
    
    static void Psequence(int n){
        int [] pandovan=new int[n];
        pandovan[0]=pandovan[1]=pandovan[2]=1;
        for(int i=3;i<n;i++){
            pandovan[i]=pandovan[i-2]+pandovan[i-3];
        }
    System.out.println(Arrays.toString(pandovan));


    }
    public static void main(String[] args) {
Psequence(20);
    }
}
