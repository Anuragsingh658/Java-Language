public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(3.4, 5.6));
        System.out.println(calc.sum(5, 7, 6));
    }
}
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    double sum(double a, double b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}
