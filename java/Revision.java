
public class Revision {
  int x=5;
 void increment(){
    x++;
 }
 
        public static void main(String[] args) {
           Revision obj1=new Revision();
           Revision obj2=new Revision();
           obj1.increment();
           System.out.println(obj1.x);
           System.out.println(obj2.x);

    
    }
}
