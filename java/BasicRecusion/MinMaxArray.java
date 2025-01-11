public class MinMaxArray {
    static int Finder(int index,int min, int max, int [] arr){
        if(index>=arr.length){
            System.out.println("Min "+min);
            System.out.println("Max "+max);
            return min;
        }
        if(arr[index]<min){
            min=arr[index];
        }
        if(arr[index]>max){
            max=arr[index];
        }
        return Finder(index+1, min,  max,  arr);



    }
    public static void main(String[] args) {
        int [] arr= { 1, 4, 45, 6, 10, -8 };
        int index=0;
        int min=arr[0];
        int max=arr[0];


        Finder( index, min,  max,  arr);

        
    }

    
}
