package cursojava.executavel;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;

public class Exerc�cio {
	public static void main(String[] args) {
		Date relogio = new Date();// Sempre que a palavra 'new' � usada, um novo objeto � criado
		System.out.println("A hora do Sistema � : ");
		System.out.println(relogio.toString());
		System.getProperties();
	
		System.out.println(System.getProperty("user.language"));
		
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
		System.out.println(screenSize.getSize());
	
	}

}
