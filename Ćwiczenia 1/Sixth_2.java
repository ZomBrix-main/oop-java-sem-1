import java.io.*;
import java.util.*;
import java.text.*;
public class Sixth_2{
	public static void main(String args[]){
		double gal=3.78541178;
		double x;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.print("Podaj ile galonow:");
			while(! sc.hasNextDouble()){
				System.out.print("Blad, podaj poprawna ilosc:");
				sc.next();
			}
		x=sc.nextDouble();
		}
		while(x>0);
		/*System.out.print("Podaj ile galonow:");
		while(! sc.hasNextDouble()){
			System.out.print("Blad, podaj poprawna ilosc:");
			sc.next();
		}
		double x=sc.nextDouble();*/
		System.out.println("Litry =" + (x * gal) +" l\n");
	}//Koniec definicji metody main()
}//Koniec definicji klasy publicznej First