package LaçosRepetição;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,somaPositivo=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			
			if(numero>0) {
				somaPositivo += numero;
			}
		}while(numero!=0);
		
		System.out.println("\nA soma dos números positivos é: "+somaPositivo);

	}

}