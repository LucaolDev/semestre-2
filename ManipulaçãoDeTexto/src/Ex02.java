import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String palavra, codificado;
		int deslocamento;

		System.out.println("Palavra a ser codificada --> ");
		palavra = in.next();
		System.out.println("Deslocamento --> ");
		deslocamento = in.nextInt();

		codificado = codificar(palavra, deslocamento);

		System.out.println("Palavra codificada --> " + codificado);

		in.close();
	}

	public static String codificar(String palavra, int deslocamento) {
		char letra, letraCodificada;
		String palavraCodificada = "";

		for (int i = 0; i < palavra.length(); i++) {
			letra = palavra.charAt(i);
			if (Character.isUpperCase(letra)) {
				letraCodificada = (char) ((letra - 'A' + deslocamento) % 26 + 'A');
				palavraCodificada +=  letraCodificada;
			}
		}
		return palavraCodificada;
	}

}
