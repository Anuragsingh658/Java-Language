public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name();
    }
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.println("Animal eats");
    }
    void color(){
        System.out.println("Animal color is Green");
    }
}

// derived class
class Mammals extends Animal{
    int legs;
    void legs(){
        System.out.println(4);
    }
}

// derived class from derived class
class Dog extends Mammals{
    String name;
    void name(){
        System.out.println("Jhony");
    }
}