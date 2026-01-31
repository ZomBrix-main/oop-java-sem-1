import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        Obl c1 = new Obl();
        System.out.println(c1.obRoz(6,2));
        System.out.println(c1.oblMnoz(5,10));
    }
}
interface Obliczenia{

    double obRoz(double x, double y);
    double oblMnoz(double x, double y);
}

class Adapt implements Obliczenia{

    public double obRoz(double x, double y){return 0;};
    public double oblMnoz(double x, double y){return 0;};
}

class Obl extends Adapt{

    public double obRoz(double x, double y){
        return x-y;
    }

    public double oblMnoz(double x, double y){
        return x*y;
    }
}