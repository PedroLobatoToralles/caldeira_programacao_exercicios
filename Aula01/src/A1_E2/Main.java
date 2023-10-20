package A1_E2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int numero2 = scanner.nextInt();
        System.out.println("Seus números escolhidos são "+ numero1+ " e "+ numero2);
    }
}
