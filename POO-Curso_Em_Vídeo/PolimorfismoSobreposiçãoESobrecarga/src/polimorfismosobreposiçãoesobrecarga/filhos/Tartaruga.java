package polimorfismosobreposiçãoesobrecarga.filhos;

import polimorfismosobreposiçãoesobrecarga.mae.Reptil;

/**
 * @author Marcel Pinotti
 */
public class Tartaruga extends Reptil {
  
  @Override
  public void locomover(){
    System.out.println("Andando BEEEMMMMMM devagar");
  }
}
