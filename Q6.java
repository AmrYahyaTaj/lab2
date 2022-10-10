/**
 * Created by learn on 03/10/22.
 */
public class Q6 {
    public static void main(String[] args) {
        String b,c,d,e;int a;
        String s="Hello";
        String t="World";
        a=s.length()+t.length();
        b=s.substring(1,2);
        c=s.substring(s.length()/2,s.length());
        d=s+t;
        e=t+s;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
