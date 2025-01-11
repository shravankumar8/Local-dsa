public class Insertion {
    static void Sorted(int [] arr){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0&& arr[j-1]>arr[j]){
                // swap the elements arr[j-1] and arr[j]
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    
    public static void main(String[] args) {
        int [] arry={13,46,24,52,20,9};
        Sorted(arry);
        for(int i=0;i<arry.length;i++){
            
            System.out.println(arry[i]);
        }

    }
    
}
