public class PowerofNRecusion {
   static int Rev(int n,int reversed){
    if(n==0){
        return reversed;
    }
    int lastDigit=n%10;
  reversed=reversed*10+lastDigit;
  return Rev(n/10,reversed);

   }
   static int Powers(int n){
    int rev=Rev(n,0);
    return (int) Math.pow(n, rev);
   }
   
   public static void main(String[] args) {
    System.out.println(Powers(2));
    
    
   }
    
   }
        // static void Printer(int number,int index) {
        //     if(index<1){
        //         return ;
        //     }
        //     int lastIndex=n%10

        //     return 

            
           
        // }
