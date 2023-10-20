package A1_E12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao conversor de moeda do Pedro lindão, digite um valor em dólar e vamos converter para reais:");
        double dolar = scanner.nextDouble();

        double reais = Math.round(dolar*4.91568);
        System.out.println("Isso da R$" + reais);

    }
}
