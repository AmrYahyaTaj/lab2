/**
 * Created by learn on 03/10/22.
 */
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number 1: ");
        n1=input.nextInt();
        System.out.println("enter the number 2: ");
        n2=input.nextInt();
        n3=n1;
        n1=n2;
        n2=n3;
        System.out.println("number 1 ="+n1);
        System.out.println("number 2 ="+n2);
    }
}
