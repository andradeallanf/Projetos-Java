package bottlebeer;

public class BottleBeer99 {

	public static void main(String[] args) {
		int num = 2;
		String word = "Garrafas";
		
		while (num > 0) {
			
			System.out.println("Tem "+num+" "+word+" de cerveja na geladeira.");
			System.out.println(num+" "+word+" de cerveja" );
			System.out.println("Pegue uma e passe adiante.");
			num -= 1;
			if (num == 1) {
				word = "Garrafa";
			}
			if (num > 0) {
				System.out.println("Sobrou "+num+" "+word+" de cerveja na geladeira.");
			}else {
				System.out.println("Acabaram as garrafas da geladeira.");
			}
		}
	}

}
