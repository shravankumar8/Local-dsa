public class Rooot {
    static void Root(int n) {
       
        for (int i =(int) Math.sqrt(n); i >0 ; i--) {
            if (i * i == n || i*i<n) {
                System.out.println(i);
                return ;

            }
        }
    }

    public static void main(String[] args) {
        Root(17);

    }
}
