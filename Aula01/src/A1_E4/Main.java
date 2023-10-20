package A1_E4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smin = 1320;
        System.out.println("Informe seu salário: ");
        double salario = scanner.nextInt();

        double resultado = salario / smin;

        if(resultado <= 1)
            System.out.println("Seu salário equivale a " + resultado + " Salário mínimo.");

        if(resultado > 1)
            System.out.println("Seu salário equivale a " + resultado + " Salários mínimos.");

    }
}
