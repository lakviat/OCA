import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {

        String anagram = "lena";
        String secondanagram = "anel";

        char [] char1 = anagram.toCharArray();
        char [] char2 = secondanagram.toCharArray();

        System.out.println(char1);
        System.out.println(char2);

        Arrays.sort(char1);
        Arrays.sort(char2);

        System.out.println(char1);
        System.out.println(char2);

        for (int i = 0; i <char1.length ; i++) {
            if(char1.length != char2.length){
                System.out.println("not same length");
            }
            if(char1[i] != char2[i]){
                System.out.println("is not anagram");
            }else{
                System.out.println("is angram");
            }
        }




    }
}
