package Aula1;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		ListaTemperatura lista = new ListaTemperatura();
		int op = 0;
		int valor;
		int pos;
		while (op != 7) {
			op = Integer.parseInt(
					JOptionPane.showInputDialog("Digite:\n1-Adicionar no inicio da lista\n2-Adicionar no final "
							+ "da lista \n3-Adicionar em posição específica\n4-Remover no "
							+ "inicio da lista\n5-Remover no final da lista\n6-Remover em "
							+ "posição específica\n7-Sair"));
			switch (op) {
			case 1:
				valor = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura inicial: "));
				lista.adicionarInicio(valor);
				break;
			case 2:
				valor = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura final: "));
				lista.adicionarFinal(valor);
				break;
			case 3:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da temperatura: "));
				valor = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura: "));
				lista.adicionarPosicaoDet(pos - 1, valor);
				break;
			case 4:
				lista.removerInicio();
				break;
			case 5:
				lista.removerFinal();
				break;
			case 6:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da temperatura a remover: "));
				lista.removerPosicaoDet(pos - 1);
				break;
			case 7:
				System.out.println("Saindo");
				break;
			}
		}
	}
}
