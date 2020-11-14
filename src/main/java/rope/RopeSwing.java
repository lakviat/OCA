package rope;

public class RopeSwing {
    private static final String leftRope;
    private static final String rightRope;
//    private static final String bench;
    private static final String name = "name";
    // Those four won't compile because when we are using keword final
    // we have to make sure we are actually initializing the instance variable
    // once the final used we have to declare the value to it

    // final also means that you can declare value only once, if you try to overrite it
    // it will throw an error -- > overdeclaring value of the instance variable will cause the exception
    // it won't work
    // we can have as many static block as we can in the class
    // and we can't overrite the final variable from the main method
    // main method is designed to run the programm's but not setting them


    static {
        leftRope = "left";
        rightRope = "right";
    }

    public static void main(String[] args) {
        //bench = "bench";
        // this right here will not work because we are trying to do it from the main method
        // it can be done only from the static block only
        // or declared from the variables instance itself//
    }
}
