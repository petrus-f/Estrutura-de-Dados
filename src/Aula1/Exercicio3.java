package Aula1;

import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		int i, j, aux;
		int [] vetor = new int [100];
		Random r = new Random();
		for(i = 0; i <100;i++) {
			vetor[i]= (int)(r.nextGaussian()*100);
		}
		
		for(i= 0; i<100; i++){
	        for(j = 0; j<99; j++){
	            if(vetor[j] > vetor[j + 1]){
	                aux = vetor[j];
	                vetor[j] = vetor[j+1];
	                vetor[j+1] = aux;
	            }
	        }
	    }
		for(i= 0; i<100; i++){
			System.out.print(" "+vetor[i]);
		}
		
	}

}
