package Aula1;
import java.util.Random;
public class Exercicio1 {
	static double [] vetor = new double[100];
	
	public static void main(String[] args) {
		Random r = new Random();
		for(int i = 0; i <100;i++) {
			vetor[i]= r.nextGaussian()*1500;
		}
		
		MediaFaixa();
		MediaGeral();
		SomaNegativa();
		
		 
			
		}
	
	public static void MediaFaixa() {
		int cont= 0;
		double media= 0.00;
		for(int i = 0; i <100;i++) {
			if(vetor[i] >= 100 && vetor[i] <= 1000) {
				media += vetor[i];
				cont++;
			}
		}
		media = media/cont;
		System.out.println("A média entre R$ 100,00 e 1000,00 foi de R$ "+ media);
	}
	
	public static void MediaGeral() {
		double media = 0.00;
		for(int i = 0; i <100;i++) {
			media += vetor[i];
		}
		media = (media/100);
		System.out.println("A média geral foi de R$ "+ media);
	}
	
	public static void SomaNegativa() {
		double soma = 0;
		for(int i = 0; i <100;i++) {
			if(vetor[i]<0) {
				 soma += vetor[i];
			}
		}
		System.out.println("A soma de negativos foi de R$ "+ soma);
	}
}
