package herancaexemplopessoa;

import herancaexemplopessoa.filho.Bolsista;
import herancaexemplopessoa.filho.Professor;
import herancaexemplopessoa.filho.Tecnico;
import herancaexemplopessoa.mae.Aluno;

/**
 * @author Marcel Pinotti
 */
public class HerancaExemploPessoa {
    
    public static void main(String[] args) {

    
    Aluno p = new Aluno();

    p.setNome("Marcel");
    p.setIdade(38);
    p.setSexo('M');
    
    System.out.println(p.toString());
    p.pagarMensalidade();
    p.fazerAniversario();
    System.out.println("------ fez aniversário.");
    System.out.println(p.toString());
    System.out.println("----------------");

    Bolsista b1 = new Bolsista();
    b1.setNome("Marry");
    b1.setIdade(1);
    b1.setSexo('F');
    System.out.println(b1.toString());
    b1.pagarMensalidade();
    System.out.println("----------------");

    Tecnico t1 = new Tecnico();
    t1.setNome("Viviane");
    t1.setIdade(37);
    t1.setSexo('F');
    t1.setCurso("Gestão de Negócios");
    System.out.println(t1.toString());
    System.out.println("Curso: " + t1.getCurso() + ".");
    t1.praticar();
    t1.pagarMensalidade();
    System.out.println("----------------");

    Professor prof = new Professor();
    prof.setNome("Fatima");
    prof.setIdade(55);
    prof.setSexo('f');
    System.out.println(prof.toString());
    prof.setEspecialidade("Linguagem Java");
    prof.setSalario(1200);
    prof.receberAumento(300);
    prof.setTrabalhando(true);
    prof.setSetor("Desenvolvimento de Software");
    prof.statusFuncionário();
    System.out.println("-------------------"); 
    
  }
}
        
       