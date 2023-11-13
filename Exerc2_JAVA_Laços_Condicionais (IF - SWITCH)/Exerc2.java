package LaçosCondicionais;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira um número aqui: ");
		numero = leia.nextInt();
		
        if(numero % 2 == 0) {
            System.out.println("\nO número "+numero+" é par!");
        }else {
            System.out.println("\nO número "+numero+" é ímpar!");
        }
        
        if(numero > 0) {
        	System.out.println("\nE ele também é positivo!");
        }else if(numero == 0) {
        	System.out.println("\nE ele também é neutro!");
        }else {
        	System.out.println("\nE ele também é negativo!");
        }
		
		
	}

}
