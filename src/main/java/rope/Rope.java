package rope;

public class Rope {

    public static int length = 5;
    public static int kotok = 10;
    public static int sigein;

    static {
        length = 10;
    }


    public static void swing(){
        System.out.println("Swing");
    }

    public static void main(String[] args) {

        Rope.swing();
        new Rope().swing();
        System.out.println(length);
        // this is example that even if the package name and class name are same
        // they will still compile
        // they have to be case different

        // good to remember that static block always will set the value
        // it works like a constructor will do something that you call
        // Static block is used to initialize the static variables
        // the block is getting executed when the class is loaded in the memory
        // a class can have multiple static blocks

    }
}
