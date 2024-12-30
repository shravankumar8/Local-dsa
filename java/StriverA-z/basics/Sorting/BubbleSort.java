public class BubbleSort {
    static void Sorter(int [] arr){
        int n=arr.length;
       for(int i=n-1;i>=0;i--){
        for(int j=0;j<i-1;j++){
            if(arr[j+1]<arr[j]){
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
                
                

            }

        }
       }

    }
    public static void main(String[] args) {
        int [] arr={6,5,2,3,5,8,9};
        Sorter(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
      
        
    }
}
