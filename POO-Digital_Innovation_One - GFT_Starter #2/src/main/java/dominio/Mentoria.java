package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(String titulo, String descricao){
        super(titulo, descricao);
    }

    public LocalDate getData(){
        return data;
    }

    @Override
    public String toString (){
        return "Mentoria: " + super.titulo + ", Descrição: " + super.descricao + ", Data: " + this.data;
    }
}
