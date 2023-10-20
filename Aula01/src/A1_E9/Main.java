package A1_E9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Em que ano você nasceu?");
        int ano = scanner.nextInt();
        System.out.println("Digite o ano atual:");
        int anoatual = scanner.nextInt();

        int totalidade = anoatual - ano;

        System.out.println("Você fará "+ totalidade +" anos nesse ano.");

    }
}
