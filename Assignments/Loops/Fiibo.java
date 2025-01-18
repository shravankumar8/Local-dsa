public class Fiibo {
    public static void main(String[] args) {
     
        
        int start=1;
        int next=1;
        for(int i=0;i<5;i++){
            System.out.println(start+next);
            int temp=next;
            next=start+next;
            start=temp;

        }
    }

    
}