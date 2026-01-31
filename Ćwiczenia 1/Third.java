import java.io.*;
import java.util.*;
import java.text.*;
public class Third{
	public static void main(String args[]){
		int x=3;
		int y=5;
		System.out.println("Suma =" + (x + y) +"\n");
		System.out.println("Roznica =" + (x - y) +"\n");
		System.out.println("Iloczyn =" + (x * y) +"\n");
		System.out.println("modulo x/y =" + (x % y) +"\n");
		System.out.println("modulo y/x =" + (y % x) +"\n");
		System.out.println("Suma modulo =" + ((x % y)+(y % x)) +"\n");
	}//Koniec definicji metody main()
}//Koniec definicji klasy publicznej First