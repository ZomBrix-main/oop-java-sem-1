import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        Comp c1 = new Comp();
        System.out.println(c1.oblDiv(6,2));
        System.out.println(c1.oblSum(5,10));
    }
}
interface Computation{

    double oblSum(double x, double y);
    double oblDiv(double x, double y);
}

class Intermediate implements Computation{

    public double oblSum(double x, double y){return 0;};
    public double oblDiv(double x, double y){return 0;};
}

class Comp extends Intermediate{

    public double oblSum(double x, double y){
        return x+y;
    }

    public double oblDiv(double x, double y){
        return x/y;
    }
}