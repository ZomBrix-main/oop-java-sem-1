import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        Prostokat p1 = new Prostokat();
        Prostokat p2 = new Prostokat(3, 4);
        KolorowyProstokat c1 = new KolorowyProstokat();
        KolorowyProstokat c2 = new KolorowyProstokat(3, 4, 1);
        p1.ustawParProst(2, 5);
        c1.ustawParProstKolor(2, 5, 2);
	    p1.rysujProst();
        p2.rysujProst();
        c1.rysujProstKolor();
        c2.rysujProstKolor();

    }
}
class Prostokat{

    private int dl;
    private int szer;

    public int getdl(){
        return dl;
    }

    public int getszer(){
        return szer;
    }

    public Prostokat(){
        this.dl = 0;
        this.szer = 0;
    }

    public Prostokat(int a, int b){
        this.dl = a;
        this.szer = b;
    }

    void ustawParProst(int a, int b){
        dl = a;
        szer = b;
    }

    void rysujProst(){
        System.out.println("Rysowanie prostokąta a: " +dl+" b: "+ szer);
    }
}
class KolorowyProstokat extends Prostokat{

    int kolor;

    KolorowyProstokat(){
        this.kolor = 0;
    }

    KolorowyProstokat(int a, int b, int c){
        super(a,b);
        this.kolor = c;
    }

    void ustawParProstKolor(int a, int b, int c){
        super.ustawParProst(a,b);
        kolor = c;
    }

    void rysujProstKolor(){
        super.rysujProst();
        System.out.println("Kolor: "+kolor);
    }
}