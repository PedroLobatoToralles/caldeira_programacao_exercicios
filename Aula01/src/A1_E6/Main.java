package A1_E6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        if(idade < 16)
            System.out.println("Você nao pode votar!");
        if(idade == 16 || idade == 17 || idade > 65)
            System.out.println("O voto é facultativo!");
        if(idade >= 18 && idade <= 65)
            System.out.println("Você é OBRIGADO a votar!");

    }
}
