package BasicMath;

public class MultipleLCM {
    static int Gcd(int a,int b){
        if(a==0){
            return b;
        }
        return Gcd(b%a, a);
    }
    static int Lcm(int [] arr){
        int lcm=arr[0];
        for(int i=1;i<arr.length;i++){
            lcm=lcm*arr[i]/Gcd(lcm,arr[i]);
        }
        return lcm;
    }

public static void main(String[] args) {
    int [] arr= { 2, 7, 3, 9, 4 };
    System.out.println(Lcm(arr));
}
    
}
