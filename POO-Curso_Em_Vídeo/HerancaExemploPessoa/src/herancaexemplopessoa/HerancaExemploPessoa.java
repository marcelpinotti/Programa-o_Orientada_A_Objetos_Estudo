package herancaexemplopessoa;

import herancaexemplopessoa.filho.Professor;
import herancaexemplopessoa.mae.Aluno;
import herancaexemplopessoa.mae.Funcionario;

/**
 * @author Marcel Pinotti
 */
public class HerancaExemploPessoa {
    public static void main(String[] args) {
        
        Aluno alunoUm = new Aluno();
        
        alunoUm.setNome("Marcel Pinotti");
        alunoUm.setIdade(38);
        alunoUm.setSexo('M');
        alunoUm.setMatricula(true);
        alunoUm.setCurso("Informática");
        alunoUm.cancelarMatrícula();
        alunoUm.status();
        alunoUm.statusAluno();
        System.out.println("-------------------");
        
         Funcionario funcionarioUm = new Funcionario();
        
        funcionarioUm.setNome("Viviane Pinotti");
        funcionarioUm.setIdade(37);
        funcionarioUm.setSexo('F');
        funcionarioUm.setTrabalhando(true);
        funcionarioUm.setSetor("Novos Projetos");
        funcionarioUm.pararTrabalho();
        funcionarioUm.status();
        funcionarioUm.statusFuncionário();
        System.out.println("-------------------");
        
        Professor professorUm = new Professor();
        
        professorUm.setNome("Marry Varges Pinotti");
        professorUm.setIdade(01);
        professorUm.setSexo('F');
        professorUm.setSalario(2500.99);
        professorUm.setEspecialidade("Java");
        professorUm.receberAumento(300);
        professorUm.status();
        professorUm.statusProfessor();
        System.out.println("-------------------");
        
        
    }
    
}
