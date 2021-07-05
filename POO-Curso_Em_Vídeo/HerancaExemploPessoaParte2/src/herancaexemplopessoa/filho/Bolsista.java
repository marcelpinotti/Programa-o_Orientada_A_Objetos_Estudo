package herancaexemplopessoa.filho;

import herancaexemplopessoa.mae.Aluno;

/**
 * @author Marcel Pinotti
 */
public final class Bolsista extends Aluno {

  private int bolsa;

  public int getBolsa(){
  return bolsa;
  }
  public void setBolsa(int bolsa){
    this.bolsa = bolsa;
  }

  @Override
  public void pagarMensalidade(){
    System.out.println(super.getNome() + " é bolsista! Pagamento efetuado.");
  }
}