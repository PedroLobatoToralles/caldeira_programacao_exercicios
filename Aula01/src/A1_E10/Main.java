package A1_E10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao conversor de temperatura de Celsius para Fahrenheit, digite uma temperatura em celsius:");
        int cel = scanner.nextInt();

        double far = (cel*9/5) + 32;

        System.out.println("O resultado é " + far + " F");

    }
}
