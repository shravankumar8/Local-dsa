public class SumArray {
    static int Summer(int [] arr,int index,int sum){
        if(index==arr.length){
            return sum;
        }
        return Summer(arr,index+1,sum+=arr[index]);


    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int index=0;
        int sum=0;
        System.out.println(Summer(arr,index,sum));
        
    }
    
}
// This is tail call optimized code 
