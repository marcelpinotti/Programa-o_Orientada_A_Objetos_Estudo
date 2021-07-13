package dominio;

/**
 * @author Marcel Pinotti
*/
public class ContaModelo {

    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaModelo() {
        this.setStatus(false);
        this.setSaldo(0);
    }

    public void Status() {
        System.out.println(getStatus());
        System.out.println(getSaldo());
        System.out.println(getTipo());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String conta) {
        this.setStatus(true);
        this.setTipo(conta);
        if (conta == "CC") {
            this.setTipo("Conta Corrente");
            this.setSaldo(50.00);
        } else if (conta == "CP") {
            this.setTipo("Conta Poupança");
            this.setSaldo(150.00);
        } else {
            this.setStatus(false);
        }
    }

    public void fecharConta() {
        if (this.saldo == 0) {
            this.status = false;
            this.tipo = null;
            this.numConta = 0;
            this.dono = null;
            System.out.println("A conta foi fechada.");
        } else if (this.saldo < 0 || this.saldo > 0) {
            this.status = true;
            if (this.saldo > 0) {
                System.out.println("A conta possui saldo, não pode ser fechada.");
            } else {
                System.out.println("A conta possui débito, não pode ser fechada.");
            }
        }
    }

    public void sacar(double valor) {
        if (getStatus()) {
            this.saldo -= valor;
        } else {
            System.out.println("Impossível sacar.");
        }
    }

    public void depositar(double valor) {
        if (getStatus()) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Impossível depositar.");
        }
    }

    public void mensalidade() {
        double valor;

        if (getTipo() == "CC") {
            valor = 12;
        } else {
            valor = 20;
        }
        if (this.status == true) {
            if (this.saldo > valor) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente para cobrar mensalidade.");
            }
        } else {
            System.out.println("Impossível cobrar a mensalidade.");
        }
    }
}
