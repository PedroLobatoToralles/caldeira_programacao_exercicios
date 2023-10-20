package A2_E1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos conferir quantos números primos existem no intervalo que você fornecer");
        System.out.println("Escreva um primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Escreva um número final:");
        int num2 = scanner.nextInt();

        System.out.println("Números primos encontrados entre " + num1 + " e " + num2 + ":");

        for(int i = num1; i <= num2; i++){
            if(primo(i)){
                System.out.println(i + "");
            }
        }

        scanner.close();

    }

    public static boolean primo(int num) {
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= num - 1; i++ ){
            if(num % i == 0)
                return false;
        }
        return true;
    }

}
