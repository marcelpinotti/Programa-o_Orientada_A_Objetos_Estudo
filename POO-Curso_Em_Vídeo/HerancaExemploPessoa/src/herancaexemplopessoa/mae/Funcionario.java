package herancaexemplopessoa.mae;

import herancaexemplopessoa.modelo.PessoaClasseMae;

/**
 * @author Viviane
 */
public class Funcionario extends PessoaClasseMae {
    private String setor;
    private boolean trabalhando = true;
    
    public Funcionario(){
    }

    public String getSetor() {
        return this.setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public boolean pararTrabalho(){
        if (getTrabalhando()){
            this.setSetor("------");
            this.setTrabalhando(false);
        }
        return false;
    }
    
    public void statusFuncionário(){
        System.out.println("Setor: " + getSetor()+ 
                "\nTrabalhando: " +getTrabalhando()); 
    }
}
