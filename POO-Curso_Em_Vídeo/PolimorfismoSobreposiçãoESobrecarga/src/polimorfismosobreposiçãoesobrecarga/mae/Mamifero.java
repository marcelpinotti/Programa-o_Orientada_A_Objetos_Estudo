package polimorfismosobreposiçãoesobrecarga.mae;

import polimorfismosobreposiçãoesobrecarga.modelo.Animal;

/**
 * @author Marcel Pinotti
 */
public class Mamifero extends Animal {

  private String corPelo;

  public int getPeso(){
    return this.peso;
  }
  public void setPeso(int peso){
    this.peso = peso;
    System.out.println("Peso: " + this.peso);
  }

  public int getIdade(){
    return this.idade;
  }
  public void setIdade(int idade){
    this.idade = idade;
    System.out.println("Idade: " + this.idade);
  }

  public int getMembros(){
    return this.membros;
  }
  public void setMembros(int membros){
    this.membros = membros;
    System.out.println("Número de Membros: " + this.membros);
  }

  public String getCorPelo(){
    return this.corPelo;
  }
  public void setCorPelo(String corPelo){
    this.corPelo = corPelo;
  }

  @Override
  public void locomover(){
    System.out.println("Correndo");
  }

  @Override
  public void alimentar(){
    System.out.println("Mamando");
  }

  @Override
  public void emitirSom(){
    System.out.println("Som de Mamífero");
  }
}