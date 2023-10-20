package A4_E1;

public abstract class Veiculo {

    public String marca;
    public String modelo;
    public int ano;
    public double custo;

    public abstract double calcularCustoViagem(double distancia);
}
