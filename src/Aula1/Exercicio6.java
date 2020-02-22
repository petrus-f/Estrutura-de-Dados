package Aula1;

import javax.swing.JOptionPane;

public class Exercicio6 {

	static int[] dados;
	static int tamanho;
	
	public static void main(String[] args) {
		iniciarLista();
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
		int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição: "));
		metodoA(pos, valor);
	}

	public static void iniciarLista() {
		dados = new int[10];
		tamanho = 0;
	}

	public static void metodoA(int pos, int valor) {
		if (dados.length == tamanho) {
			System.out.println("Erro");
		} else if (pos <= 0 || pos > tamanho + 1) {
			System.out.println("Posição inválida");
		}else if(pos == 1) {
			adicionaInicio(valor);	
		}else if(pos==tamanho){
			adicionaFinal(valor);
		}else {
			for(int i = tamanho; i >= pos; i--) {
				dados[i]=dados[i-1];
				dados[pos-1]=valor;  
				tamanho++; 
			}
		}
	}
		
	public static void adicionaInicio(int valor) {
		dados[0]= valor;			
	}
	
	public static void adicionaFinal(int valor) {
		dados[tamanho] = valor;
	}

}
