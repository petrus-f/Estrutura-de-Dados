package Aula1;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		int cont = 1;
		int[][] matriz = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					if (i == 0) {
						matriz[i][j] = 1;
					} else {
						cont = cont * 3;
						matriz[i][j] = cont;
					}
				} else {
					matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("");
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j]+ "  ");
			}
		}
	}

}
