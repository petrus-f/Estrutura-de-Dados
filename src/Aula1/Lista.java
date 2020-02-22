package Aula1;


// Exercicio 7
public class Lista {
	static int tamanho;
	static int[] lista;
	
	public Lista() {
		lista = new int[10];
		tamanho = 0;
		for (int i = 0; i <5; i++) {
			lista[i] = (int)(Math.random()*15)+1;
			tamanho ++;
		}
	}
	
	public boolean vazia() {
		if(tamanho == 0) {
			return true;
		}
		return false;
	}
	
	public boolean cheia() {
		if(tamanho == lista.length) {
			return true;
		}
		return false;
	}
	
	public int removeEspecifico(int pos) {
		int valor = 0;
		if(!vazia()){
			valor = ajustarLista(pos);
			tamanho --;
		}else {
			System.out.println("Lista Vazia");
		}
		return valor;
	}
	
	public int ajustarLista(int pos) {
		if(lista[pos+1] != 0) {
			int valorAtual = lista[pos];
			lista[pos] = ajustarLista(pos+1);
			return valorAtual;
		}else {
			int retorno = lista[pos];
			lista[pos] = 0;
			return retorno;
		}
	}
	
	public void lerLista() {
		System.out.println("");
		for (int i = 0; i <10; i++) {
			System.out.print(" " +lista[i]);
		}
	}
}
