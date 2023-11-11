package JavaInicial;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario,abono,NovoSalario;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor do salário: ");
		salario = ler.nextFloat();
		System.out.println("\nEntre com o valor do abono: ");
		abono = ler.nextFloat();
		
		NovoSalario = salario + abono;
		System.out.println("\nValor do novo salário: "+NovoSalario);

	}

}
