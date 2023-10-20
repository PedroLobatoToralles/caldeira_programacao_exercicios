package A2_E7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while(i <= 5) {
            System.out.println("Os espartanos estão indo para a guerra em menor número, tente adivinhar quantos soldados eles vão enfrentar:");
            int chute = scanner.nextInt();

            if (chute < 300000) {
                System.out.println("Um pouco mais!");
                i++;
            } else if(chute > 300000) {
                System.out.println("Um pouco menos!");
                i++;
            }
            if(chute == 300000) {
                System.out.println("VOCÊ ACERTOU");
                break;
            }
        }

    }
}
