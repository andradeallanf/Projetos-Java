package geradordefrases;

public class GeradorFrases {

	public static void main(String[] args) {
		String [] listaPalavras1 = {"Coco","xixi","Livros", "Política","Pé-de-moleque","Trem descarrilhado"};
		String [] listaPalavras2 = {"Sábado","Festa","Balada","fandango","vexame","Bebida","Saber fazer"};
		String [] listaPalavras3 = {"Cachorro","Gato","ódio", "sabão","Sextou bebê"};
		
		//Descobre quantas palavras existem
		int oneLength = listaPalavras1.length;
		int twoLength = listaPalavras2.length;
		int threeLength = listaPalavras3.length;
		
		//gera três números aleatórios
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		int rand3 = (int)(Math.random() * threeLength);
		
		//Constrói uma frase
		String frase = listaPalavras1[rand1]+", "+ listaPalavras2[rand2]+" e "+listaPalavras3[rand3];
		
		//exiba a frase
		System.out.println("Precisamos de " + frase);
	}

}
