public class App {
    public static void main(String[] args) {

        Boolean [] bool = new Boolean[2];
        bool[0] = new Boolean(Boolean.parseBoolean("true"));
        bool[1] = new Boolean(null);

        System.out.println(bool[0] + " " + bool[1]);

        // it will print whatever the boolean parameter has
        // it will be true and false
        // by default boolean is false

    }
}
