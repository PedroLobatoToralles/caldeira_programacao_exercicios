package A2_E4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo a calculadora do Pedro lindo, primeiro comece com um número:");
        double n1 = scanner.nextDouble();
        System.out.println("Agora digite o segundo número:");
        double n2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Agora digite a operação desejada (+,-,*,/):");
        String operacao = scanner.nextLine();
        double resultado;

        switch(operacao){
            case "+" -> {
                resultado = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resultado);
            }
            case "-" ->{
                resultado = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + resultado);
            }
            case "*" ->{
                resultado = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + resultado);
            }
            case "/" -> {
                if(n2 != 0){
                    resultado = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultado);
                }else{
                    System.out.println("Erro: Divisão por 0 detectada.");
                }
            }
            default -> System.out.println("Opção inválida!");
        }

    }
}
