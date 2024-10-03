import java.util.Scanner;

public class Divisivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		
		System.out.println("Digite um número inteiro: ");
		numero = sc.nextInt();
		 if(numero % 2 == 0) {
			 System.out.println("Este número é divisível por 2.");
		 }else if(numero % 3 == 0) {
			 System.out.println("Este número é divisível por 3.");
		 }else {
			 System.out.println("Este número não é divisível por 2 nem por 3.");
			 
	}

}
}