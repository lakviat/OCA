public class whatistheResultSwitch {
    public static void main(String[] args) {

        int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};

        for (String s : days) {
            switch (s) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd ++;
                case "wed":
                    wd +=2;
            }
        }
        // you can have two cases in the switch statement i guess
        // in this case the result will be 3
        // when we do 0 value to -=1 it will still be 0
        System.out.println(wd);
    }
}
