package A1_E13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número não negativo e informaremos o fatorial:");
        int num = scanner.nextInt();

        if(num >= 0) {
            long fatorial = 1;

            for(int i = 1; i <= num; i++){
                fatorial *= i;
            }
            System.out.println("O fatorial de " + num + " é " + fatorial);
        }else{
            System.out.println("Eu falei sem número negativo seu animal.");
        }

    }
}
