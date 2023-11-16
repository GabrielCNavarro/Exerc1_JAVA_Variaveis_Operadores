package VetoresMatrizes_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vetorInt[] = {2,405,1,3,4,9,7,8,10,6};
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		Arrays.sort(vetorInt);
		
		System.out.println("\nVetor ordenado");
		
		for (int indice=0; indice < vetorInt.length; indice++) {
			System.out.println(vetorInt[indice]);
		}
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		int posicao = Arrays.binarySearch(vetorInt,num);
		
		if (posicao>=0) {
			System.out.println("\nO número "+num+" está localizado na posição: "+posicao);
		}else {
			System.out.println("\nElemento não encontrado");
		}
			
		

	}

}
