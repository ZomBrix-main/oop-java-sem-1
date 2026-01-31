import java.io.*;
import java.util.*;
import java.text.*;
public class temp{
    public static void main(String args[]){
        String lan="0x";
        int lHex=0, lsoHex=0, lsd1Hex=0, lsd2Hex=0, WSHex=0, DSHex=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\nPodaj x (między 10000 a 10FFFF): ");
            String lan2=lan+sc.next();
            lHex=Integer.decode(lan2);
        }
        while(lHex<65536&&lHex>111411);
        String so="0x10000";
        lsoHex=Integer.decode(so);
        String sd1="0xD800";
        lsd1Hex=Integer.decode(sd1);
        String sd2="0xDC00";
        lsd2Hex=Integer.decode(sd2);
        WSHex=lsd1Hex+(lHex-lsoHex);
        DSHex=lsd2Hex+(lHex-lsoHex);
        System.out.println("\nWyższy surogat int: " + WSHex);
        System.out.printf("\nWyższy surogat hex: 0x%x", WSHex);
        System.out.println("\nDolny surogat int: " + DSHex);
        System.out.printf("\nDolny surogat hex: 0x%x", DSHex);
    }
}