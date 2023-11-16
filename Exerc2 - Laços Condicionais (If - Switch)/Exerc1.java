package LaçosCondicionais;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numA,numB,numC,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira aqui o número A: ");
		numA = leia.nextInt();
		System.out.println("\nInsira aqu o número B: ");
		numB = leia.nextInt();
		System.out.println("\nInsira aqui o número C: ");
		numC = leia.nextInt();
		
		soma = numA+numB;
		
		if(numA+numB>numC) {
			System.out.println("\nO valor da soma entre os números A e B é maior que o número C!\n"+numA+"+"+numB+"="+soma+">"+numC);
		}else if(numA+numB<numC) {
			System.out.println("\nO valor da soma entre os números A e B é menor que o número C!\n"+numA+"+"+numB+"="+soma+"<"+numC);
		}else {
			System.out.println("\nO valor da soma entre os números A e B é igual ao número C!\n"+numA+"+"+numB+"="+soma+"="+numC);
			
		}

	}

}
