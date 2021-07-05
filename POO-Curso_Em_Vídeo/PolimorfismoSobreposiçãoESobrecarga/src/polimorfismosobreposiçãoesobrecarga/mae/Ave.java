package polimorfismosobreposiçãoesobrecarga.mae;

import polimorfismosobreposiçãoesobrecarga.modelo.Animal;

/**
 * @author Marcel Pinotti
 */
public class Ave extends Animal {

  private String corPena;

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

  public String getCorPena(){
    return this.corPena;
  }
  public void setCorPena(String corPena){
    this.corPena = corPena;
  }

  @Override
  public void locomover(){
    System.out.println("Voando");
  }

  @Override
  public void alimentar(){
    System.out.println("Alpiste");
  }

  @Override
  public void emitirSom(){
    System.out.println("Som da Ave");
  }

  public void fazerNinho(){
    System.out.println("Fazendo Ninho");
  }
}