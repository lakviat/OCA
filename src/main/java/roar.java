public class roar {

    public void roaring(String roar1, StringBuilder roar2){
        roar1.concat("!!!");
        roar2.append("!!!");
    }

    public static void main(String[] args) {
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");
        new roar().roaring(roar1, roar2);
        System.out.println(roar1 + " " + roar2);
        // concat function is not working here because its not concatinating
        // only append will work here so the output will be roar roar!!!
    }
}
