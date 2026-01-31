import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        Produkt p1 = new Produkt("Fraktal", 250, 10);
        Produkt p2 = new Produkt("Herbata Olszy", 300, 5);
        Produkt p3 = new Produkt();
        Produkt p4 = new Produkt();
        try{
            FileOutputStream fileOut = new FileOutputStream("pracownikser1.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(p1);
            out.writeObject(p2);
            out.close();
            fileOut.close();
            FileInputStream filein = new FileInputStream("pracownikser1.dat");
            ObjectInputStream in = new ObjectInputStream(filein);
            p3 = (Produkt) in.readObject();
            p4 = (Produkt) in.readObject();
            in.close();
            filein.close();
        }
        catch (IOException i){
            i.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        p1.drukujDane();
        p2.drukujDane();
        p3.drukujDane();
        p4.drukujDane();
    }
}
class Produkt implements Serializable{

    String nazwa;
    int cena;
    int ilosc;

    Produkt(){}

    Produkt(String N, int c, int i){
        this.nazwa = N;
        this.cena = c;
        this.ilosc = i;
    }

    void podajDane(String N, int c, int i){
        nazwa = N;
        cena = c;
        ilosc = i;
    }

    void drukujDane(){
        System.out.println("Nazwa: "+nazwa);
        System.out.println("Cena: "+cena);
        System.out.println("Ilość: " +ilosc);
    }
}