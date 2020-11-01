public class CharAt {
    public static void main(String[] args) {
    String letters = "purr";
    letters.toUpperCase();
    letters.trim();
    letters.substring(1,3);

    letters += " two";
        System.out.println(letters.length());

        // this will print the initial size of the String because it still keeps in the the memory
        // os it will print the number 8
    }
}
