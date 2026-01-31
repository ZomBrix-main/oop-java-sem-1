import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){

        Random r = new Random();

        int d = r.nextInt(20);

        System.out.print("\n Liczba: "+d+"\n");

        if(d%2==0){
            Linia L = new Linia(d);
            L.rysuj();
            Class a = L.getClass();
            System.out.print("\n Klasa: "+a.getName()+"\n");
        } else if(d%2!=0){
            Kwadrat K = new Kwadrat(d);
            K.rysuj();
            Class a = K.getClass();
            System.out.print("\n Klasa: "+a.getName()+"\n");
        }
    }
}

class Figura{

    int dlugosc;

    Figura(int d){
        dlugosc = d;
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