package liveCodingAbstraindoDominioOO.main;

import liveCodingAbstraindoDominioOO.entidades.Estacionamento;
import liveCodingAbstraindoDominioOO.entidades.Veiculo;
import liveCodingAbstraindoDominioOO.entidades.veiculos.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Veiculo utilitario = new Veiculo(); // <- momento de criação do objeto
        Moto moto = new Moto();
        Carro carro = new Carro();

        Estacionamento estacionamento = new Estacionamento(15.00);
        System.out.println(estacionamento.getValorHora());

        estacionamento.setTotalFaturamento(200.50);
        System.out.println(estacionamento.getTotalFaturamento());

        utilitario.setTipoVeiculo(TipoVeiculo.UTILITARIO);
        System.out.println(utilitario.getTipoVeiculo());

        List<Veiculo> veiculoList = new ArrayList<>();
        veiculoList.add(moto);
        veiculoList.add(carro);
        veiculoList.add(utilitario);

        estacionamento.setVeiculos(veiculoList);
        System.out.println(estacionamento.getVeiculos().get(2).getTipoVeiculo());

        System.out.println(carro.nomeVeiculo("Ford Ka"));

    }
}
