package projetofinalcursoemvideo;

import projetofinalcursoemvideo.modelo.Usuario;
import projetofinalcursoemvideo.modelo.mae.Videos;
import projetofinalcursoemvideo.modelo.Visualizacao;

/**
 * @author Marcel Pinotti
 */
public class ProjetoFinalCursoEmVideo {

    public static void main(String[] args) {       
               
       Videos v = new Videos("String Things");
       Videos vA = new Videos("Curso de Java");
              
       Usuario u = new Usuario("Marcel Pinotti", 38, 'M', "marcelpinotti");
       
       Visualizacao v1 = new Visualizacao (u, v);
       v1.avaliar();
       Visualizacao v2 = new Visualizacao (u, vA);
       
       v.status();
       System.out.println();
       vA.status();
       System.out.println();
       u.status();
       
       
       
      
    }
    
}
