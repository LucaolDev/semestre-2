import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int[] x = new int[10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("Numero --> ");
			x[i]= in.nextInt();
			if(x[i] > maior) {
				maior = x[i];
			}
			
			if(x[i] < menor) {
				menor = x[i];
			}
		}
		
		System.out.println("maior = " + maior + " menor = " + menor);
	}
}
