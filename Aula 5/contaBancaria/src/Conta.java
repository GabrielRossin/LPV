public class Conta
{
    public int numConta;
    public String nome;
    public double saldo;


    public Conta (int numConta, String nome)
    {
        this.setNome(nome);
        this.setNumConta(numConta);
        this.saldo = 0;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldoSaque(double valor) {


            this.saldo = getSaldo() - valor;

    }

    public void setSaldoDeposito(double valor) {


        this.saldo = getSaldo() + valor;

    }

    public void sacar(double valor)
    {
        if(getSaldo() <= 0 || getSaldo() - valor <= 0)
        {
            System.out.println("Você não possui saldo para realizar o saque");

        }
        else
        {
            setSaldoSaque(valor);
        }

    }
    public void depositar(double valor)
    {
        setSaldoDeposito(valor);

    }

    public void consultar()
    {
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Nome: " + getNome());
        System.out.println("Saldo: " + getSaldo());
    }
}
