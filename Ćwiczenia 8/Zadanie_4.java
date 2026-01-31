import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Student S = new Student("Faworny","Franciszek");
        double o1, o2;
        do{
            System.out.print("Podaj ocenę 1:");
            while(! sc.hasNextDouble()){
                System.out.print("Blad, podaj poprawnie:");
                sc.next();
            }
            o1=sc.nextDouble();
            System.out.print("Podaj ocenę 2:");
            while(! sc.hasNextDouble()){
            System.out.print("Blad, podaj poprawnie:");
            sc.next();
            }
            o2=sc.nextDouble();
        }
        while(!S.oceny(o1,o2));
        S.wypisz();
    }
}

class Student{
    String nazwisko;
    String imie;
    private double o1;
    private double o2;
    double srednia;
    boolean oceny(double oc1, double oc2){
        if(oc1<2){
            return false;
        } 
        else if(oc1>5){
            return false;
        } 
        else if(oc2<2){
            return false;
        }
        else if(oc2>5){
            return false;
        }
        else{
            o1      = oc1;
            o2      = oc2;
            srednia = (o1+o2)/2;
            return true;
        }
    }
    Student(String n, String i){
        nazwisko = n;
        imie     = i;
    }
    void wypisz(){
        System.out.print("\nNazwiso: "+nazwisko);
        System.out.print("\nImię: "+imie);
        System.out.print("\nOcena 1: "+o1);
        System.out.print("\nOcena 2: "+o2);
        System.out.print("\nŚrednia: "+srednia);
    }
}