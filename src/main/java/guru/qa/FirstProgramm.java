package guru.qa;

public class FirstProgramm {
    public static void main(String[] args) {

        int a = 7;
        double b = 5.5;
        double c = a + b;
        int d = (int)(c - b);
        System.out.println("c=" + c);
        if (d == a) {System.out.println("d=" + d);}
        double e = d * c;
        System.out.println("e=" + d + "*" + c + "=" + e);
        double f = e / a;
        System.out.println("f=" + e + "/" + a + "=" + f);
        double g = a % b;
        System.out.println("g=" + a + "%" + b + "=" + g);
        System.out.println("7^2="+Math.pow(a,2));
        int x = 2;
        double y = 3.5;
        double z = 1;
        double p = x + y - z / x * y % x;
        if (p == 2 + 3.5 - 1.75) {System.out.println("p="+p);}
        if (a<b){System.out.println("7<5.5");}
        else if (z>c){System.out.println("1>12.5");}
        else {System.out.println("7>5.5\n12.5>1");}
        if (a<=b || !(c>=e)) {System.out.println("7<=5.5 или 12.5<=87.5");}
        float q = 3.2e38f;
        float inf = (float)Math.pow(q,2);
        System.out.println(inf);
    }
}