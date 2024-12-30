public class RootBinary {
    
    public static int Root(int n){
        if(n==0 || n==1){
            return n;
        }
        int low=1 ,high=n;
        int result=0;
        while(low<=high){
           int  mid=low+high/2;
           if(mid*mid==n){
            return n;
           }else if(mid*mid<n){
            low=mid+1;
            result=mid;


           }else{
            high=mid-1;
           }
           return result;


        }
    }
}
