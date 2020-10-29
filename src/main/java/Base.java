public class Base {
    public void test() {
        System.out.println("Base ");
    }

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();
        // Drived B Dervied B  // the right answer is
        // whatever is coming last will get called
    }
}
