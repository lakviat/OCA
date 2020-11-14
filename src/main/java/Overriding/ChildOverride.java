package Overriding;


public class ChildOverride extends Override {
    public void Override(){
        System.out.println("THIS IS CHILD CLASS");
    }

    public static void main(String[] args) {
        Override ck = new ChildOverride();
        ck.Override();

        // Ovverriding method happens using two classes
        // same name same parameters
        // child class should extend to parent class
        // when calling method you should start from parent class

    }
}
