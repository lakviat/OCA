import java.util.ArrayList;
import java.util.List;

public class Patient {
    String name;
    public Patient (String name){
        this.name = name;
    }
}
class TestPatient {
    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p1 = new Patient("Mark");
        ps.add(p1);

        int f = ps.indexOf(p1);
        // this will work  because this will find the index of 0

        if( f >= 0){
            System.out.println("Mike Found");
        }
    }
}
