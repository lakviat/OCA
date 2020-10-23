public class InvalidCalculation {
    public static void main(String[] args) {

        try{
            int num = 10;
            int div = 0;
            int ans = num / div;
        }catch (ArithmeticException ae){
            /*  ans = 0   */
        }catch (Exception e){
            System.out.println("invalid calculation");
        }
        System.out.println("Answer = "   /*  + ans */ );

        // so this compilation fails because we can't have any declation part in the Exception catching palce
        // no declarations should be in the declarations in the Exeptions
        // so this is why it will fail
    }
}
