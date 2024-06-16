public class MethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog Eats");
    }
}

