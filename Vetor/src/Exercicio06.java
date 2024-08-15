import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int tamanho;
		boolean status = true;

		System.out.println("Tamanho: ");
		tamanho = in.nextInt();
		int[] x = new int[tamanho];
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("Valor: ");
			x[i] = in.nextInt();
		}

		if (tamanho != 1) {
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] % 2 == x[i + 1] % 2) {
					status = false;
					break;
				}
			}
		}
		if(status) {
			System.out.println("É especial");
		}else {
			System.out.println("Não é especial");
		}
	}
}
