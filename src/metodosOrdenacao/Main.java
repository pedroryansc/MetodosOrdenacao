package metodosOrdenacao;

public class Main {
	public static void main(String[] args) {
		
		int[] array = {18, 64, 92, 28, 49, 83, 56, 70, 38};
		
		Ordenacao ordenar = new Ordenacao();
		
		// ordenar.bubbleSort(array);
		
		// ordenar.selectionSort(array);
		
		ordenar.insertionSort(array);
		
		for(int num : array) {
			System.out.println(num);
		}
		
	}
}