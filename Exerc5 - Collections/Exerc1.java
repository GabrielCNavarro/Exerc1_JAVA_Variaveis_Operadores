package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner leia = new Scanner(System.in);

		        ArrayList<String> cores = new ArrayList<>();

		        System.out.println("Digite 5 cores:");

		        // Solicitar ao usuário para digitar as cores e adicioná-las ao ArrayList
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Cor " + (i + 1) + ": ");
		            String cor = leia.nextLine();
		            cores.add(cor);
		        }

		        // Mostrar na tela todas as cores adicionadas
		        System.out.println("\nCores adicionadas:");
		        for (String cor : cores) {
		            System.out.println(cor);
		        }

		        // Ordenar e mostrar as cores em ordem crescente
		        Collections.sort(cores);
		        System.out.println("\nCores em ordem crescente:");
		        for (String cor : cores) {
		            System.out.println(cor);
		        }

		        leia.close();
	}
}