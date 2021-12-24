package liveCodingAbstraindoDominioOO.entidades;

import java.util.List;

public class Estacionamento {

    private double valorHora;
    private double totalFaturamento;
    private double totalFaturamentoCarro;
    private double totalFaturamentoMoto;
    private double totalFaturamentoUtilitario;
    private List<Veiculo> veiculos;

    public Estacionamento() {
    }
    //sobrescrita (Polimorfismo)
    public Estacionamento(double valorHora, double totalFaturamento,
                          double totalFaturamentoCarro, double totalFaturamentoMoto,
                          double totalFaturamentoUtilitario) {
        this.valorHora = valorHora;
        this.totalFaturamento = totalFaturamento;
        this.totalFaturamentoCarro = totalFaturamentoCarro;
        this.totalFaturamentoMoto = totalFaturamentoMoto;
        this.totalFaturamentoUtilitario = totalFaturamentoUtilitario;
    }

    public  Estacionamento(double valorHora){
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }

    public void setTotalFaturamento(double totalFaturamento) {
        this.totalFaturamento = totalFaturamento;
    }

    public double getTotalFaturamentoCarro() {
        return totalFaturamentoCarro;
    }

    public void setTotalFaturamentoCarro(double totalFaturamentoCarro) {
        this.totalFaturamentoCarro = totalFaturamentoCarro;
    }

    public double getTotalFaturamentoMoto() {
        return totalFaturamentoMoto;
    }

    public void setTotalFaturamentoMoto(double totalFaturamentoMoto) {
        this.totalFaturamentoMoto = totalFaturamentoMoto;
    }

    public double getTotalFaturamentoUtilitario() {
        return totalFaturamentoUtilitario;
    }

    public void setTotalFaturamentoUtilitario(double totalFaturamentoUtilitario) {
        this.totalFaturamentoUtilitario = totalFaturamentoUtilitario;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
