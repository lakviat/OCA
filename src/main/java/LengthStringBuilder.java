public class LengthStringBuilder {
    public static void main(String[] args) {
        int total = 0;
        StringBuilder letters = new StringBuilder("abdefg");
        total += letters.substring(1,2).length();
        //total += letters.substring(6,6).length();
        //total += letters.substring(6,5).length();
        System.out.println(total);
        // this one wil throw exception
        // but if you are interested if that .length will return the trimmed value
        // yes it will return the trimmed value

    }
}
