import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	
	static String[] lista = new String[3];
	static String palavraSecreta;
	static char[] letraDescoberta;
	static int erro = 0;
	static char letra;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rd = new Random();
		
		//armazenar a palavras
		System.out.println("Digite as palavras");
		for (int i = 0; i < lista.length; i++) {
			lista[i] = in.next().toUpperCase();
		}
		
		//escolher palavra aleatoriamente
		palavraSecreta = lista[rd.nextInt(lista.length)];
		letraDescoberta =  new char[palavraSecreta.length()];
		for (int i = 0; i < letraDescoberta.length; i++) {
			letraDescoberta[i] = '_';
		}
		
		//loop para jogar
		while(erro < 6 && !descobrir()) {
			System.out.println("A palavra eh: ");
			for (char ch : letraDescoberta) {
				System.out.print(ch + "");
			}
			System.out.println("\nDigite uma letra: ");
			letra = in.next().toUpperCase().charAt(0);
			
			if(!verificar()) {
				erro++;
				System.out.println("Você errou pela " + erro + "a");
			}
			System.out.println();
		}
		
		
		
	}
	
	private static boolean verificar() {
		boolean achou = false;
		for (int i = 0; i < palavraSecreta.length(); i++) {
			if(letra == palavraSecreta.charAt(i)) {
				letraDescoberta[i] = letra;
				achou = true;
			}
		}
		return achou;
	}

	private static boolean descobrir() {
		for (char ch : letraDescoberta) {
			if (ch == '_') {
				return false;				
			}
		}
		return true;
	}
}
