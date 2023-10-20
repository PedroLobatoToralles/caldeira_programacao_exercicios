package A3_E1;
public class Main {
    public static void main(String[] args) {

        ContaBancaria contapedro = new ContaBancaria("Pedro", "047.562.540-47", "123321", "007", "Av. Bento Gonçalves, 1515", 300);
        ContaBancaria conta2 = new ContaBancaria("Caio","123.123.123-04","412412","007","Av. Robertinho, 1818",0);

        contapedro.transferencia(conta2, 100);
        System.out.println(contapedro.verificarSaldo());
        System.out.println(conta2.verificarSaldo());

    }
}
