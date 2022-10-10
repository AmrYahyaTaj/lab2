/**
 * Created by learn on 03/10/22.
 */
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        float area,perimeter,height,offer;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the height: ");
        height=input.nextFloat();
        System.out.println("enter the offer: ");
        offer=input.nextFloat();
        area=height*offer;
        perimeter=2*(height*offer);
        System.out.println("area="+area);
        System.out.println("perimeter="+perimeter);


    }
}
