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
            test(L);
        } else if(d%2!=0){
            Kwadrat K = new Kwadrat(d);
            test(K);
        }
    }
    static void test(Figura f){
        int d;
        Class a = f.getClass();
        String s = a.getName();
        if(s == "Linia"){
            f.rysuj();
        } else if(s == "Kwadrat"){
            int P;
            f.rysuj();
            P = f.dlugosc*f.dlugosc;
            System.out.print("\nPole kwadratu: "+P+"\n");
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