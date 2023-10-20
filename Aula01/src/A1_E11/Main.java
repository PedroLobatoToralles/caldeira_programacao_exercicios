package A1_E11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra e/ou frase e contaremos as vogais");
        String frase = scanner.nextLine().toLowerCase();

        int vogais = 0;

        for(int i = 0;i < frase.length(); i++){
            char letra = frase.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vogais++;
            }
        }
        if(vogais == 1) {
            System.out.println("Existe " + vogais + " vogal na sua palavra/frase.");
        }else{
            System.out.println("Existem " + vogais + " vogais na sua palavra/frase.");
        }

    }
}
