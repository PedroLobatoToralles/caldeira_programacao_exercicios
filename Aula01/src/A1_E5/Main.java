package A1_E5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma hora:");
        int h = scanner.nextInt();
        System.out.println("Digite um minuto:");
        int m = scanner.nextInt();
        System.out.println("Digite segundos:");
        int s = scanner.nextInt();

        int stotal = s + (m*60) + (h*3600);

        int falta = 86400 - stotal;

        System.out.println("Se passaram " + stotal + " segundos desde a meia-noite");
        System.out.println("Faltam " + falta + " segundos para a meia-noite");

    }
}
