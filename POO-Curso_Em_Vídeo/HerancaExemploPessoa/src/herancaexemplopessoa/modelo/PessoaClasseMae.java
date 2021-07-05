package herancaexemplopessoa.modelo;
/**
 * @author Marcel Pinotti
 */
public class PessoaClasseMae {
    
    private String nome;
    private int idade;
    private char sexo;
    
    public PessoaClasseMae(){
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public int fazerAniversario(){
        return this.idade ++;
    }
    
    public void status(){
        System.out.println("Nome: " + getNome()+ 
                "\nIdade: " +getIdade()+
                "\nSexo: " +getSexo()); 
    }
    
}
