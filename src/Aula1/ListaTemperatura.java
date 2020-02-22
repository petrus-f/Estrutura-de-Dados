package Aula1;

public class ListaTemperatura {
	static int tamanho;
	int[] lista;

	public ListaTemperatura() {
		lista = new int[8];
		tamanho = 0;
	}

	public boolean cheia() {
		if (tamanho == lista.length) {
			return true;
		}
		return false;
	}

	public boolean vazia() {
		if (tamanho == 0) {
			return true;
		}
		return false;
	}

	public void adicionarInicio(int valor) {
		if (!cheia()) {
			for (int i = (lista.length - 1); i >= 0; i--) {
				if (lista[i] != 0) {
					lista[i + 1] = lista[i];
				}
			}
			lista[0] = valor;
			tamanho++;
			concatenarLista();
		} else {
			System.out.println("\nLISTA CHEIA");
		}
	}

	public void adicionarFinal(int valor) {
		if (!cheia()) {
			lista[tamanho] = valor;
			tamanho++;
			concatenarLista();
		} else {
			System.out.println("\nLISTA CHEIA");
		}
	}

	public void adicionarPosicaoDet(int pos, int valor) {
		if (!cheia()) {
			if (pos <= tamanho) {
				ajustarListaInserir(pos, valor);
				tamanho++;
			} else {
				System.out.println("\nPosição Inválida");
			}
		} else {
			System.out.println("\nLISTA CHEIA");
		}
		concatenarLista();
	}

	public void ajustarListaInserir(int pos, int valor) {
		if (lista[pos] != 0) {
			ajustarListaInserir(pos + 1, lista[pos]);
		}
		lista[pos] = valor;
	}

	public void removerInicio() {
		if (!vazia()) {
			int valorRemovido = lista[0];
			for (int i = 0; i < tamanho; i++) {
				lista[i] = lista[i + 1];
			}
			lista[tamanho] = 0;
			System.out.println("\nValor Removido: " + valorRemovido);
			tamanho--;
			concatenarLista();
		} else {
			System.out.println("\nLISTA VAZIA");
		}
	}

	public void removerFinal() {
		if (!vazia()) {
			tamanho--;
			int valorRemovido = lista[tamanho];
			System.out.println("\nValor Removido: " + valorRemovido);
			lista[tamanho] = 0;
			concatenarLista();
		} else {
			System.out.println("\nLISTA VAZIA");
		}
	}

	public void removerPosicaoDet(int pos) {
		int valorRemovido;
		if (!vazia()) {
			if (pos < tamanho) {
				valorRemovido = ajustarListaRemover(pos);
				tamanho--;
				System.out.println("\nValor Removido: " + valorRemovido);
				}else {
					System.out.println("\nPosição Inválida");
				}
			concatenarLista();
		} else {
			System.out.println("\nLista Vazia");
		}
	}

	public int ajustarListaRemover(int pos) {
		if (lista[pos + 1] != 0) {
			int valorAtual = lista[pos];
			lista[pos] = ajustarListaRemover(pos + 1);
			return valorAtual;
		} else {
			int retorno = lista[pos];
			lista[pos] = 0;
			return retorno;
		}
	}

	public void concatenarLista() {
		System.out.println("");
		int i = 0;
		while (lista[i] != 0) {
			String mostrarlista = lista[i] + "ºC  ";
			System.out.print(mostrarlista);
			i++;
		}
		System.out.println("\n" +tamanho);
	}

}
