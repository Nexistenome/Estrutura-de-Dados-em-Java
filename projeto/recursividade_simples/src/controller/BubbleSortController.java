package controller;

public class BubbleSortController{

	public BubbleSortController(){
		super();
	}

	public void ordenar(int[] vetor){
		int aux = 0;
		for (int i = 0; i < (vetor.length - 1); i++){
			for (int j = (0); j < (vetor.length - 1); j++){
				if (vetor[j] > vetor[j+1]){
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}

	}
}