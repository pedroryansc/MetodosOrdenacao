package atv1;

public class Main {
	public static void main(String[] args) {
		
		// int[] arrayOrdenado = {19, 19, 19, 19, 20};
		int[] arrayDesordenado = {6, 74, 8, 3, 9, 60, 59, 45};
		
		OrdemCrescente ordenacao = new OrdemCrescente();
		
		if(ordenacao.estaOrdenado(arrayDesordenado))
			System.out.println("O array está ordenado em ordem crescente.");
		else
			System.out.println("O array \033[0;1mnão\033[0m está ordenado em ordem crescente.");
		
	}
}