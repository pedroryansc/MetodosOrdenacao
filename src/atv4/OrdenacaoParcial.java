package atv4;

public class OrdenacaoParcial {

	public int[] bubbleSort(int[] array, int k) {
		if(k <= array.length) {
			for(int i = 0; i < k; i++) {
				for(int j = 0; j < k - 1; j++) {
					if(array[j] > array[j + 1]) {
						int aux = array[j];
						array[j] = array[j + 1];
						array[j + 1] = aux;
					}
				}
			}
		}
		return array;
	}
	
	public int[] selectionSort(int[] array, int k) {
		if(k <= array.length) {
			int min, aux;
			for(int i = 0; i < k - 1; i++) {
				min = i;
				for(int j = i + 1; j < k; j++) {
					if(array[j] < array[min])
						min = j;
				}
				aux = array[i];
				array[i] = array[min];
				array[min] = aux;
			}
		}
		return array;
	}
	
	public int[] insertionSort(int[] array, int k) {
		if(k <= array.length) {
			int aux, j;
			for(int i = 1; i < k; i++) {
				aux = array[i];
				j = i - 1;
				while(j >= 0 && array[j] > aux) {
					array[j + 1] = array[j];
					j--;
				}
				array[j + 1] = aux;
			}
		}
		return array;
	}
	
	public void mostrarLista(int[] array) {
		for(int num : array)
			System.out.println(num);
	}
	
}