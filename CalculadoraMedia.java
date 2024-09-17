import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        ArrayList<Double> notas = new ArrayList();
        double nota,
 soma = 0, media;
        int acimaMedia = 0, abaixoMedia = 0;

        System.out.println("Digite as notas (número negativo para encerrar):");

        while (true) {
            nota = scanner.nextDouble();
            if (nota < 0) {
                break;
            }
            notas.add(nota);
            soma += nota;
        }

        if (notas.size() > 0) {
            media = soma / notas.size();

            for (double n : notas) {
                if (n > media) {
                    acimaMedia++;
                } else if (n < media) {
                    abaixoMedia++;
                }
            }

            System.out.println("Média das notas: " + media);
            System.out.println("Alunos acima da média: " + acimaMedia);
            System.out.println("Alunos abaixo da média: " + abaixoMedia);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        scanner.close();
    }
}