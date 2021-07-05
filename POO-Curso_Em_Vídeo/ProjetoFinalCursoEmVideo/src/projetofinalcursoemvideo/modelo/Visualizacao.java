package projetofinalcursoemvideo.modelo;

import projetofinalcursoemvideo.modelo.mae.Videos;

/**
 * @author Marcel Pinotti
 * utilizando agregacao 
 */
public class Visualizacao  {
    
    private Usuario expectador;
    private Videos filme;
    
    public Visualizacao (Usuario expectador, Videos filme){
        this.expectador = expectador;
        this.filme = filme;
        this.expectador.setTotalAssistido(this.expectador.getTotalAssistido()+1);
        this.filme.setVisualizacoes(this.filme.getVisualizacoes()+1);
        
    }
    
    public Usuario getExpectador() {
        return expectador;
    }
    public void setExpectador(Usuario expectador) {
        this.expectador = expectador;
    }

    public Videos getFilme() {
        return filme;
    }
    public void setFilme(Videos filme) {
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar (int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar (double porcentagem){
        int total = 0;
        if (porcentagem <= 20){
            total = 3;
        } else if (porcentagem <=50){
            total = 5;
        } else if (porcentagem <= 90){
            total = 8;
        } else {
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }
   
     public void status(){
        System.out.println("Expectador: " + getExpectador() + "\nFilme : " + getFilme());
     }
}
