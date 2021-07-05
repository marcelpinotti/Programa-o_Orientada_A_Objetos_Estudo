package projetofinalcursoemvideo.modelo.mae;

import projetofinalcursoemvideo.interf.AcoesVideo;

/**
 * @author Marcel Pinotti
 */
public class Videos implements AcoesVideo {
    
    private String titulo;
    private int avaliacao;
    private int visualizacoes;
    private int curtidas;
    private boolean reproduzindo;
    
    public Videos (String titulo){
        this.titulo = titulo;
        this.avaliacao = 0;
        this.visualizacoes = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao(){
        return this.avaliacao;
    }
    public void setAvaliacao(int avaliacao){
        int novaAvaliacao;
        novaAvaliacao = (this.avaliacao + avaliacao)/this.visualizacoes;
        this.avaliacao = novaAvaliacao;
    }

    public int getVisualizacoes() {
        return this.visualizacoes;
    }
    public void setVisualizacoes(int visualizacoes){
            this.visualizacoes += visualizacoes;
    }

    public int getCurtidas() {
        return this.curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    public void status(){
        System.out.println("Título: " + getTitulo() + "\nAvaliação: " + getAvaliacao() +
                "\nVisualizações: " + getVisualizacoes() + "\nCurtidas:" + getCurtidas() +
                "\nReproduzindo: " + getReproduzindo());
    }

    @Override
    public void play() {
            this.setReproduzindo(true);
    }

    @Override
    public void pause() {
           this.setReproduzindo(false);
    }

    @Override
    public void stop() {
           this.setReproduzindo(false);
    }    

    @Override
    public void like() {
        this.curtidas +=1;
    }
}



