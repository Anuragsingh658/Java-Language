public class FunOverparameter {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(5, 7));
        System.out.println(sum(9, 5, 9));
    }
}
