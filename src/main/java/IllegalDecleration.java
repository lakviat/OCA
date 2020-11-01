import java.util.ArrayList;

public class IllegalDecleration {

    public void moreA(int... nums){

    }
    public void moreB(String values, int... nums){

    }
    // public void moreC(int... nums, String values){}
    // this method won't work becase thre dots will work only with
    // int values and should be passed only one in the method signature

    // public void moreD(String... values, int... nums)
    // this won't work as well reference is the explanation above

    // public void moreE(String [] values, ...int nums)
    // same thing here it won't work because three dots should be only once

    // public void more F(String... values, int [] nums)
    // same thing it won't work

    // public void moreG(String [] values, int[] nums)
    // same thing here it won't work because the above parametrs
}
