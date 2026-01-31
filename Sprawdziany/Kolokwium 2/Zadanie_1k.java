import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class temp{
    static void read2D(int w, int k, int[][] tab){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                tab[i][j] = sc.nextInt();
            }
        }
    }
    static int[] compute(int[][] tab){
        int sumy[] = new int[tab[0].length];
        int sumaT = 0;
        for(int j=0; j<tab[0].length; j++){
            for(int i=0; i<tab.length; i++){
                    sumaT = sumaT + tab[i][j];
            }
            if(sumaT<=100) sumy[j]=sumaT;
        }
        return sumy;
    }
    public static void main(String Argv[]){
        int[][] a = new int[10][10];
        temp.read2D(10, 10, a);
        int[] b;
        b = temp.compute(a);
        try{
            FileOutputStream fileOut = new FileOutputStream("mac.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(int i=0; i<10; i++){
                out.writeObject(b[i]);
            }
            out.close();
            fileOut.close();
            FileInputStream filein = new FileInputStream("mac.dat");
            ObjectInputStream in = new ObjectInputStream(filein);
            for(int i=0; i<10; i++){
                System.out.println(in.readObject());
            }
            in.close();
            filein.close();
        }
        catch (IOException i){
            i.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}