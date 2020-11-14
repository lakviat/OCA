package rope;
import static rope.Rope.*;
public class AccessingRope {

    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    {
        System.out.println(rope1.length + "this is will not print anything ");

    }

    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length + " : this will print ");


// When we import from static it means you have to access static variable
// explicitly otherwise it won't let you access it
// it allows you to overrite the static variable this way
// since rope1 and rope2 are printing the same
        // it will print only after it sets the value for length
        // in the static block it won't print anything its not even getting it called
        //



    }
}


