package herancaexemplopessoa.filho;

import herancaexemplopessoa.mae.Aluno;

/**
 * @author Marcel Pinotti
 */
public final class Tecnico extends Aluno {
  
  private int registroProfissional;

  public int registroProfissional(){
    return this.registroProfissional;
  }

  public void registroProfissional(int rG){
    this.registroProfissional = rG;
  }

  public void praticar(){
    System.out.println("Praticando " + super.getCurso() + ".");
  }

  @Override
  public void pagarMensalidade(){
    if (super.getSexo() =='F' || super.getSexo() =='f'){
          System.out.println(super.getNome() + " é técnica! Programa de estágio.");
      }else if (super.getSexo() =='M' || super.getSexo() =='m'){
          System.out.println(super.getNome() + " é técnico! Programa de estágio.");
      }else{
          System.out.println(super.getNome() + " é técnico(a)! Programa de estágio.");
      }
  }
}