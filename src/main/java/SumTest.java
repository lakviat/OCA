public class SumTest {
    public static void doSum(Integer x, Integer y){
        System.out.println("Integer sum is " + (x+y));
    }
    public static void doSum(double x, double y){
        System.out.println("double sum is " + (x+y));
    }
    public static void doSum(float x, float y){
        System.out.println("Float sum is " + (x+y));
    }
    public static void doSum(int x, int y){
        System.out.println("int sum is " + (x+y));
    }

    public static void main(String[] args) {
        doSum(10,20);
        doSum(10.0,20.0);

        //Everything works fine here the answer is 10,20 /and / 10.0 20.0
        // you can access the method directly calling it from the main class
        // if they are in the same class only
    }
}
