import java.util.Iterator;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] x = new int[10];
		int aux, j;

		for (int i = 0; i < x.length; i++) {
			System.out.println("Valor: ");
			x[i] = in.nextInt();
		}
		
//		j = x.length - 1;
//		for (int i = 0; i < x.length / 2; i++) {
//			aux = x[i];
//			x[i] = x[j];
//			x[j]= aux;
//			j--;
//		}
		
		for (int i = 0; i < x.length / 2; i++) {
			aux = x[i];
			x[i] = x[x.length -1 -i];
			x[x.length -1 -i] = aux;
		}
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");

		}
	}
}
