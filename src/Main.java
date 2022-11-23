

public class Main {
	//esse algoritmo é o de menor complexidade quadratica

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		//Criação de vetor com 10 posições
		
		for(int i=0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			//Esse vetor pega numeros aleatorios e inteiros entre o 0 e o 10
			//mas pode ser usado em outros tamanhos e valores
		}
		
		System.out.println("Desordenado");
		for(int i=0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}//vetor desordenado onde mostra os numeros de forma desordenada e
		// aleatoria
		
		//selection sort 0(n * 2)
		int posicaomenor, aux;
		for(int i=0; i< vetor.length; i++) {
			posicaomenor = i;
			for(int j = i+1; j < vetor.length; j++) {
				if (vetor [j] < vetor[posicaomenor]) {
					posicaomenor = j;
				}
			}
			aux = vetor[posicaomenor];
			vetor[posicaomenor] = vetor[i];
			vetor[i] = aux;
		}
		//esse codigo serve para guardar a posição e fazer as trocas
		// para cada selecao foi criado uma variavel auxiliar  para guardar 
		// o elemento e só faz uma unica troca no final
		
		System.out.println("\n\nOrdenado");
		for(int i=0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		// mostra os elemento ordenados depois da realização do processo 
		

	}

}
