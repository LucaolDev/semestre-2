import javax.swing.JOptionPane;

public class Ex04 {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Boa noite ");
		String nome = JOptionPane.showInputDialog("Qual seu nome");
		JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("primeiro valor"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("segundo valor"));
		int resultado = x + y;
		JOptionPane.showMessageDialog(null, "resultado = " + resultado);
		
	}
}
