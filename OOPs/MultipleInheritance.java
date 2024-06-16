public class MultipleInheritance {
    public static void main(String[] args){
        Bear b = new Bear();
        b.grass();
        b.meat();
    }
}
interface Herbivore{
    void grass();
}
interface Carnivore{
    void meat();
}

class Bear implements Herbivore, Carnivore{
    public void grass(){
        System.out.println("Bear eat grass");
    }
    public void meat(){
        System.out.println("Bear eat meat also....");
    }
}
