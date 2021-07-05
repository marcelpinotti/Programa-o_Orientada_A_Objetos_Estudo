package polimorfismosobreposiçãoesobrecarga.mae;

import polimorfismosobreposiçãoesobrecarga.modelo.Animal;

/**
 * @author Marcel Pinotti
 */

public class Reptil extends Animal {


  private String corDaEscama;

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

  public String getCordaEscama(){
    return this.corDaEscama;
  }
  public void setCorDaEscama(String corDaEscama){
    this.corDaEscama = corDaEscama;
  }

  @Override
  public void locomover(){
    System.out.println("Rastejando");
  }

  @Override
  public void alimentar(){
    System.out.println("Comendo Vegetais");
  }

  @Override
  public void emitirSom(){
    System.out.println("Som de Réptil");
  }
}
