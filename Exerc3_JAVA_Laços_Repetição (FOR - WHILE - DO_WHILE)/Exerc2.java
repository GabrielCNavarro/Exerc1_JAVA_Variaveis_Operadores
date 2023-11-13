package LaçosRepetição;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numPares = 0,numImpares = 0;
        
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número "+(i + 1)+": ");
            int numero = leia.nextInt();

            if (numero % 2 == 0) {
                // O número é par
                numPares++;
            } else {
                // O número é ímpar
                numImpares++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Total de números Pares: " + numPares);
        System.out.println("Total de números Ímpares: " + numImpares);

    }
}