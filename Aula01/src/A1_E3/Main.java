package A1_E3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3, nmax, nmin, arit;

        System.out.println("Digite um primeiro número:");
        n1 = scanner.nextDouble();

        System.out.println("Digite um segundo número:");
        n2 = scanner.nextDouble();

        System.out.println("Digite um terceiro número:");
        n3 = scanner.nextDouble();

        if(n1 > n2) {
            if(n1 > n3){
                nmax = n1;
            }else{
                nmax = n3;
            }
        }else{
            if(n2 > n3){
                nmax = n2;
            }else{
                nmax = n3;
            }
        }

        if(n1 < n2){
            if(n1 < n3){
                nmin = n1;
            }else{
                nmin = n3;
            }
        }else{
            if(n2 < n3){
                nmin = n2;
            }else{
                nmin = n3;
            }
        }

        arit = (n1 + n2 + n3) / 3;

        System.out.println("O maior número é: " + nmax);
        System.out.println("O menor número é: " + nmin);
        System.out.println("A média aritmética é: " + arit);

    }
}
