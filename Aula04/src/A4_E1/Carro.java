package A4_E1;

public class Carro extends Veiculo{

    @Override
    public double calcularCustoViagem(double distancia) {
        return 0.20 * distancia;
    }
}
