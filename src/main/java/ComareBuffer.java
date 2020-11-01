public class ComareBuffer {
    public static void main(String[] args) {
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        //if(s1 == s2){
         //   System.out.println("1");
        //}  Can't compare StrinbBuilder with String using == sing only .equals
        if(s1.equals(s2)){
            System.out.println("2");
        }


    }
}
