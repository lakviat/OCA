package Exceptioins;

public class Exception {
    public static void main(String[] args) {
        System.out.println("A");
        try{
            System.out.println("B");
        throw new IllegalArgumentException();
        }catch (IllegalArgumentException e){
            System.out.println("c");
            throw  new RuntimeException("1");
        }catch (RuntimeException e){
            System.out.println("D");
            throw new RuntimeException("2");
        }finally {
            System.out.println("e");
            throw  new RuntimeException("3");
        }
    }
}
