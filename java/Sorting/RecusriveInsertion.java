public class RecusriveInsertion {
    static void sort(int [] arr,int i,int n){
       if(i==n){
        return ;
       }
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;


        }
        sort( arr,i+1,n);

        

    }
    public static void main(String[] args) {
         int [] arr={3,45,43,5,65,46,45};
         sort(arr, 0, arr.length);
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
        
       


      
        
    }
    
}
