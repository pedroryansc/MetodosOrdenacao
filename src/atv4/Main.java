package atv4;

public class Main {
	public static void main(String[] args) {
		
		int[] idades = {33, 19, 61, 38, 58, 4, 1};
		int[] dias = {29, 15, 14, 30, 18, 3, 14, 23, 16, 27, 15, 30, 5};
		int[] meses = {11, 3, 2, 6, 10, 4, 1, 2, 10, 4, 10, 6, 1};
		
		OrdenacaoParcial ordem = new OrdenacaoParcial();
		
		ordem.bubbleSort(idades, 2);
		
		ordem.mostrarLista(idades);
		
		System.out.println();
		
		ordem.selectionSort(dias, 4);
		
		ordem.mostrarLista(dias);
		
		System.out.println();
		
		ordem.insertionSort(meses, 6);
		
		ordem.mostrarLista(meses);
		
	}
}