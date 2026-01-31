import java.io.*;
import java.util.*;
import java.text.*;
import static java.lang.Math.*;
public class zadanie_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Podaj x:");
        while(! sc.hasNextDouble()){
            System.out.print("Blad, podaj poprawne:");
            sc.next();
        }
        double x=sc.nextDouble();
        double licz, mian, p1, p2, p3, p4, p5, p6, p7;
        p1=log(x-1)/log(2);
        p2=cbrt(1/tan(x));
        p3=ceil(pow(3,x));
        p4=pow(E,pow(x,3));
        p5=tan(x);
        p6=log(abs(sin(x)));
        p7=pow(PI,x);
        licz=p1+p2+p3+p4;
        mian=p5+p6+p7;
        System.out.println("\nLicznik=" + licz + "\nMianownik=" + mian + "\nWynik=" + (licz/mian) +"\n");
    }
}