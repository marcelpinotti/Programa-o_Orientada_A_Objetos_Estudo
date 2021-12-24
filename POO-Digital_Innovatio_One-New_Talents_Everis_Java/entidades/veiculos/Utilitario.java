package liveCodingAbstraindoDominioOO.entidades.veiculos;

import liveCodingAbstraindoDominioOO.entidades.Veiculo;

public class Utilitario extends Veiculo {

    private String descricao;
    private String empresa;
    private String peso;
    private String altura;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}
