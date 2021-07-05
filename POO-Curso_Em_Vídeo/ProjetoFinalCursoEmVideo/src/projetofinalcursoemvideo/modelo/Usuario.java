package projetofinalcursoemvideo.modelo;

import projetofinalcursoemvideo.modelo.mae.Pessoa;

/**
 * @author Marcel Pinotti
 */
public class Usuario extends Pessoa {
    
    private String login;
    private  int totalAssistido;
    
    public Usuario(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }
    
    
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return this.totalAssistido;
    }
     public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }
          
    public void viuMaisUm(){
        super.ganharExperiencia();
    }
        
    public void status(){
        System.out.println("Usuário: " + getNome() + "\nLogin: " + getLogin() +
                "\nIdade : " + getIdade() + "\nSexo: " + getSexo() + 
                "\nTotal de Visualizações: " + getTotalAssistido() + 
                "\nExperiência:" + getExperiencia());
    }
    
}
