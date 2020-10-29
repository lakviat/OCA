import java.io.IOException;

public class GivenContentOfThreeFiles {

    static double area;
    int b = 2, h = 3;

    public static void main(String[] args) {
        double p, b, h;
        if(area == 0){
            b = 3;
            h = 4;
            p = 0.5;

        }
       /*  area = p * b * h;  */
        // it will give an error because before multiplcation
        // we have to initialize the variables it won't compile here

        System.out.println(area);
    }
    }
