package atv2;

public class OrdenacaoString {

	public String[] bubbleSort(String[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j].compareTo(array[j + 1]) > 0) {
					String aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		return array;
	}
	
	public String[] selectionSort(String[] array) {
		int min;
		String aux;
		for(int i = 0; i < array.length - 1; i++) {
			min = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[j].compareTo(array[min]) < 0) {
					min = j;
				}
			}
			aux = array[i];
			array[i] = array[min];
			array[min] = aux;
		}
		return array;
	}
	
	public String[] insertionSort(String[] array) {
		String aux;
		int j;
		for(int i = 1; i < array.length; i++) {
			aux = array[i];
			j = i - 1;
			while(j >= 0 && array[j].compareTo(aux) > 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = aux;
		}
		return array;
	}
	
	public void mostrarLista(String[] array) {
		for(String string : array) {
			System.out.println(string);
		}
	}
	
}