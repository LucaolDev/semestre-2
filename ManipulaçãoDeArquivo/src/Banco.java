import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Banco {

	static int tamanho = 5;
	static String[] cpf = new String[tamanho];
	static String[] nome = new String[tamanho];
	static String[] saldo = new String[tamanho];

	public static void menu() {
		int opcao;
		
		while(true) {
			try {
			    opcao = parseInt(showInputDialog(montarMenu()));
			    if (opcao == 6) {
				    break;
			    }
			    
			    if(opcao < 1 || opcao > 6) {
			    	showMessageDialog(null, "a opção deve ser um número entre 1 e 6");
			    }else {
			    	switch(opcao) {
			    	case 1: 
			    		abrirConta();
			    		break
			    	}
			    }
		    }
			catch(NumberFormatException e) {
				showMessageDialog(null, "A opção deve ser um numero");
		    }
	    }
		
     }

	private static String montarMenu() {
		StringBuilder builder = new StringBuilder();
		builder.append("Escolha uma operação\n").append("1. Abrir conta\n").append("2. Sacar\n")
				.append("3. Depositar\n").append("4. Consultar saldo\n").append("5. Fechar conta\n")
				.append("6. Finalizar\n");
		return builder.toString();
	}
}
