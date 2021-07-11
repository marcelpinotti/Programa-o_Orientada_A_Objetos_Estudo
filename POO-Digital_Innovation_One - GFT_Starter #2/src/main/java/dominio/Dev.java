package dominio;

import java.util.ArrayList;
import java.util.List;

public class Dev {

    private String nome;
    private List<Curso> conteudoCurso = new ArrayList<Curso>();

    public Dev (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
