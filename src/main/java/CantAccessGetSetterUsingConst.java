import javax.swing.*;

public class CantAccessGetSetterUsingConst {
    private int roonumber;
    protected String teachername;
    static int globalkey = 54321;
    public int floor = 3;

    CantAccessGetSetterUsingConst(int r, String t){
        roonumber = r;
        teachername = t;

    }
}
 class School{
     public static void main(String[] args) {
         System.out.println(CantAccessGetSetterUsingConst.globalkey);
         CantAccessGetSetterUsingConst cs = new CantAccessGetSetterUsingConst(101,"Mr Anderson");

         System.out.println(cs.floor);
         System.out.println(cs.teachername);
         //System.out.println(cs.);

         // won't be able to access private everything else is possible to access and declare different values
         // so cs.roonumber will not work because its set to private
         // private variable can be accessed only thru getters and setters

     }
}
