package Aula1;

public class Exercicio7 {

	public static void main(String[] args) {
		int posicaoRemover = 2;
		Lista lista = new Lista();
		lista.lerLista();
		lista.removeEspecifico(posicaoRemover-1);
		lista.lerLista();
	}

}
