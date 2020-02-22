package Aula1;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
		ListaCaracter lista = new ListaCaracter();
		int op = 0;
		char valor;
		int pos;
		while (op != 7) {
			op = Integer.parseInt(
					JOptionPane.showInputDialog("Digite:\n1-Adicionar no inicio da lista\n2-Adicionar no final "
							+ "da lista \n3-Adicionar em posi��o espec�fica\n4-Remover no "
							+ "inicio da lista\n5-Remover no final da lista\n6-Remover em "
							+ "posi��o espec�fica\n7-Sair"));
			switch (op) {
			case 1:
				valor = (JOptionPane.showInputDialog("Digite o caracter: ")).charAt(0);
				lista.adicionarInicio(valor);
				break;
			case 2:
				valor = JOptionPane.showInputDialog("Digite um caracter final: ").charAt(0);
				lista.adicionarFinal(valor);
				break;
			case 3:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posi��o do caracter: "));
				valor = JOptionPane.showInputDialog("Digite o caracter: ").charAt(0);
				lista.adicionarPosicaoDet(pos - 1, valor);
				break;
			case 4:
				lista.removerInicio();
				break;
			case 5:
				lista.removerFinal();
				break;
			case 6:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posi��o do caracter a remover: "));
				lista.removerPosicaoDet(pos-1);
				break;
			case 7:
				System.out.println("Saindo");
				break;
			}

		}

	}

}
