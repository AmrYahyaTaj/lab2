/**
 * Created by learn on 03/10/22.
 */
import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
        float area,n,perimeter;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the radius: ");
        n=input.nextFloat();
        area=(22/7*(n*n));
        perimeter=22/7*n*2;
        System.out.println("area="+area);
        System.out.println("perimeter="+perimeter);
    }
}
