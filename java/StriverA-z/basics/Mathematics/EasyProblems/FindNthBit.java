public class FindNthBit {
static int Finder(int number, int index){

   

    return (number>>(index-1)&1);
}
    public static void main(String[] args) {
        System.out.println(Finder(19,5));
        
    }
}