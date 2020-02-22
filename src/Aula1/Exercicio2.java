package Aula1;

public class Exercicio2 {
	int[] fatVetor = new int[5];

	public static void main(String[] args) {
		int[] vetor = new int[5];
		int[] Fatorial = new int[5];
		for (int i = 0; i < 5; i++) {
			vetor[i] = (int) ((Math.random() * 10) + 1);
			Fatorial[i] = CalcFatorial(vetor[i]);
			System.out.println("O fatorial de "+vetor[i]+ " é "+ Fatorial[i]);
		}
	}

	public static int CalcFatorial(int nFator) {
		int vFator = 0;
		if (nFator != 1) {
		vFator = nFator * CalcFatorial(nFator-1);
		return vFator;
		}else {
		return 1;
		}
	}
}