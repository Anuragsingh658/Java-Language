// User know it is either positive or negative
import java.util.*;
public class FindPositive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>0){
            System.out.println("x is positive");
        }
        else{
            System.out.println("x is negative");
        }
    }
}