package projetofinalcursoemvideo.modelo.mae;
/**
 * @author Marcel Pinotti
 */
public abstract class Pessoa {
    
    protected String nome;
    protected int idade;
    protected char sexo;
    protected int experiencia;
    
    protected Pessoa(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    protected String getNome() {
        return nome;
    }
    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdade() {
        return idade;
    }
    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected char getSexo() {
        return sexo;
    }
    protected void setSexo(char sexo) {
        this.sexo = sexo;
    }

    protected int getExperiencia() {
        return experiencia;
    }
    protected void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    protected void ganharExperiencia(){
        this.experiencia += 1;
    }
}
