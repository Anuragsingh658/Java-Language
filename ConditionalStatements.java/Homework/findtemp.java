/*Tempreature OR Thermometer */
import java.util.*;
public class findtemp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp>100) {
            System.out.println("you have a fever");
        }
        else{
            System.out.println("you don't have fever");
        }
    }
}
