package geradordefrases;

public class GeradorFrases {

	public static void main(String[] args) {
		String [] listaPalavras1 = {"Coco","xixi","Livros", "Pol�tica","P�-de-moleque","Trem descarrilhado"};
		String [] listaPalavras2 = {"S�bado","Festa","Balada","fandango","vexame","Bebida","Saber fazer"};
		String [] listaPalavras3 = {"Cachorro","Gato","�dio", "sab�o","Sextou beb�"};
		
		//Descobre quantas palavras existem
		int oneLength = listaPalavras1.length;
		int twoLength = listaPalavras2.length;
		int threeLength = listaPalavras3.length;
		
		//gera tr�s n�meros aleat�rios
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		int rand3 = (int)(Math.random() * threeLength);
		
		//Constr�i uma frase
		String frase = listaPalavras1[rand1]+", "+ listaPalavras2[rand2]+" e "+listaPalavras3[rand3];
		
		//exiba a frase
		System.out.println("Precisamos de " + frase);
	}

}
