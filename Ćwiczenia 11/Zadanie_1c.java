import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
class szkalujo extends Exception{
    public szkalujo(String errorMessage){
        super(errorMessage);
    }
}
public class temp{
    static void f(double l) throws szkalujo{
        if(l==2137){
            throw new szkalujo("\nNie wolno szkalować świętego Jana Pawła II");
            
        }
        else{
            System.out.print("\nPapież bezpieczny wynik: "+l);
        }
    }
    public static void main(String args[]){
        double tab[] = {0, 0, 2000, 100, 30, 7, 0, 0, 0, 0};
        double suma=0;
        for(int i=0; i<10; i++){
            suma=suma+tab[i];
        }
        try{
            f(suma);
        }
        catch(szkalujo e){
            System.out.print("\nAle tak papieża?");
            System.out.print("\nKomunikat systemowy: "+e.getMessage());
        }
    }
}