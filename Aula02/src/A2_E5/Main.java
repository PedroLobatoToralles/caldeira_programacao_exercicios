package A2_E5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra/frase e imprimiremos só a primeira metade dela:");
        String texto = scanner.nextLine();

        String metade = texto.substring(0, (texto.length() / 2));

        if(texto.length() % 2 == 0){
            System.out.println("Seu texto é: " + texto);
            System.out.println("A metade dele é: " + metade);
        }else{
            System.out.println("Seu texto não pode ser dividido em partes iguais.");
            System.out.println("Metade aproximada: " + metade);
        }

        scanner.close();

    }
}
