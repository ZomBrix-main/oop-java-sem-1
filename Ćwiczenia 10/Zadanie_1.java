import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){

        Trojkat t = new Trojkat();
        System.out.println("Pole Trójkąta: "+t.Ptk(2,4));
        Kwadrat k = new Kwadrat();
        System.out.println("Pole Kwadratu: "+k.Pkw(5));
        Prostokat p = new Prostokat();
        System.out.println("Pole Prostokąta: "+p.Ppk(3,7));
        Trapez tr = new Trapez();
        System.out.println("Pole Trapezu: "+tr.Ptp(3, 5, 7));
    }
}

interface Obliczenia{

    double Ptk(double a, double h);
    double Pkw(double a);
    double Ppk(double a, double b);
    double Ptp(double a, double b, double h);
}

class Adapt implements Obliczenia{

    public double Ptk(double a, double h){return 0;};
    public double Pkw(double a){return 0;};
    public double Ppk(double a, double b){return 0;};
    public double Ptp(double a, double b, double h){return 0;};
}

class Trojkat extends Adapt{

    public double Ptk(double a, double h){
        return (a*h)/2;
    }
}

class Kwadrat extends Adapt{

    public double Pkw(double a){
        return a*a;
    }
}

class Prostokat extends Adapt{

    public double Ppk(double a, double b){
        return a*b;
    }
}

class Trapez extends Adapt{

    public double Ptp(double a, double b, double h){
        return ((a+b)*h)/2;
    }
}