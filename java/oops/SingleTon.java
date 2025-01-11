import java.lang.classfile.instruction.StackInstruction;

class Singleton{

private Singleton(){

}
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }

        return instance;
    }
}


public class SingleTon {

    public static void main(String[] args) {
        Singleton oobj= Singleton.getInstance();
    }
}