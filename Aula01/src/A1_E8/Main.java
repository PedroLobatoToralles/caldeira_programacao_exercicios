package A1_E8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você é Gestante, Idoso, PCD ou Nenhuma das alternativas (n)?");
        String fila = scanner.nextLine();

        if(fila.equals("Gestante") || fila.equals("gestante") || fila.equals("Idoso") || fila.equals("Idosa") || fila.equals("idoso") || fila.equals("idosa") || fila.equals("PCD") || fila.equals("pcd")) {
            System.out.println("Você tem direito a fila prioritária!");
        }else{
            System.out.println("Você NÃO tem direito a fila prioritária!!!");
        }

    }
}
