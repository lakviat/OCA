public class PrintArgs {
    public static void main(String[] args) {
        System.out.println("Hello  + "  + args[0]);
        // it will throw index out of bound for length
        // because args is not declared yet so its null
    }
}
