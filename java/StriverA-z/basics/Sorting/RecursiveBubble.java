public class RecursiveBubble {
    static void Sort(int [] arr, int n){
        if(n==1){
            return ;
        }
        for(int i=0;i<=n-2;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;

            }

        }
        Sort(arr,n-1);



    }
    public static void main(String[] args) {
        int [] arr={3,45,43,5,65,46,45};
        
        Sort(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        

    }
    
}
