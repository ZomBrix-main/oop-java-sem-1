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
}
