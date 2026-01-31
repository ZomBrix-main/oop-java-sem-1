import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){

        int d, w;

        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Podaj figurę (1-linia, 2-kwadrat):");
            while(! sc.hasNextInt()){
                System.out.print("Blad, podaj poprawnie:");
                sc.next();
            }
            w = sc.nextInt();
            System.out.print("Podaj długość:");
            while(! sc.hasNextInt()){
                System.out.print("Blad, podaj poprawnie:");
                sc.next();
            }
            d = sc.nextInt();

            if(w==1){
                Linia L = new Linia(d);
                L.rysuj();
            } else if(w==2){
                Kwadrat K = new Kwadrat(d);
                K.rysuj();
            }
        } while(w!=1 && w!=2);

    }
}

abstract class FiguraN{

    int dlugosc;

    FiguraN(int d){
        dlugosc = d;
    }
    void rysuj(){
        System.out.print("\n-- Rysowanie --");
    }
}
class Linia extends FiguraN{

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
class Kwadrat extends FiguraN{

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