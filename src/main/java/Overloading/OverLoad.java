package Overloading;

public class OverLoad {

    String sig = "";

    public void Overload(String k){
        this.sig = k;
    }

    public String overload(String name){
        name = name;
        System.out.println("First method");
        return name;
    }
    public String overload(String k, int p){
        k = k;
        System.out.println("Second one");
        return k;
    }
    public int overload(int p){
        p = p;
        System.out.println("Third method");
        return p;
    }
    public String overload(String kc, String par){
        System.out.println("Fourth one");
        return kc;
    }
    public void overload(String kl, String pl, String pu){
     // method overriding can be void as well
    }
}
