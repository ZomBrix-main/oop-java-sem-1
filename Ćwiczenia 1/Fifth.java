import java.io.*;
import java.util.*;
import java.text.*;
public class Fifth{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Podaj x:");
		while(! sc.hasNextDouble()){
			System.out.print("Blad, podaj poprawny x:");
			sc.next();
		}
		double x=sc.nextDouble();
		Scanner sc2=new Scanner(System.in);
		System.out.print("Podaj y:");
		while(! sc2.hasNextDouble()){
			System.out.print("Blad, podaj poprawny y:");
			sc2.next();
		}
		double y=sc2.nextDouble();
		System.out.println("Suma =" + (x + y) +"\n");
		System.out.println("Roznica =" + (x - y) +"\n");
		System.out.println("Iloczyn =" + (x * y) +"\n");
		System.out.println("iloraz x/y =" + (x / y) +"\n");
		System.out.println("Iloraz y/x =" + (y / x) +"\n");
	}
}