import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite um valor inteiro e positivo: ");
		valor = in.nextInt();
		if(valor < 0) {
			System.out.println("Perdeu");
		}
		else {
			imprimir(valor);
		}
	}

	public static void imprimir(int valor) {
		
		for (int i = -valor; i <= valor; i++) {
			if (i != 0 && valor % i == 0) {
				System.out.print(i + "\t");
			}
		}
	}
}
