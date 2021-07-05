package controleremoto.classe;

import controleremoto.ControleRemotoClass;

/**
 * @author Marcel Pinotti
 */
public class ControleRemoto {

    public static void main(String[] args) {
        
        ControleRemotoClass c = new ControleRemotoClass();
        
        c.abrirMenu();
        c.ligar();
        c.abrirMenu();
        c.ligarMudo();
        c.abrirMenu();
        c.desligarMudo();
        c.abrirMenu();
        c.pausa();
        c.abrirMenu();
        c.play();
        c.abrirMenu();
        c.maisVolume();
        c.abrirMenu();
        c.menosVolume();
        c.abrirMenu();
        c.fecharMenu();
        
    }
    
}
