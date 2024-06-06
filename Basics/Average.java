import java.util.*;
public class Average{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a three number");
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        int Average= (A+B+C)/3;
        System.out.println(Average);
    }
}