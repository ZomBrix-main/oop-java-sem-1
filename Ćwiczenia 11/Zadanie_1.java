import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.text.*;
public class temp{
    public static void main(String args[]) throws RuntimeException{

        int tab[] = new int[10];
        try{
            tab[10]=1337;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("\nBłędny indeks tablicy");
        }
        try{
            int liczba = 20/0;
        }
        catch (ArithmeticException e){
            System.out.print("\nWyjątek arytmetyczny");
            System.out.print("\nKomunikat systemowy: "+e.getMessage());
        }
    }
}