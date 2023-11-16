import java.util.Scanner;

public class Actividad_2 {
public static void main (String[]args) {
	Scanner tc=new Scanner(System.in);
	System.out.println("Cuantos numeros desea introducir");
	int max=tc.nextInt();
	
	int[] numInverso = new int [max];
	for (int i=0;i<max;i++) {
		System.out.println("Introduce el numero que se guardara en la posicion "+i+" del array.");
		int introducidos = tc.nextInt();
		numInverso [i]=introducidos;
	}
	for (int j=max-1;j>=0;j--) {
		System.out.println("Array "+j+": "+numInverso[j]);
	}
}
}
