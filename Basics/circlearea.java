import java.util.*;
public class circlearea {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius");
        float radius=sc.nextFloat();
        float area= 3.14f*radius*radius;
        System.out.println(area);
    }
}