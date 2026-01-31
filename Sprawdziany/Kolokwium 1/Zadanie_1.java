import java.io.*;
import java.util.*;
import java.text.*;
import static java.lang.Math.*;
public class temp{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("Podaj x:");
        while(! sc.hasNextDouble()){
            System.out.print("Blad, podaj poprawne:");
            sc.next();
        }
        double x = sc.nextDouble();

        obliczWyr(x);

    }
    static void obliczWyr(double x){
        double licz, mian, p1, p2, p3, p4, p5, p6;

        p1   = 1/tan(x);
        p2   = pow(E,pow(x,2));
        p3   = atan(x);
        p4   = abs(log(x)/log(2));
        p5   = ceil(x);
        p6   = cbrt(x);
        licz = p1 + p2 + p3;
        mian = p4 + p5 + p6;
        System.out.println("\nLicznik=" + licz + "\nMianownik=" + mian + "\nWynik=" + (licz/mian) +"\n");
    }
}