package VetoresMatrizes_Arrays;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner leia = new Scanner(System.in);

        final int numeroParticipantes = 10;
        final int numeroBimestres = 4;

        double[][] notas = new double[numeroParticipantes][numeroBimestres];
        double[] medias = new double[numeroParticipantes];

        // Ler as notas de cada participante
        for (int i = 0; i < numeroParticipantes; i++) {
            System.out.println("Digite as notas do participante " + (i + 1) + ":");
            for (int j = 0; j < numeroBimestres; j++) {
                System.out.print("Nota do bimestre " + (j + 1) + ": ");
                notas[i][j] = leia.nextDouble();
            }
        }

        // Calcular as médias de cada participante
        for (int i = 0; i < numeroParticipantes; i++) {
            double soma = 0;
            for (int j = 0; j < numeroBimestres; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / numeroBimestres;
        }

        // Exibir as médias de cada participante
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < numeroParticipantes; i++) {
            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
        }

        leia.close();
    }
}