import java.util.*;
import static java.lang.Math.*;

public class temp{
	public static void main(String []args){
		System.out.print("Podaj liczba a: ");
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNextDouble()){
			System.out.println("Blad. Podaj liczbe a: ");
			sc.next();
		}
		double a = sc.nextDouble();
		
		System.out.print("Podaj liczba b: ");
		while(!sc.hasNextDouble()){
			System.out.println("Blad. Podaj liczbe b: ");
			sc.next();
		}
		double b = sc.nextDouble();
		
		System.out.print("Podaj liczba c: ");
		while(!sc.hasNextDouble()){
			System.out.println("Blad. Podaj liczbe c: ");
			sc.next();
		}
		double c = sc.nextDouble();
		
		if(a==0){
			System.out.println("Równianie jest liniowe");
			double x = -c/b;
			System.out.printf("Wynik: %.5f", x); 
		}

		if(a==0 && c==0){
			System.out.println("Równanie jest tożsamościowe");
		}
		
		double delta = b*b-4*a*c;
		double deltaP = sqrt(abs(delta));
		if(delta>0){
			double x1 = (b*(-1)+deltaP)/(2*a);
			double x2 = (b*(-1)-deltaP)/(2*a);
			System.out.println("Wyniki:");
			System.out.printf("%.5f, %.5f", x1, x2);
		}
		else if(delta==0){
			double x = (b*(-1))/(a*2);
			System.out.println("Wynik:");
			System.out.printf("%.5f", x);
		}
		else{
			System.out.println("Równanie nie ma rozwiązan rzeczywistych");
			double x1 = (b*(-1))/(2*a);
			double x2 = deltaP/(2*a);
			System.out.println("Wyniki:");
			System.out.printf("%.5f + %.5fj, ", x1, x2);
			System.out.printf("%.5f - %.5fj", x1, x2);
		}
	}	
}