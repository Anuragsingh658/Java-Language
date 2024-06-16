public class Inheritance {
    public static void main(String[] args) {
    Fish s1 = new Fish();
    s1.swim();
    }
}

//base class or parent class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

//derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("fish swims");
    }
}
