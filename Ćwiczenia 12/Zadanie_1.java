import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        File f=new File("numbers.dat");
        RandomAccessFile plik;
        double[] tab = {1.2, 3.6, 5.9, 2, 4.2};
        double c;
        try {
            plik = new RandomAccessFile(f,"rw");
            for(int i=0; i<tab.length; i++){
                plik.writeDouble(tab[i]);
            }
            plik.seek(0);
            try{
                for(int i=0; i<7; i++){
                    c=plik.readDouble( );
                    System.out.print("\n"+c+" \n");
                }
            }
            catch (EOFException exc){
                System.out.print("\nKoniec Pliku\n");
                System.exit(2);
            }
            plik.close();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.print("\nSkładnia: CopyFile in out\n");
            System.exit(1);
        }
        catch (FileNotFoundException exc){
            System.out.print("\nPlik nie istnieje\n");
            System.exit(2);
        }
        catch (IOException exc){
            System.out.print("\nInny błąd we/wy\n");
            System.exit(3);
        }
    }
}
