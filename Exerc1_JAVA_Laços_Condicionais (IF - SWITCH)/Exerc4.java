package LaçosCondicionais;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tipo,classe,alimentacao,especie;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual o tipo do animal? (Vertebrado ou Invertebrado): ");
		tipo = leia.next();
		System.out.println("\nQual a classe do animal: ");
		classe = leia.next();
		System.out.println("\nDo que o animal se alimenta: ");
		alimentacao = leia.next();
		
		if(tipo.equalsIgnoreCase("Vertebrado")) {
			if(classe.equalsIgnoreCase("Ave")) {
				if(alimentacao.equalsIgnoreCase("Carnívoro")) {
					especie = "Águia";
					
				}else if(alimentacao.equalsIgnoreCase("Onívoro")) {
					especie = "Pomba";
					
				}else {
					especie = "espécie não encontrada, verifique a digitação";
				}
				
			}else if(classe.equalsIgnoreCase("Mamífero")) {
				if(alimentacao.equalsIgnoreCase("Onívoro")) {
					especie = "Homem";
					
				}else if(alimentacao.equalsIgnoreCase("Herbívoro")) {
					especie = "Vaca";
					
				}else {
					especie = "espécie não encontrada, verifique a digitação";
				}
			}else {
				especie = "espécie não encontrada, verifique a digitação";
			}	
		}else if(tipo.equalsIgnoreCase("Invertebrado")) {		
			if(classe.equalsIgnoreCase("Inseto")) {
				if(alimentacao.equalsIgnoreCase("Hematófago")) {
					especie = "Pulga";
					
				}else if(alimentacao.equalsIgnoreCase("Herbívoro")) {
					especie = "Lagarta";
					
				}else {
					especie = "espécie não encontrada, verifique a digitação";
				}
				
			}else if(classe.equalsIgnoreCase("Anelídeo")) {
				if(alimentacao.equalsIgnoreCase("Hematófago")) {
					especie = "Sanguessuga";
						
				}else if(alimentacao.equalsIgnoreCase("Ovívoro")) {
					especie = "Minhoca";
						
				}else {
					especie = "espécie não encontrada, verifique a digitação";
				}			
	        }else {
				especie = "espécie não encontrada, verifique a digitação";
			}	
		}else {
			especie = "espécie não encontrada, verifique a digitação"; 
			}
		System.out.println("\nA espécie é: "+especie);

		}
	
			
}