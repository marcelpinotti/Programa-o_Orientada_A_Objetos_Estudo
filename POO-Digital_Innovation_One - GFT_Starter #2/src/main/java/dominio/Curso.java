package dominio;

public class Curso extends Conteudo {

    private int tempo;

    public Curso(String titulo, String descricao, int tempo){
        super(titulo, descricao);
        this.tempo = tempo;
    }

    public int getTempo(){
        return tempo;
    }

    public void setTempo(int tempo){
        this.tempo = tempo;
    }

    @Override
    public String toString (){
        return "Curso: " + super.titulo + ", Descrição: " + super.descricao + ", Tempo: " + this.tempo + " min";
    }
}
