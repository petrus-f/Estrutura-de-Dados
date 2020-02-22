package Aula1;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {

		ListaString lista = new ListaString();
		int op = 0;
		String valor;
		int pos;
		while (op != 7) {
			op = Integer.parseInt(
					JOptionPane.showInputDialog("Digite:\n1-Adicionar no inicio da lista\n2-Adicionar no final "
							+ "da lista \n3-Adicionar em posição específica\n4-Remover no "
							+ "inicio da lista\n5-Remover no final da lista\n6-Remover em "
							+ "posição específica\n7-Sair"));
			switch (op) {
			case 1:
				valor = JOptionPane.showInputDialog("Digite a palavra: ");
				lista.adicionarInicio(valor);
				break;
			case 2:
				valor = JOptionPane.showInputDialog("Digite a palavra final: ");
				lista.adicionarFinal(valor);
				break;
			case 3:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da palavra: "));
				valor = JOptionPane.showInputDialog("Digite a palavra: ");
				lista.adicionarPosicaoDet(pos - 1, valor);
				break;
			case 4:
				lista.removerInicio();
				break;
			case 5:
				lista.removerFinal();
				break;
			case 6:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da palavra a remover: "));
				lista.removerPosicaoDet(pos-1);
				break;
			case 7:
				System.out.println("Saindo");
				break;
			}

		}
	}
}
