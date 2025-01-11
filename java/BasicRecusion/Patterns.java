public class Patterns {
    static void Triangle(int row, int col){
        // * * * * 
        // * * *
        // * *
        // *
        if(row<=0){
            return;
        }
        if(col<row){
            System.out.print("*");
             Triangle(row, col+1);

        }else{ 
            System.out.println("");
            Triangle(row-1, 0);
        }
    }
   static void Rectangle(int row,int col,int n){
    if(row>=4){
        return;
    }
    if(col<=n){
        System.out.print("*");
        Rectangle(row,col+1,n);
    }else{
        System.out.println("");
        Rectangle(row+1,0,n);
    }
    // * * * *
    // * * * *
    // * * * *
    // * * * *
   }
   static void Triangle2(int row,int col, int n){
    

   } 
   public static void main(String[] args) {
        Rectangle(0,0,4);
    }
}
