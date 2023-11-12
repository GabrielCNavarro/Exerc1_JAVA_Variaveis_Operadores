package LaçosCondicionais;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome,primDoacao;
		int idade;
		boolean doacao = true;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o nome do doador: ");
		nome = leia.nextLine();
		System.out.println("\nInsira a idade do doador: ");
		idade = leia.nextInt();
		System.out.println("\nÉ a primeira doação de sangue? (S/N): ");
		primDoacao = leia.next();
		
		if(primDoacao.equalsIgnoreCase("S")) {
			doacao = true;
		}else if(primDoacao.equalsIgnoreCase("N")) {
			doacao = false;
		}else {
			System.out.println("\nValor inválido!");
		}
		
		if(idade < 18 || idade > 69) {
			System.out.println("\n"+nome+" não está apto(a) para doar sangue!");
		}else if(idade >= 60 && idade <= 69 && doacao == true) {
			System.out.println("\n"+nome+" está apto(a) para doar sangue!");
		}else if(idade >= 60 && idade <= 69 && doacao == false) {
			System.out.println("\n"+nome+" não está apto(a) para doar sangue!");
		}else {
			System.out.println("\n"+nome+" está apto(a) para doar sangue!");
		}
		
		
		

	}

}
