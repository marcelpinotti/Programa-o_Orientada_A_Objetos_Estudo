package polimorfismosobreposiçãoesobrecarga.filhos;

import polimorfismosobreposiçãoesobrecarga.mae.Mamifero;

/**
 * @author Marecl Pinotti
 */
public class Canguru extends Mamifero {

  @Override
  public void locomover(){
    System.out.println("Pulando");
  }

  public void usarBolsa(){
    System.out.println("Usando Bolsa");
  }
}
