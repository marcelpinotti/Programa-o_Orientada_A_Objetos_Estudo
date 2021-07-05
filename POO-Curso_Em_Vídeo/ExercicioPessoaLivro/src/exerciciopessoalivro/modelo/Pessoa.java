package exerciciopessoalivro.modelo;
/**
 * @author Marcel Pinotti
 */
public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    
public Pessoa(String nome, int idade, char sexo){
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
}

public Pessoa(){ }

public String getNome(){
    return this.nome;
}
public void setNome(String nome){
    this.nome = nome;
}

public int getIdade(){
    return this.idade;
}
public void setIdade(int idade){
    this.idade = idade;
}

public char getSexo(){
    return this.sexo;
}
public void setSexo(char sexo){
    this.sexo = sexo;
}

public void fazerAniversário(){
    this.idade ++;
}
}
