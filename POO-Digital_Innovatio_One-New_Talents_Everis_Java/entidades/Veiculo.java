package liveCodingAbstraindoDominioOO.entidades;

import liveCodingAbstraindoDominioOO.entidades.veiculos.InterfaceVeiculo;
import liveCodingAbstraindoDominioOO.entidades.veiculos.TipoVeiculo;

import java.time.LocalDateTime;

public class Veiculo implements InterfaceVeiculo {

    protected String marca;
    protected String placa;
    protected String modelo;
    protected double fatorEstacionamento;
    protected LocalDateTime horaEntrada;
    protected LocalDateTime horaSaida;
    protected double totalEstacionamento;
    private TipoVeiculo tipoVeiculo;


    public Veiculo() {
    }

    public Veiculo(TipoVeiculo tipoVeiculo){
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFatorEstacionamento() {
        return fatorEstacionamento;
    }

    public void setFatorEstacionamento(double fatorEstacionamento) {
        this.fatorEstacionamento = fatorEstacionamento;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getTotalEstacionamento() {
        return totalEstacionamento;
    }

    public void setTotalEstacionamento(double totalEstacionamento) {
        this.totalEstacionamento = totalEstacionamento;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public String nomeVeiculo(String nome) {
        return nome;
    }
}
