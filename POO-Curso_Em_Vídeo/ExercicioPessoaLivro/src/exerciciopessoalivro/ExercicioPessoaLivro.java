package exerciciopessoalivro;

import exerciciopessoalivro.modelo.Livro;
import exerciciopessoalivro.modelo.Pessoa;

/**
 * @author Marcel Pinotti
 */


public class ExercicioPessoaLivro {
    public static void main(String[] args) {
        
        Pessoa pessoa[] = new Pessoa[3];
        
        pessoa[0] = new Pessoa ("Marcel Pinotti", 38, 'M');
        pessoa[1] = new Pessoa ("Viviane Varges", 37, 'F');
        pessoa[2] = new Pessoa ("Marry Varges Pinotti", 01, 'F');
        
        Livro livro[] = new Livro[3];
        
        livro[0] = new Livro ("Delícias Na Cozinha", "Chef Pedro", 120);
        livro[1] = new Livro ("VBA para Leigos", "Joaquim José", 340);
        livro[2] = new Livro ("ABCD...", "Monteiro Lobato", 50);
        
       
        livro[0].setLeitor(pessoa[0]);
        livro[0].abrir();
        System.out.println(livro[0].detalhes());
        livro[0].folhear(130);
        System.out.println(livro[0].detalhes());
        livro[0].voltarPag();
        System.out.println(livro[0].detalhes());
        livro[0].fechar();
        System.out.println(livro[0].detalhes());
        
    }
    
}
