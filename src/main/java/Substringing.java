public class Substringing {
    public static void main(String[] args) {
        String numbers = "012345678";
        System.out.println(numbers.substring(1,3));
        System.out.println(numbers.substring(7,7));
        System.out.println(numbers.substring(7));

        // substring 7.7 will not pring anything because there has to be a range
        // it will hit the index number 7 but will not print anything
        // 1,3 will print the range between indexes 1 and 2
        // only one parameter given will print everything beyong that index

        //Substring work that way
    }
}
