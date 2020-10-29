public class Person {


    private String name;
    private int age = 25;
    //Compilation fails because this supposed to be a method overloading

    public Person (String name){
        setName(name);

    }

    public Person (String name, int age){
        Person person = new Person("sf",1) ;
        person.setAge(1);
        person.setName("");
        //Person(name);
        setAge(age);
    }
    public  String getName() {
        return name;
    }
    public String show (){
        System.out.println(name + age);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());

        // this is examples when constructor trying to access another constructor and set value
        // that wouldn't work that way
    }
}
