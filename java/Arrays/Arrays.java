public class Arrays {

  
    public static void main(String[] args) {
    
int [] scores={33,34,545,6,57,7,67,7,6,6};
int sum=0;
for (int score : scores) {
    sum+=score;
};
int average=sum/scores.length;
System.out.println(average);



}}
