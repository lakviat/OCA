public class WhichisTrue {
    public static void swing(){
        System.out.println("swing");
    }
    public void climb(){
        System.out.println("climb");
    }
    public static void play(){
        System.out.println("");
        swing();

    }

    public static void main(String[] args) {
        WhichisTrue sn = new WhichisTrue();
        WhichisTrue sn2 = null;


        // if static present in the signature method
        // it means it can be called without the initializition
        // you can't access static initializing the method
        // if static is there you can access thru the class

    }
}
