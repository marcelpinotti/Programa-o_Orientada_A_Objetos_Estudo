package controleremoto;

import controleremoto.interf.Controlador;

/**
 * @author Viviane
 */
public class ControleRemotoClass implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemotoClass() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return this.tocando;
    }

    private void SetTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Métodos Abstratos  // Override significa sobrescrever (Está desconsiderando o método abstract)
    @Override
    public void ligar() {
        this.setLigado(true);
        this.SetTocando(true);
        this.setVolume(50);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.SetTocando(false);
        this.setVolume(0);
    }

    @Override
    public void abrirMenu() {
        System.out.println("_____ MENU _____");
        System.out.println("Ligado:.. " + this.ligado);
        System.out.print("Volume:... " + this.volume + " ");
        for (int i = 1; i <= this.getVolume(); i += 5){
            System.out.print("+");
        }
        System.out.println("");
        System.out.println("Tocando:.... " + this.tocando);
    }

    @Override
    public void fecharMenu() {
        System.out.println(".......FECHANDO MENU");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true && this.getTocando() == true) {
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true && this.getTocando() == true) {
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() == true) {
            this.SetTocando(false);
            this.getVolume();
        } else {
            System.out.println("Aparelho Desligado");
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() == true) {
            this.getVolume();
            this.SetTocando(true);
        } else {
            System.out.println("Aparelho Desligado");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == true && this.getTocando() == false) {
            this.SetTocando(true);
            this.setVolume(50);
        } else {
            System.out.println("O Aparelho está funcionando");
        }
    }

    @Override
    public void pausa() {
        if (this.getLigado() == true && this.getTocando() == true) {
            this.SetTocando(false);
            this.setVolume(0);
        } else {
            System.out.println("O Aparelho não está funcionando");
        }
    }

}
