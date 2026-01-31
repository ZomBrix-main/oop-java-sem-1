import java.io.*;
import java.util.*;
import java.text.*;
public class Sixth{
	public static void main(String args[]){
		double gal=3.78541178;
		Scanner sc=new Scanner(System.in);
		System.out.print("Podaj ile galonow:");
		while(! sc.hasNextDouble()){
			System.out.print("Blad, podaj poprawna ilosc:");
			sc.next();
		}
		double x=sc.nextDouble();
		System.out.println("Litry =" + (x * gal) +" l\n");
	}//Koniec definicji metody main()
}//Koniec definicji klasy publicznej First