package herancaexemplopessoa.filho;

import herancaexemplopessoa.mae.Funcionario;

/**
 * @author Marcel Pinotti
 */
public class Professor extends Funcionario {

  private String especialidade;
  private double salario;
  

  public String getEspecialidade(){
    return this.especialidade;
  }
  public void setEspecialidade(String especialidade){
    this.especialidade = especialidade;
    if (super.getSexo() =='F'|| super.getSexo() =='f'){
          System.out.println("Professora de " + getEspecialidade() + ".");
      }else if (super.getSexo() =='M' || super.getSexo() =='m'){
          System.out.println("Professor de " + getEspecialidade() + ".");
      }else{
          System.out.println("Professor (a) de " + getEspecialidade() + ".");
      }
  }

  public double getSalario(){
    return this.salario;
  }
  public void setSalario(double salario){
    this.salario = salario;
    System.out.println("O Salário é de " + getSalario() + ".");
  }

  public void receberAumento(double salario){
    this.salario += salario;
    if (super.getSexo() =='F' || super.getSexo() =='f'){
        System.out.println("O aumento foi de R$ " + salario + ". O salário da " + super.getNome() + " foi para " + getSalario() + ".");
      }else if (super.getSexo() =='M' || super.getSexo() =='m'){
        System.out.println("O aumento foi de R$ " + salario + ". O salário do " + super.getNome() + " foi para " + getSalario() + ".");
      }else{
        System.out.println("O aumento foi de R$ " + salario + ". O salário do(a) " + super.getNome() + " foi para " + getSalario() + ".");
      }
  }
}