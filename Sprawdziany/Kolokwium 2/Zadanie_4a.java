import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        Pracownik p1 = new Pracownik("Gleiz", "Hektor", 5789.74);
        Pracownik p2 = new Pracownik("Gleiz", "Serth", 3469.63);
        Pracownik p3 = new Pracownik();
        Pracownik p4 = new Pracownik();
        try{
            FileOutputStream fileOut = new FileOutputStream("pracownikser1.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(p1);
            out.writeObject(p2);
            out.close();
            fileOut.close();
            FileInputStream filein = new FileInputStream("pracownikser1.dat");
            ObjectInputStream in = new ObjectInputStream(filein);
            p3 = (Pracownik) in.readObject();
            p4 = (Pracownik) in.readObject();
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
class Pracownik implements Serializable{

    String nazwisko;
    String imie;
    double dochod;

    Pracownik(){}

    Pracownik(String N, String I, double d){
        this.nazwisko = N;
        this.imie = I;
        this.dochod = d;
    }

    void podajDane(String N, String I, double d){
        nazwisko = N;
        imie = I;
        dochod = d;
    }

    void drukujDane(){
        System.out.println("Imię: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Dochód: " +dochod);
    }
}