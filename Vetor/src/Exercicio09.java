import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double folhaP = 0;

		System.out.println("Digite o total de funcionários ");
		int rep = in.nextInt();

		String[] nome = new String[rep];
		int[] salario = new int[rep];

		for (int i = 0; i < rep; i++) {
			in.nextLine();
			System.out.println("Digite o seu nome ");
			nome[i] = in.nextLine();
			System.out.println("Digite seu salário ");
			salario[i] = in.nextInt();

			folhaP += salario[i];

		}
		System.out.println("Folha de pagamento é " + String.format("%.2f", folhaP));
		System.out.println("A média salaria é de " + String.format("%.2f", folhaP/rep));

		
	}
}
