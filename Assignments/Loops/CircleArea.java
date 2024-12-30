package Loops;

import java.util.Scanner;

public class CircleArea {
    static double Area(int radius){
       
        return  Math.PI * radius * radius;
        


    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius");
        int num=in.nextInt();
        System.out.println(Area(num));

    }
}
