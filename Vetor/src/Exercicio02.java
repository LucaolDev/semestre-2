import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] x = new int[10];
		int par = 0, impar = 0;

		for (int i = 0; i < x.length; i++) {
			System.out.println("Numero --> ");
			x[i] = in.nextInt();
			
			if(x[i] % 2 == 0) {
				par += 1;
			}else {
				impar +=1;
			}
			
			
		}
		
		System.out.println("pares = " + par + " impares = " + impar);
	}
}
