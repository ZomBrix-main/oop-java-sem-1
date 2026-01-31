import java.io.*;
import java.util.*;
import java.text.*;
import java.Math.*;
public class temp{
    public static void main(String args[]){
        Box p = new Box(3.5,10.0,5.0);
        double V, a;
        p.wypisz();
        V = p.V();
        a = p.cube(27);
        System.out.print("\nObjętość prostopadłościanu: "+V);
        System.out.print("\nDługość boku sześcianu o V=27: "+a);
    }
}
class Box{
    double a;
    double b;
    double c;
    Box(double x, double y, double z){
        a=x;
        b=y;
        c=z;
    }
    double V(){
        double v;
        v=a*b*c;
        return v;
    }
    double cube(double v){
        double x;
        x=Math.cbrt(v);
        return x;
    }
    void wypisz(){
        System.out.print("\nProstopadłościan o wymiarach a: "+a+" b: "+b+" c: "+c+"\n");
    }
}