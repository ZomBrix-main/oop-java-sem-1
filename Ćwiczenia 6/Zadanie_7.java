import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){

        String str = "zielony,niebieski,czerwony";
        String results[] = str.split(",");
        
        for(int i=0; i<results.length; i++){
            System.out.println("Łańcuch "+(i+1)+" po rozdzieleniu: "+results[i]);
        }
    }
}

