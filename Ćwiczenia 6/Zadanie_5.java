import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){

        String pzdr = "Greetings";
        char   lit  = pzdr.charAt(0);
        int    cp   = pzdr.codePointAt(0);

        int cp1=0, cp2=0;

        String vall = "\u0041\uD8F0\uDE30";
        cp1         = vall.codePointAt(0);
        cp2         = vall.codePointAt(1);

        System.out.println("Greetings");
        System.out.println("\nLitera 1: "+lit+"\nJednostka kodowa dla 0: "+cp);
        System.out.println("\nVall");
        System.out.println("\nJednostka kodowa dla 0: "+cp1+"Jednostka kodowa dla 1: "+cp2);

        System.out.println("Jednostka kodowa jest znakiem surogatowym :"
        +Character.isSupplementaryCodePoint(cp1));
        System.out.println("Jednostka kodowa jest znakiem surogatowym :"
        +Character.isSupplementaryCodePoint(cp2));
    }
} 