package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner leia = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<>();

        System.out.println("Digite 10 valores inteiros não repetidos:");

        // Solicitar ao usuário para digitar os valores inteiros e adicioná-los ao Set
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            int valor = leia.nextInt();
            numeros.add(valor);
        }

        // Exibir os elementos do Set utilizando um Iterator
        System.out.println("\nElementos da Collection Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            int elemento = iterator.next();
            System.out.println(elemento);
        }

        leia.close();
    }
}

	}

}
