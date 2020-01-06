public class StringBuilders {
    public static void main(String[] args) {

        //In this Example StringBuilder just gives the size of the StringBuilder
        //And when comparing sb has to turn to String same with

        StringBuilder sb = new StringBuilder(5);

        String s = "";
        if(sb.equals(s)){
            System.out.println("match 1");
        }else if(sb.toString().equals(s)){
            System.out.println("match 2");
        }else{
            System.out.println("no match");
        }
    }
}
