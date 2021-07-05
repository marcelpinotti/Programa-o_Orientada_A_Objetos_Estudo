package polimorfismosobreposiçãoesobrecarga;

import polimorfismosobreposiçãoesobrecarga.filhos.*;
import polimorfismosobreposiçãoesobrecarga.mae.Ave;
import polimorfismosobreposiçãoesobrecarga.mae.Mamifero;
import polimorfismosobreposiçãoesobrecarga.mae.Peixe;
import polimorfismosobreposiçãoesobrecarga.mae.Reptil;

/**
 * @author Marcel Pinotti
 */
public class PolimorfismoSobreposiçãoESobrecarga {

    public static void main(String[] args) {
    
    System.out.println("-------------");

    Mamifero m1 = new Mamifero();
    m1.setPeso(12);
    m1.setIdade(3);
    m1.setMembros(4);
    m1.setCorPelo("Marrom");
    m1.locomover();
    m1.alimentar();
    m1.emitirSom();

    System.out.println("-------------");
    
    System.out.println("Subclasse Réptil de Animal");
    Reptil r1 = new Reptil();
    r1.setPeso(8);
    r1.setIdade(5);
    r1.setMembros(4);
    r1.setCorDaEscama("Verde com amarelo");
    r1.locomover();
    r1.alimentar();
    r1.emitirSom();

    System.out.println("-------------");
    
    System.out.println("Subclasse Peixe de Animal");
    Peixe p1 = new Peixe();
    p1.setPeso(2);
    p1.setIdade(1);
    p1.setMembros(0);
    p1.setCorDaEscama("Listrado");
    p1.locomover();
    p1.alimentar();
    p1.emitirSom();
    p1.soltarBolhas();

     System.out.println("-------------");

    System.out.println("Subclasse Ave de Animal");
    Ave a1 = new Ave();
    a1.setPeso(3);
    a1.setIdade(8);
    a1.setMembros(0);
    a1.setCorPena("Amarelo");
    a1.locomover();
    a1.emitirSom();
    a1.alimentar();
    a1.fazerNinho();

    System.out.println("-------------");

    System.out.println("Subclasse Canguru de Mamífero");
    Canguru c1 = new Canguru();
    c1.setPeso(12);
    c1.setIdade(3);
    c1.setMembros(4);
    c1.setCorPelo("Marrom");
    c1.locomover();
    c1.alimentar();
    c1.emitirSom();
    c1.usarBolsa();

    System.out.println("-------------");
    
    System.out.println("Subclasse Cobra de Réptil");
    Cobra co1 = new Cobra();
    co1.setPeso(20);
    co1.setIdade(10);
    co1.setMembros(0);
    co1.setCorDaEscama("Verde");
    co1.locomover();
    co1.alimentar();
    co1.emitirSom();

    System.out.println("-------------");

    System.out.println("Subclasse Tartaruga de Réptil");
    Tartaruga t1 = new Tartaruga();
    t1.setPeso(40);
    t1.setIdade(15);
    t1.setMembros(4);
    t1.setCorDaEscama("Verde com Marron");
    t1.locomover();
    t1.alimentar();
    t1.emitirSom();

    System.out.println("-------------");

    System.out.println("Subclasse GoldFish de Peixe");
    GoldFish g1 = new GoldFish();
    g1.setPeso(1);
    g1.setIdade(4);
    g1.setMembros(0);
    g1.setCorDaEscama("Dourado");
    g1.locomover();
    g1.alimentar();
    g1.emitirSom();
    g1.soltarBolhas();

    System.out.println("-------------");

    System.out.println("Subclasse Arara de Ave");
    Ave av1 = new Arara();
    av1.setPeso(9);
    av1.setIdade(7);
    av1.setMembros(0);
    av1.setCorPena("Varde, Amarelo, Azul e Vermelho");
    av1.locomover();
    av1.emitirSom();
    av1.alimentar();
    av1.fazerNinho();

    System.out.println("-------------");

    System.out.println("Subclasse Lobo de Mamífero");
    Lobo l1 = new Lobo();
    l1.setPeso(40);
    l1.setIdade(12);
    l1.setMembros(4);
    l1.setCorPelo("Cinza com Branco");
    l1.locomover();
    l1.alimentar();
    l1.emitirSom();

    System.out.println("-------------");

    System.out.println("Subclasse Cachorro de Lobo");
    Cachorro k1 = new Cachorro();
    k1.setPeso(6);
    k1.setIdade(9);
    k1.setMembros(4);
    k1.setCorPelo("Marrom");
    k1.locomover();
    k1.alimentar();
    k1.emitirSom();
    k1.reagir("agressivo");
    k1.reagir(19,15);
    k1.reagir(false);
    k1.reagir();
      
    }
}
