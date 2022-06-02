package QuickSort;

import java.util.Scanner;

public class QuickSort {
	
	/*
	 * Metodo partition (Resumo semantico): 
	 * - Define um pivo 
	 * - Vasculha o vetor até as labels left e right serem iguais
	 * - Ainda no processo acima, aloca valores inferiores (ao pivo) a esquerda
	 * - Implicitamente, aloca os valores superiores (ao pivo) a direita
	 * - Ao final de tudo, aloca o pivo no meio do vetor e o retorna
	*/
	
	public static void quickSort(int array [], int left, int right) {
		int pivot;
		
		if(right > left) {
			pivot = partition(array, left, right);
			//Ordena o sub-vetor da esquerda (que possui valor menor em relacao ao pivo)
			quickSort(array, left, pivot - 1);
			//Ordena o sub-vetor da direita (que possui valor maior em relacao ao pivo)
			quickSort(array, pivot + 1, right);
		}
	}

	public static int partition(int[] array, int left, int right) {
		int pointer = left, pivot = array[left], aux;
		
		//Varre o vetor ate left ter o mesmo valor que right
		for(int i = left + 1; i <= right; i++) {
			//Valor da posicao 'i' do array menor que o pivo
			if(array[i] < pivot) {
				//Ponteiro passa a referenciar o primeiro elemento achado menor que o pivo 
				pointer += 1;
				
				//Realiza a troca de posicoes entre o elemento destacado acima e o ultimo valor da posicao do ponteiro
				aux = array[pointer];
				array[pointer] = array[i];
				array[i] = aux;
			}
			//Console View
			arrayQuickSortPrint(array, i, pivot);
		}
		
		//Aloca o pivo no centro do vetor
		aux = array[pointer];
		array[pointer] = array[left];
		array[left] = aux;
		
		//Retorna o ponteiro/pivo
		return pointer;
	}
	
	public static void arrayQuickSortPrint(int array [], int i, int pivot) {
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j]+" ");
		}
		System.out.print("| i = "+i+" ");
		System.out.println("| pivot = "+pivot);
	}
	
	public static void arrayPrint(int array []) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	/*public static void main(String[] args) {
		int size = 7, array[];
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Insert array size: ");
		size = s.nextInt();
		
		array = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.print("Insert number "+(i+1)+": ");
			array[i] = s.nextInt();
		}
		System.out.println();
		
//		array = new int [size];
//		array[0] = 26;
//		array[1] = 33;
//		array[2] = 35;
//		array[3] = 29;
//		array[4] = 12;
//		array[5] = 22;
//		array[6] = 19;
		
		System.out.print("Initial Array        ");
		arrayPrint(array);
		
		quickSort(array, 0, size - 1);
		
		System.out.print("Final Array          ");
		arrayPrint(array);
	}
*/
}
