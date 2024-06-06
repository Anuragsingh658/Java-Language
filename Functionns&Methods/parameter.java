import java.util.*;
public class parameter {
    /*public static void CalculateSum(){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Sum = a+b;
        System.out.println("Sum is:" + Sum);
    }
public static void main(String args[]){
    CalculateSum();
}
}*/

                 //After using parameter


public static int CalculateSum(int a, int b){//formal parameters is use as definition or function
    int sum = a+b;
    return sum;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Sum = CalculateSum(a,b);//actual parameters or arguments use as a calling
        System.out.println("Sum is:" + Sum);
    }
}