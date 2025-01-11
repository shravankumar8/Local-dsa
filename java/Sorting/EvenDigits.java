public class EvenDigits {
    static void Even(int [] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            int digits=(int) Math.log10(nums[i])+1;
            if(digits%2==0){
                count++;
            }
            System.out.println(i + " "+ digits);

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int [] arr={ 555, 901, 482, 1771};
        Even(arr);


    }
}
