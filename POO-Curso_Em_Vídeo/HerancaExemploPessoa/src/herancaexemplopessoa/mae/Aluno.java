package herancaexemplopessoa.mae;

import herancaexemplopessoa.modelo.PessoaClasseMae;

/**
 * @author Marcel Pinotti
 */
public class Aluno extends PessoaClasseMae {

    private boolean matricula = true;
    private String curso;

    public Aluno() {
    }
    
    public boolean getMatricula() {
        return this.matricula;
    }
    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean cancelarMatrícula() {
        if (getMatricula()) {
            this.setMatricula(false);
            this.setCurso("------");
            }
        return false;
        } 
    
    public void statusAluno(){
        System.out.println("Curso: " + getCurso()+ 
                "\nMatrucilado: " + getMatricula());
        }

    
    }
