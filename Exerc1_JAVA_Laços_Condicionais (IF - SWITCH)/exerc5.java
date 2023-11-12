package LaçosCondicionais;

import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int item,qtdComprada,preço,valorTotal;
		
		Scanner leia = new Scanner(System.in);
        System.out.println("\n\t--Menu--");
        System.out.println("\n1- Cachorro quente");
        System.out.println("\n2- X-Salada");
        System.out.println("\n3- X-Bacon");
        System.out.println("\n4- Bauru");
        System.out.println("\n5- Refrigerante");
        System.out.println("\n6- Suco de laranja");
        System.out.println("\nEscolha sua comida: ");
        item = leia.nextInt();
        System.out.println("\nEscolha a quantidade que deseja: ");
        qtdComprada = leia.nextInt();
        
        switch(item) {
        	case 1:
        		preço = 10;
        		valorTotal = qtdComprada*preço;
        		System.out.println("\nVocê escolheu:Cachorro quente!\nValor Total: "+valorTotal);
        		break;
        	case 2:
        		preço = 15;
        		valorTotal = qtdComprada*preço;
        		System.out.println("\nVocê escolheu:X-Salada!\nValor Total: "+valorTotal);
        		break;
        	case 3:
        		preço = 18;
        		valorTotal = qtdComprada*preço;
        		System.out.println("\nVocê escolheu: X-Bacon!\nValor Total: "+valorTotal);
        		break;
        	case 4:
        		preço = 12;
        		valorTotal = qtdComprada*preço;
        		System.out.println("\nVocê escolheu: Bauru!\nValor Total: "+valorTotal);
        	    break;
        	case 5:
        		preço = 8;
        		valorTotal = qtdComprada*preço;
        		System.out.println("\nVocê escolheu: Refrigerante!\nValor Total: "+valorTotal);
        		break;
        	case 6:
        		preço = 13;
        		valorTotal = qtdComprada*preço;
        		System.out.println("\nVocê escolheu: Suco de laranja!\nValor Total: "+valorTotal);
        	    break;
        	    default:
        	    	System.out.println("\nOpção inválida.");
        }
	}

}
