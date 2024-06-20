package atv2;

public class Main {
	public static void main(String[] args) {
		
		String[] nomes = {"Igor", "Pedro Daniel", "Pedro Ryan", "Pedro Henrique", "Gianluca"};
		String[] jogos = {"The Legend of Zelda", "God of War", "The Last of Us", "Dark Souls", "Super Mario Bros", 
						"Metroid", "Castlevania", "Metal Gear Solid", "Hollow Knight"};
		String[] filmes = {"Star Wars", "O Senhor dos Anéis"};
		
		OrdenacaoString ordem = new OrdenacaoString();
		
		ordem.bubbleSort(nomes);
		
		ordem.mostrarLista(nomes);
		
		System.out.println();
		
		ordem.selectionSort(jogos);
		
		ordem.mostrarLista(jogos);
		
		System.out.println();
		
		ordem.insertionSort(filmes);
		
		ordem.mostrarLista(filmes);
		
	}
}