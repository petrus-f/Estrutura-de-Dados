package Aula1;

// Exercicio 9
public class ListaString {
	static int tamanho;
	String[] lista;

	public ListaString() {
		lista = new String[8];
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

	public void adicionarInicio(String valor) {
		if (!cheia()) {
			for (int i = (lista.length - 1); i >= 0; i--) {
				if (lista[i] != null) {
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

	public void adicionarFinal(String valor) {
		if (!cheia()) {
			lista[tamanho] = valor;
			tamanho++;
			concatenarLista();
		} else {
			System.out.println("\nLISTA CHEIA");
		}
	}

	public void adicionarPosicaoDet(int pos, String valor) {
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

	public void ajustarListaInserir(int pos, String valor) {
		if (lista[pos] != null) {
			ajustarListaInserir(pos + 1, lista[pos]);
		}
		lista[pos] = valor;
	}

	public void removerInicio() {
		if (!vazia()) {
			String valorRemovido = lista[0];
			for (int i = 0; i < tamanho; i++) {
				lista[i] = lista[i + 1];
			}
			lista[tamanho] = null;
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
			String valorRemovido = lista[tamanho];
			System.out.println("\nValor Removido: " + valorRemovido);
			lista[tamanho] = null;
			concatenarLista();
		} else {
			System.out.println("\nLISTA VAZIA");
		}
	}

	public void removerPosicaoDet(int pos) {
		String valorRemovido;
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

	public String ajustarListaRemover(int pos) {
		if (lista[pos + 1] != null) {
			String valorAtual = lista[pos];
			lista[pos] = ajustarListaRemover(pos + 1);
			return valorAtual;
		} else {
			String retorno = lista[pos];
			lista[pos] = null;
			return retorno;
		}
	}

	public void concatenarLista() {
		System.out.println("");
		int i = 0;
		while (lista[i] != null) {
			String palavra = lista[i] + " ";
			System.out.print(palavra);
			i++;
		}
		System.out.println("\n" +tamanho);
	}

}
