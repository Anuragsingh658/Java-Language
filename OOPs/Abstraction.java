public class Abstraction {
    public static void main(String[] args){
        Dog d = new Dog();
        d.walk();
        d.eat();
        System.out.println(d.color);
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor is called");
    }
    // Animal(){
    //     color = "Brown";
    // }
    void eat(){                         //non-abstract functions
        System.out.println("Animal Eats");
    }
    abstract void walk();               //abstract function
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor is called");
    }
    void changecolor(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("Horse has 4 legs");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog Constructor is called");
    }
    void changecolor(){
        color = "Dark Black";
    }
    void walk(){
        System.out.println("Dog has also 4 Legs");
    }
}