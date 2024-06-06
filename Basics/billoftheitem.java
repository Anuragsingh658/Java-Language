/*enter the cost of 3 item from thr user (using float data) a pencil, a pen, a eraser. 
you have to output the total cost of the items back to the user as their bill.
(Add on)-->you can also try adding 18% GST tax to the item in the bill as an advanced problem */


import java.util.*;
public class billoftheitem {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three values");
        float pencil= sc.nextFloat();
        float pen= sc.nextFloat();
        float eraser= sc.nextFloat();

        float total= pencil+pen+eraser;

        System.out.println("Bill is:"+total);
        float newtotal= total+(0.18f*total);
        System.out.println("Bill with 18% tax:"+newtotal);
    }
}
