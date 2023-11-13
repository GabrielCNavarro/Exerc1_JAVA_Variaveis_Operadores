package LaçosRepetição;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o segundo número do intervalo: ");
		num2 = leia.nextInt();
		
		if(num1>num2) {
			System.out.println("\nIntervalo inválido!");
		}else {
			for(x=num1;x<=num2;x++) {
				if(x%3==0 && x%5==0) {
					System.out.println(x);
				}
			}
		}

	}

}
