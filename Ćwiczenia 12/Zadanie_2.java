import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        Obywatel o1 = new Obywatel("Gleiz", "Hektor", "01142303757", 5789.74);
        Obywatel o2 = new Obywatel("Gleiz", "Serth", "04430506939", 3469.63);
        Obywatel o;
        try{
            FileOutputStream fileOut = new FileOutputStream("obywatelser1.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(o1);
            out.writeObject(o2);
            out.close();
            fileOut.close();
            FileInputStream filein = new FileInputStream("obywatelser1.dat");
            ObjectInputStream in = new ObjectInputStream(filein);
            try{
                for(int i=0; i<7; i++){
                    o= (Obywatel) in.readObject( );
                    o.drukujDane();
                }
            }
            catch (EOFException exc){
                System.out.print("\nKoniec Pliku\n");
                //System.exit(2);
            } 
            catch (ClassNotFoundException e){
                throw new RuntimeException(e);
            }
            in.close();
            filein.close();
        }
        catch (IOException i){
            i.printStackTrace();
        }
        o1.drukujDane();
        o2.drukujDane();
    }
}
class Obywatel implements Serializable{

    String nazwisko;
    String imie;
    String pesel;
    double dochod;

    Obywatel(){}

    Obywatel(String N, String I, String P, double d){
        this.nazwisko = N;
        this.imie = I;
        this.pesel = P;
        this.dochod = d;
    }

    void podajDane(String N, String I, String P, double d){
        nazwisko = N;
        imie = I;
        pesel = P;
        dochod = d;
    }

    void drukujDane(){
        System.out.println("Imię: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Pesel: "+pesel);
        System.out.println("Dochód: " +dochod);
    }
}