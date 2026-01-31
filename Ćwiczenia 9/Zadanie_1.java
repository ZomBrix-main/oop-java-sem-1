import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){

        Figura tab[] = new Figura[4];

        Linia L1   = new Linia(3);
        Linia L2   = new Linia(5);
        Kwadrat K1 = new Kwadrat(4);
        Kwadrat K2 = new Kwadrat(5);

        tab[0] = L1;
        tab[1] = L2;
        tab[2] = K1;
        tab[3] = K2;

        for(int i=0; i<4; i++){
            tab[i].rysuj();
        }
    }
}

class Figura{

    int dlugosc;

    Figura(int d){
        this.dlugosc = d;
    }
    void rysuj(){
        System.out.print("\n-- Rysowanie --");
    }
}
class Linia extends Figura{
    Linia(int l){
        super (l);
    }
    void rysuj(){
        super.rysuj();
        System.out.print("\n--    Lini   --");
        System.out.print("\n");
        for(int i=0; i<dlugosc; i++){
            System.out.print("_");
        }
        System.out.print("\n");
    }
}
class Kwadrat extends Figura{
    Kwadrat(int a){
        super (a);
    }
    void rysuj(){
        super.rysuj();
        System.out.print("\n-- Kwadratu  --");
        System.out.print("\n");
        for(int i=0; i<dlugosc; i++){
            for(int j=0; j<dlugosc; j++){
                System.out.print("o");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}