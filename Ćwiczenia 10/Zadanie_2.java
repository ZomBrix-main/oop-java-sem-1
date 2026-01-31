import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){

        Tr
    }
}

abstract class Bankier{

    String imie;

    Bankier(String s){
        this.imie = s;
    }

    abstract double licz(double a, double b);
}

class UczciwyBankier extends Bankier{

    super(s);

    public double licz(double a, double b){
        return a+b;
    }
}

class PodstepnyBankier extends Bankier{

    super(s);

    public double licz(double a, double b){
        return 0.8*(a+b);
    }
}