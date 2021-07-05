
package ultraxtremefight;

import ultraxtremefight.modelo.Luta;
import ultraxtremefight.modelo.Lutador;

/**
 * @author Marcel Pinotti
 */
public class UltraXtremeFight {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador ("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        l[1] = new Lutador ("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador ("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador ("DeadCode","Austrália", 28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador ("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador ("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);
             
        Luta uxf01 = new Luta();
        
        uxf01.marcarLuta(l[0], l[1]);
        uxf01.lutar();
    }
    
}
