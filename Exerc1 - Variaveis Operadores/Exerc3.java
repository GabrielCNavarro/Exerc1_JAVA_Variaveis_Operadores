package JavaInicial;

import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        float SalarioBruto,AdicionalNoturno,HorasExtras,Descontos,SalarioLiquido;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("\nInsira aqui o valor do Sálario Bruto: ");
        SalarioBruto = ler.nextFloat();
        System.out.println("\nInsira aqui o valor do Adicional Noturno: ");
        AdicionalNoturno = ler.nextFloat();
        System.out.println("\nInsira aqui o valor das Horas Extras: ");
        HorasExtras = ler.nextFloat();
        System.out.println("\nInsira aqui o valor dos Descontos: ");
        Descontos = ler.nextFloat();
        
        SalarioLiquido = (SalarioBruto+AdicionalNoturno+(HorasExtras*5)-Descontos);
        System.out.println("\nO Salário Líuido do contribuinte é o seguinte: "+SalarioLiquido);
        

    }

}
