import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Podaj ocenę 1:");
        while(! sc.hasNextDouble()){
            System.out.print("Blad, podaj poprawnie:");
            sc.next();
        }
        double o1=sc.nextDouble();
        System.out.print("Podaj ocenę 2:");
        while(! sc.hasNextDouble()){
            System.out.print("Blad, podaj poprawnie:");
            sc.next();
        }
        double o2=sc.nextDouble();
        Student S = new Student("Faworny","Franciszek",o1,o2);
        S.wypisz();
    }
}
class Student{
    String nazwisko;
    String imie;
    double o1;
    double o2;
    double srednia;
    Student(String n, String i, double x, double y){
        nazwisko = n;
        imie     = i;
        o1       = x;
        o2       = y;
        srednia  = srednia();
    }
    double srednia(){
        double S;
        S=(o1+o2)/2;
        return S;
    }
    void wypisz(){
        System.out.print("\nNazwiso: "+nazwisko);
        System.out.print("\nImię: "+imie);
        System.out.print("\nOcena 1: "+o1);
        System.out.print("\nOcena 2: "+o2);
        System.out.print("\nŚrednia: "+srednia);
    }
}