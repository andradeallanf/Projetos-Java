package cursojava.executavel;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;

public class Exercício {
	public static void main(String[] args) {
		Date relogio = new Date();// Sempre que a palavra 'new' é usada, um novo objeto é criado
		System.out.println("A hora do Sistema é : ");
		System.out.println(relogio.toString());
		System.getProperties();
	
		System.out.println(System.getProperty("user.language"));
		
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
		System.out.println(screenSize.getSize());
	
	}

}
