package JavaInicial;

import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        float n1,n2,n3,n4,MediaFinal;

        Scanner ler = new Scanner(System.in);

        System.out.println("\nEntre com o valor da primeira nota: ");
        n1 = ler.nextFloat();
        System.out.println("\nEntre com o valor da segunda nota: ");
        n2 = ler.nextFloat();
        System.out.println("\nEntre com o valor da terceira nota: ");
        n3 = ler.nextFloat();
        System.out.println("\nEntre com o valor da quarto: ");
        n4 = ler.nextFloat();

        MediaFinal = ((n1+n2+n3+n4)/4);
        System.out.println("\nValor da Média Final: "+MediaFinal);

    }

}