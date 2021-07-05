package polimorfismosobreposiçãoesobrecarga.modelo;
/**
 * @author Marcel Pinotti
 */
public abstract class Animal{
  protected int peso;
  protected int idade;
  protected int membros;

  public abstract void locomover();
  public abstract void alimentar();
  public abstract void emitirSom();
}
