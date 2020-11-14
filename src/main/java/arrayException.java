import java.util.Collections.*;
import java.util.Collection.*;
public class arrayException {
    public static void main(String[] args) {
        int nums1[] = new int[3];
        int nums2[] = {1,2,3,4,5};
        nums1 = nums2;
        for(int x : nums1){
            System.out.println(x + " : ");
            // i thought it will throw out of bound exception since its fixed size
            // but it actually overwrites the size and prints all of the values
        }
    }
}
