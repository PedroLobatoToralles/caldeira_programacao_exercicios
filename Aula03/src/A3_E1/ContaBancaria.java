package A3_E1;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ContaBancaria {
    Date data = new Date();
    Date hora = Calendar.getInstance().getTime();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    String dataFormatada = sdf.format(hora);


    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;

    private List<String> historico;
    private boolean ativa;
    private double taxaManutencao;

    //Método construtor (a3)

    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco, String endereco, double saldo){
        setNome(nome);
        setCpf(cpf);
        setIdentificadorConta(identificadorConta);
        setBanco(banco);
        alterarEndereco(endereco);
        setSaldo(saldo);

    }


    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setCpf(String novoCpf){
        this.cpf = novoCpf;
    }

    public void setIdentificadorConta(String novoId){
        this.identificadorConta = novoId;
    }

    public void setBanco(String novoBanco){
        this.banco = novoBanco;
    }

    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }

    public String getCpf() {

        return this.cpf;
    }

    public String getIdentificadorConta() {

        return this.identificadorConta;
    }

    public String getBanco() {

        return this.banco;
    }

    public String getEndereco() {

        return this.endereco;
    }
    //Método verificar saldo (4)
    public double verificarSaldo() {

        return saldo;
    }

    //Método saque (1)
    public void saque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Transação concluida");
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
    //Método depósito (2)
    public void deposito(double valor) {

        this.saldo+= valor;
        System.out.println("Depósito de R$" + valor + " concluído.");
    }
    //Método pix (3)
    public void pix(double valor) {
        if(saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Pix realizado com sucesso.");
            System.out.println("R$" + verificarSaldo());
            System.out.println(dataFormatada);
        }else{
            System.out.println("Erro: Saldo insuficiente.");
        }
    }
    //Método transferencia (4)
    public void transferencia(ContaBancaria destino, double valor) {
        Calendar calendar = Calendar.getInstance();
        int horaAtual = calendar.get(Calendar.HOUR_OF_DAY);
        if(horaAtual >= 8 && horaAtual < 19 && this.saldo >= valor){
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferencia de R$" + valor + " concluída.");

        }else if (this.saldo < valor){
            System.out.println("Erro: Saldo insuficiente");
        }else if (horaAtual < 8 || horaAtual > 18){
            System.out.println("Erro: A transferência só pode ser feita entre 8hrs e 19hrs.");
        }
    }


    //Método pra verificar horário (5)
    public void verificarHorario() {

        System.out.println(dataFormatada);
    }

    //Método pra verificar informações (6)
    public void verificarInformacoes() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.identificadorConta);
        System.out.println(this.banco);
        System.out.println(this.endereco);
        System.out.println(this.saldo);
        System.out.println(this.data);
    }

    //Método pra alterar endereço (a4)
    public void alterarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public void calcularJuros(double taxa) {
        if(ativa){
            double juros = saldo * taxa / 100;
            saldo += juros;
            registrarTransacao("Juros calculados: R$" + juros);
            System.out.println("Juros calculados e adicionados ao saldo.");
        }else{
            System.out.println("Erro: A conta está desativada e não é possível calcular juros.");
        }
    }

    public void taxaManutencaoMensal(){
        if(ativa && LocalDateTime.now().getDayOfMonth() == 1){
            if(saldo >= taxaManutencao){
                saldo -= taxaManutencao;
                registrarTransacao("Taxa de manutenão mensal deduzida: R$" + taxaManutencao);
                System.out.println("Taxa de manutenão mensal deduzida: R$" + taxaManutencao);
            }else{
                saldo = 0.0;
                ativa = false;
                registrarTransacao("Conta encerrada devido à falta de saldo para taxa de manutenção mensal.");
                System.out.println("Conta encerrada devido à falta de saldo para taxa de manutenção mensal.");
            }
        }
    }

    public void fecharConta() {
        if(ativa){
            saldo = 0.0;
            ativa = false;
            registrarTransacao("Conta encerrada.");
            System.out.println("Conta encerrada com sucesso.");
        }else{
            System.out.println("Erro: A conta já está encerrada.");
        }
    }

    public void registrarTransacao(String transacao){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataHora = String.valueOf(LocalDateTime.now());
        historico.add(dataHora + " - " + transacao);
    }

    public void exibirHistorico(){
        if(historico.isEmpty()){
            System.out.println("Não há transações registradas.");
        }else{
            System.out.println("Histórico de transações:");
            for(String transacao : historico){
                System.out.println(transacao);
            }
        }
    }

}
