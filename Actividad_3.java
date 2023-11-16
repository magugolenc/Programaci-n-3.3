import java.util.Scanner;

public class Actividad_3 {
	public static double mediaPositivo(int[] media) {
		int suma=0;
		int numeros=0;
		for (int i : media) {
			if (i>0) {
				suma+=i;
				numeros++;
			}
			}
		if (numeros==0) {
			System.out.println("No hay numeros positivos.");
			return 0;
		}
		else {
			double mediaNum = suma/numeros;
			return mediaNum;
		}
}
	
	public static double mediaNegativo(int[] media) {
		int sumaNegativa=0;
		int numeros=0;
		for (int i : media) {
			if (i<0) {
				sumaNegativa+=i;
				numeros++;
			}
		}
		if (numeros==0) {
			System.out.println("No hay numeros negativos.");
			return 0;
		}
		else {
			double mediaNum = sumaNegativa/numeros;
			return mediaNum;
		}
}
	
	public static void main (String[]args) {
		Scanner tc=new Scanner(System.in);
		System.out.println("Cuantos numeros desea introducir");
		int max=tc.nextInt();
		int contarCeros=0;
		int introducidos = 0;
		int[] n = new int [max];
		for (int i=0;i<max;i++) {
			System.out.println("Introduce el numero que se guardara en la posicion "+i+" del array.");
			introducidos = tc.nextInt();
			n [i]=introducidos;
			if (introducidos == 0) {
				contarCeros++;
			}
		}
		
		System.out.println("Se han introducido "+ max + " valores, de los cuales su valor es 0: " + contarCeros + " veces.");
		System.out.println("La media de los numeros positivos es: "+ mediaPositivo(n) + ".");
		System.out.println("La media de los numeros negativos es: "+ mediaNegativo(n) + ".");
	}
}
