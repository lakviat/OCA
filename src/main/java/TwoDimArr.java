public class TwoDimArr {
    public static void main(String[] args) {
        String [] [] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println(arr[i][j] + " ");
                if(arr[i][j].equals("F")){
                    break;
                }
            }
            continue;
            // this scenario won't throw any exceptions due to the continue there
            // if you miss continue it should break
            // even if we don't have break and continue statement it won't break
            // because it finds that [i] actually has "B"
            // any matching here will work as fine
            // also want to pay attention to that sout statemnt it will actually print all there

        }
    }
}
