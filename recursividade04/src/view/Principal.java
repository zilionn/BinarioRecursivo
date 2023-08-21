package view;

import javax.swing.JOptionPane;

import controller.BinarioController;

public class Principal {

	public static void main(String[] args) {
		BinarioController binCont = new BinarioController();
		int n = 0;
		do {
			try {
				String input = JOptionPane.showInputDialog("Digite um número para ser transformado em binário: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrado");
					System.exit(0);
				}
				n = Integer.parseInt(input);
				if (n <= 0 || n > 2000) {
					JOptionPane.showMessageDialog(null, "Número inválido, insira novamente: ");
					continue;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número inválido, insira novamente: ");
				continue;
				} break;
			} while(true);
		JOptionPane.showMessageDialog(null, "O resultado do número em binário é: " +binCont.binario(n));

	}

}
