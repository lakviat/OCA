public class IntCount {
    static int count = 0;
    int i = 0;


    public void changeCount() {
        while (i < 5) {
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        IntCount check1 = new IntCount();
        IntCount check2 = new IntCount();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1);

        // this won't work because we can't access static values
        // from the the objects .. we can access only thru the class
        //
    }
}


