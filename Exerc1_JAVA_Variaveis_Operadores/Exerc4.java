package JavaInicial;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,n4,Diferença;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro valor: ");
		n1 = ler.nextFloat();
		System.out.println("\nInsira o segundo valor: ");
		n2 = ler.nextFloat();
		System.out.println("\nInsira o terceiro valor: ");
		n3 = ler.nextFloat();
		System.out.println("\nInsira o quarto valor: ");
		n4 = ler.nextFloat();
		
		Diferença = (n1*n2)-(n3*n4);
		System.out.println("\nA diferença entre os produtos é: "+Diferença);

	}

}
