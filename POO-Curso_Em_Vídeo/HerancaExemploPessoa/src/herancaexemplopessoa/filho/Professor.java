package herancaexemplopessoa.filho;

import herancaexemplopessoa.modelo.PessoaClasseMae;

/**
 * @author Marcel Pinotti
 */
public class Professor extends PessoaClasseMae {

    private String especialidade;
    private double salario;

    public Professor() {
    }

    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void receberAumento(double aumento){
        this.salario += aumento;
    }
    
    public void statusProfessor(){
        System.out.println("Especialidade: " + this.getEspecialidade()+ 
                "\nSalário: " + this.getSalario());
        }

}
