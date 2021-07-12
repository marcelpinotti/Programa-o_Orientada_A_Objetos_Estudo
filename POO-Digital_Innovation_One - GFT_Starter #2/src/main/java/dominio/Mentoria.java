package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data){
        super(titulo, descricao);
        this.data = data;

    }

    @Override
    public double calcularXP() {
        return XP_CALCULO;
    }

    public LocalDate getData(){
        return data;
    }

    @Override
    public String toString (){
        return "\n Mentoria: " + super.titulo + ", Descrição: " + super.descricao + ", Data: " + this.data;
    }
}
