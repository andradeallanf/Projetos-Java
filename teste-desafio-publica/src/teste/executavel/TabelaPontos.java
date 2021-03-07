package teste.executavel;

import javax.swing.JOptionPane;

public class TabelaPontos {

	public static void main(String[] args) {
		int recordeMin = 1000, recordeMax = 0, quebraRecordeMin = 0, quebraRecordeMax = 0;

		String entraJogos = JOptionPane.showInputDialog("Quantos jogos haverão na temporada?");
		int numJogos = Integer.parseInt(entraJogos);

		while (numJogos > 0) {
			String entraPontos = JOptionPane.showInputDialog("Quantos pontos você fez neste jogo?");
			int numPontos = Integer.parseInt(entraPontos);
			System.out.println("Total de pontos: " + numPontos);

			if (numPontos < recordeMin) {
				recordeMin = numPontos;
				quebraRecordeMin++;
			}
			System.out.println("Pontuação mínima da Temporada: " + recordeMin);

			if (recordeMax < numPontos) {
				recordeMax = numPontos;
				quebraRecordeMax++;
			}
			System.out.println("Pontuação maxima da Temporada: " + recordeMax);
			
			numJogos--;
		}
		quebraRecordeMax = quebraRecordeMax -1;
		quebraRecordeMin = quebraRecordeMin -1;
		System.out.println("O recorde minímo foi quebrado "+ quebraRecordeMin+" vezes");
		System.out.println("O recorde máximo foi quebrado "+ quebraRecordeMax+" vezes");

	}

}
