package ultraxtremefight.modelo;

/**
 * @author Marcel Pinotti
 */

import ultraxtremefight.modelo.Lutador;

import java.util.Random;

public class Luta {

    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador desafiante, Lutador desafiado) {
        if (desafiante.getCategoria().equals(desafiado.getCategoria()) && desafiante != desafiado) {
            this.aprovada = true;
            this.desafiante = desafiante;
            this.desafiado = desafiado;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar() {
        if (this.aprovada == true) {
            System.out.println("----DESAFIANTE----");
            this.desafiante.apresentar();
            System.out.println("----DESAFIADO----");
            this.desafiado.apresentar();
            System.out.println(" ");
            Random sorteio = new Random();
            int luta = sorteio.nextInt(3);
            switch (luta) {
                case 0:
                    System.out.println("A LUTA EMPATOU!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiante.getNome().toUpperCase() + " GANHOU A LUTA!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiado.getNome().toUpperCase() + " GANHOU A LUTA!");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;

            }
        } else {
            System.out.println("A LUTA NÃO PODE ACONTECER!");
        }
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
