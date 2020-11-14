package Encapsulation;

public class Encapsulation {

    String name = "";

    public String getName(String k, int p){
        this.name = name;
        return name;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }

    public static void main(String[] args) {
        Encapsulation ck = new Encapsulation();
        ck.setName("Pidar");
        System.out.println(ck.getName("d",1));

        //  getters and setters methods should have return type
        // otherwise its not returning
        // and they can have as many parameters as desired

    }
}
