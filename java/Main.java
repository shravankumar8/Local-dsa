// Bicycle.java
class Bicycle {
   static  int currentSpeed;

    public Bicycle(int startSpeed) {
        currentSpeed = startSpeed;
    }

    public void displaySpeed() {
        System.out.println("Current Speed: " + currentSpeed + " km/h");
    }

    public void increaseSpeed(int increment) {
        currentSpeed += increment;
    }
}



// MyFirstClass.java
public class Main {
  public static void main(String[] args) {
String myName="my name is shravan kumar ";
System.out.println(myName.indexOf("name"));
  }
}