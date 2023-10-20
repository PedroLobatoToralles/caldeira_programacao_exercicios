package A3_E2;
import java.lang.Math;
public class Circulo {

    private double raio; //Atributo raio (1)
    public double area;
    public double circunferencia;
    public double diametro;


    //Método construtor (a3).
    public Circulo(double raio){

        definirRaio(raio);
    }

    //Método calcular área (2)
    public double calcularArea() {
        area = Math.PI * (this.raio * this.raio);
        return area;
    }

    //Método calcular circunferencia (3)
    public double calcularCircunferencia() {
        circunferencia = 2 * Math.PI * this.raio;
        return circunferencia;
    }

    //Método definir raio (a1)
    //Garantir que o raio seja sempre positivo (a2)
    public void definirRaio(double novoRaio) {
        if(novoRaio > 0) {
            this.raio = novoRaio;
        }else {
            System.out.println("É preciso fornecer um raio positivo!");
        }
    }

    public double getRaio(){
        return this.raio;
    }

    public boolean verificarIguais(Circulo circulo2){
        if(this.raio == circulo2.raio){
            return true;
        }else{
            return false;
        }
    }

    //Método pra calcular o diâmetro (a6)
    public double calcularDiametro(){
        diametro = this.raio * 2;
        return diametro;
    }

    public double sombreado(Circulo circulo2){
        if(this.raio >= circulo2.raio){
            double areaMaior = this.calcularArea();
            double areaMenor = circulo2.calcularArea();
            return areaMaior - areaMenor;
        }else{
            throw new IllegalArgumentException("O raio do primeiro circulo deve ser maior que o segundo!");
        }
    }

    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                "}";
    }

    public static Circulo criarNoPlano(double x, double y, double raio){
        double distanciaCentro = Math.sqrt(x * x + y * y);
        return new Circulo(distanciaCentro + raio);
    }

}

//ver2
