package whatisoutput;

public class Cat {

    public String name;

    public void parseName(){
        System.out.println("1");
        try {
            System.out.println("2");
            int x = Integer.parseInt(name);
            System.out.println("3");
        }catch (NullPointerException e){
            System.out.println("4");
        }
        System.out.println("5");
    }

    public static void main(String[] args) {
        Cat leo = new Cat();
        leo.name = "Leo";
        leo.parseName();
        System.out.println("6");

        // this will print only 1 and 2 follwed by NuberForamtException
        // when the Exception is thrown below the code won't get
        // executed
        // if you are catching a wrong exception then it will throw
        // Exception is catching everything but in our case here
        // it wont' catch the NullPointerException
        // because it will be NubmerFormatException
    }
}
