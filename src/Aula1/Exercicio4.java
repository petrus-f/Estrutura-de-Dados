package Aula1;

public class Exercicio4 {
	static int[][] matriz = new int[4][4];
	static int i, j, cont, maiorValor;

	public static void main(String[] args) {
		CriarMatriz();
		SomaFaixa();
		 QuantImpar();
		 QuantDividOito();
		 QuantDividTres();
		 System.out.println("O fatorial do maior valor "+maiorValor+" é "+Fatorial(maiorValor));
	}

	static void CriarMatriz() {
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				matriz[i][j] = (int) ((Math.random() * 149) + 1);
				if(maiorValor < matriz[i][j]) {
					maiorValor = matriz[i][j];
				}
			}
		}
	}

	static void SomaFaixa() {
		int soma = 0;
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (matriz[i][j] < 101 && matriz[i][j] > 0) {
					soma += matriz[i][j];
				}
			}
		}
		System.out.println("A soma de números entre 1 e 100 foi: " + soma);
	}

	static void QuantImpar() {
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (matriz[i][j] < 51 && matriz[i][j] > 29) {
					cont++;
				}
			}

		}
		System.out.println("A quantidade de números entre 30 e 50 foi: " + cont);
	}

	
	static void QuantDividOito(){
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if(matriz[i][j]%8 == 0) {
					cont++;
				}
			}
		}
		System.out.println("A quantidade de números divisiveis por 8 foi:  " + cont);
	}
	
	static void QuantDividTres() {
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if(matriz[i][j]%2 != 0 && matriz[i][j]%3 == 0) {
					cont++;
				}
			}
		}
		System.out.println("A quantidade de números ímpares divisiveis por 3 foi:  " + cont);
	}
	
	static double Fatorial(int Valor) {
		double fat;
		if (Valor != 1) {
			fat = (Valor *(Fatorial(Valor-1)));
			return fat;
	            }else {
	            	return 1;
	            }
	}
	
}
