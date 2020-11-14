package InterfacesPractice;

public class implem implements Practice {

    @Override
    public void practicing(String k) {
        System.out.println("overriding method of interface");
    }

    public void kotok(){
        System.out.println("overiding one more ");
    }

    public static void main(String[] args) {
        Practice ck = new implem();
        ck.kotok();

        // Interfaces are pretty much the same as inheritacne
        // but the difference they can't have method imlementation on it
        // Interfaces designed to implement methods from them

        // Abstract classes have related classes with different behavior
        // Interfaces have unrelated classes same behavior

    }
}
