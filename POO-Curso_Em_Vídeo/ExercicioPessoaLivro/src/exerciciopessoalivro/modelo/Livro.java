package exerciciopessoalivro.modelo;

import exerciciopessoalivro.interf.Publicacao;

/**
 * @author Marcel Pinotti
 */

public class Livro implements Publicacao {

    private String livro;
    private String autor;
    private int totalPag;
    private int pagAtual = 0;
    private boolean aberto = false;
    private Pessoa leitor;
    
    public Livro ( String livro, String autor, int totalPag){
        this.livro = livro;
        this.autor = autor;
        this.totalPag = totalPag;
    }

    public String getLivro() {
        return this.livro;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return this.totalPag;
    }
    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Nome do Livro: " + livro + "\nNome do Autor: " + autor + 
                "\nTotal de Páginas: " + totalPag + "\nPágina atual: " + pagAtual +
                "\nAberto: " + aberto + "\nLeitor: " + leitor.getNome() +
                "\n----------------------------------";
    }

    @Override
    public void abrir() {
        this.aberto = true;
        }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pag) {
        if(pag > this.totalPag){
            this.pagAtual = totalPag;
        }else{
            this.pagAtual = pag;
        }

    }

    @Override
    public void avancarPag() {
            this.pagAtual ++;
    }

    @Override
    public void voltarPag() {
            this.pagAtual --;
    }
}
