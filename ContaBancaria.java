public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private String titular;


    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getString() {
        return this.titular;
    }


    //gerar os gets e sets para o numeroConta e saldo

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }


    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }


    public double sacarValor(double valor) {
        if (valor <= this.saldo) {
            return this.saldo = this.saldo - valor;
        } else {
            return this.saldo;
        }
    }


    public double depositaValor(double valor) {
        if (valor > 0) {
            return this.saldo = this.saldo + valor;
        } else {
            System.out.println("Não pode depositar valor negativo!");
            return this.saldo;
        }
    }

    
    public void consultaValor() {
        getSaldo();
    }

}