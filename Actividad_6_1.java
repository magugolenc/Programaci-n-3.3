import java.util.Arrays;

public class Actividad_6_1 {
public static int[] burbujita(int[] b) {
	int aux;
    for (int i = 0; i < b.length - 1; i++) {
        for (int j = 0; j < b.length - i - 1; j++) {                                                              
            if (b[j + 1] < b[j]) {
                aux = b[j + 1];
                b[j + 1] = b[j];
                b[j] = aux;
            }
        }
    }
	return b;
	
}
public static int[] sinRepetidos(int t[]) {
	int [] t1=new int [t.length];
	int [] t2=new int [t1.length];
	int i=0;
	int j=0;
	int k=0;
	int repetidos=0;
	int [] t3=new int [t2.length];
	while (i<t1.length) {
		t1 [i]=t [i];
		i++;
			}
	while (j<t2.length) {
		t2[j]=t1[j];
		j++;
	}
	i=0;
	while (k<t2.length) {
		if (t2[k]==t1[i]) {
			repetidos++;
		}
		else {
			t2[k]=t1[i];
		}
		k++;
		
		if (repetidos<=1) {
			t3[k]=t2[k];
		}
		i++;
	}
	
	return t2;
	
}
public static void main (String []args) {
int [] array1= {3,4,5,8,5,4};
int [] array2= {7,5,4,6,6,2};
int [] fusion=new int [12];

for (int i=0;i<6;i++) {
	fusion[i]=array1[i];
}
for (int j=0;j<6;j++) {
		fusion[j+6]=array2[j];
}
System.out.println("Los datos finales sin ordenar son:");
for (int h=0;h<fusion.length;h++) {
	System.out.println("Fusión ["+h+"] = "+fusion[h]);
}
System.out.println("Los datos finales ordenados son:");
System.out.println(Arrays.toString(burbujita(fusion)));
System.out.println("Los datos sin repetidos del array son: "+Arrays.toString(sinRepetidos(fusion)));
}
}
