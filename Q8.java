/**
 * Created by learn on 03/10/22.
 */
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner input=new Scanner(System.in);
        System.out.println("input the first num ");
        n1=input.nextInt();
        System.out.println("input the second num ");
        n2=input.nextInt();
        System.out.println("the sum="+(n1+n2));
        System.out.println("the difference="+(n1-n2));
        System.out.println("the product="+(n1*n2));
        System.out.println("the average="+(((n1+n2)/2)));
        System.out.println("the distance="+(n1%n2));
        System.out.println("the maximum="+Math.max(n1,n2));
        System.out.println("the minimum="+Math.min(n1,n2));

    }
}
