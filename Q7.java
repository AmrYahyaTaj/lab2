/**
 * Created by learn on 03/10/22.
 */
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        int sq,cb,n,c;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number : ");
        n=input.nextInt();
        sq=n*n;
        cb=n*n*n;
        System.out.println("the number is="+n);
        System.out.println("the square is="+sq);
        System.out.println("the cube is="+cb);
        System.out.println("the fourth power is="+Math.pow(n,4));
        System.out.println("the fifth power is="+Math.pow(n,5) );

    }
}
