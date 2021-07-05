package ultraxtremefight.modelo;
/**
 * @author Marcel Pinotti
 */
public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public Lutador(String no, String na,  int id, double alt, double pe, int vi, int de, int em){
            this.nome = no;
            this.nacionalidade = na;
            this.idade = id;
            this.altura = alt;
            this.setPeso(pe);
            this.vitorias = vi;
            this.derrotas = de;
            this.empates = em;
     }
    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso<52.2){
            this.categoria = "Sem Categoria";
        } else if (this.peso<= 70.3){
            this.categoria = "Leve";
        } else if (this.peso <= 83.9){
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Sem Categoria";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public void apresentar(){
        System.out.println("Olá Senhoras e Senhores!!! Está entrando no Octógono o lutador " + this.nome + 
                " do " + this.nacionalidade + ", com " + this.vitorias + " vitórias, " +
                + this.derrotas + " derrotas e " + this.empates + " empates."); 
            }
    
    public void status (){
        System.out.println("____ STATUS ____");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Vitórias: " + getVitorias() + " / Derrotas: " + getDerrotas() + 
                " / Empates: " + getEmpates());
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
}
