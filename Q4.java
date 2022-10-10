/**
 * Created by learn on 03/10/22.
 */
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        float n1,n2,n3,average;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number 1: ");
        n1=input.nextFloat();
        System.out.println("enter the number 2: ");
        n2=input.nextFloat();
        System.out.println("enter the number 3: ");
        n3=input.nextFloat();
        average=(n1+n2+n3)/3;
        System.out.println("average="+average);

    }
}
