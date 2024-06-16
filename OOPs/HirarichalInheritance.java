public class HirarichalInheritance {
    public static void main(String[] args) {
        Fish d = new Fish();
        d.swim();
    }
}

//base class
class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
    void Breathe(){
        System.out.println("Animal color is Green");
    }
}

// derived class
class Mammals extends Animal{
    void walk(){
        System.out.println("Animal walk");
    }
}
// derived class
class Fish extends Animal{
    void swim(){
        System.out.println("Fish Swim");
    }
}

// derived class
class Bird extends Animal{
    void fly(){
        System.out.println("Birdds Fly");
    }
}
