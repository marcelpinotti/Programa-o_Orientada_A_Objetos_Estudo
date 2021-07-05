package herancaexemplopessoa.mae;

import herancaexemplopessoa.modelo.PessoaClasseMae;

/**
 * @author Marcel Pinotti
 */
public class Aluno extends PessoaClasseMae {

  private int matricula;
  private String curso;

  public int getMatricula(){
    return this.matricula;
  }
  public void setMatricula(int matricula){
    this.matricula = matricula;
  }

  public String getCurso(){
    return this.curso;
  }
  public void setCurso(String curso){
    this.curso = curso;
  }

  public void pagarMensalidade(){
    System.out.println("Mensalidade paga.");
    }

}