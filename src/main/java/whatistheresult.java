import java.util.ArrayList;
import java.util.List;

public class whatistheresult {
    public static void main(String[] args) {

        List colors = new ArrayList();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");

        colors.remove(2);

        colors.add(3,"cyan");

        System.out.println(colors);

        //right answer here is (green,red,yellow,cyan)
        //it doesnt care about index we adding in the "cyan" because its the last element

    }
}
