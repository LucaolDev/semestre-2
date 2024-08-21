import java.util.Iterator;
import java.util.Scanner;

public class Exercicios09 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double media = 0, folhaP = 0;

		System.out.println("Digite o total de funcionários ");
		int rep = in.nextInt();

		String[] nome = new String[rep];

		int[] salario = new int[rep];

		for (int i = 0; i < rep; i++) {
			System.out.println("Digite o seu nome ");
			nome[i] = in.next();
			System.out.println("Digite seu salário ");
			salario[i] = in.nextInt();
		
			folhaP += salario[i];
			media = folhaP / rep;
			
		}
		System.out.println("Folha de pagamento é " + folhaP + " A média salaria é de " + media);

	}
}
