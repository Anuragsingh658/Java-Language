import java.util.*;

public class age2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();

        if (age>=18) {
            System.out.println("Adult:Vote");
        }
        else if (age>=13 && age>18) {
            System.out.println("Tennager");
        }
        else{
            System.out.println("Child");
        }
    }
}
