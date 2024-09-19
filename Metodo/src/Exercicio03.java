import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x, y, z;
		
		System.out.print("Informe o primeiro valor: ");
		x = in.nextInt();
		System.out.print("Informe o segundo valor: ");
		y = in.nextInt();
		System.out.print("Informe o terceiro valor: ");
		z = in.nextInt();
		
		in.close();
		
		System.out.println("Maior valor inserido: " + maiorValor(x, y, z));
	}
	
	public static int maiorValor (int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		}
		return c; 
	}
}
