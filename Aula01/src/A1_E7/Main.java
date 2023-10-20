package A1_E7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int age = scanner.nextInt();
        System.out.println("Digite seu salário:");
        double sal =  scanner.nextDouble();

        if(sal > 2000 && age >= 18){
            System.out.println("Você pode comprar um carro!");
        }else{
            System.out.println("Você não pode comprar um carro!");
        }

    }
}
