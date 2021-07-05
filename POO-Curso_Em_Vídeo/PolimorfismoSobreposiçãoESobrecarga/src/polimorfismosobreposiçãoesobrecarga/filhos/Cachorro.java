package polimorfismosobreposiçãoesobrecarga.filhos;
/**
 * @author Marcel Pinotti
 */
public class Cachorro extends Lobo{

  @Override //Polimorfirmo de Sobreposição
  public void emitirSom(){
    System.out.println("Au! Au! Au!");
  }

  //Polimorfirmo de Sobrecarga
  public void reagir (String falar){
    if(falar == "agradável"){
    System.out.println("Reação: Abanar o rabo e latir");
    } else if (falar == "agressivo"){
    System.out.println("Reação: Rosnar");
    } else {
    System.out.println("Reação: Sair de perto");
    }
  }

  public void reagir (int hora, int min){
    if(hora < 12){
    System.out.println("Reação Manhã: Abanar o rabo");
    } else if (hora <= 18){
    System.out.println("Reação Tarde: Sair de perto");
    } else {
    System.out.println("Reação Noite: Abanar o rabo e latir");
    }
  }

  public void reagir (boolean dono){
    if(dono){
    System.out.println("Reação Dono: Abanar o rabo e latir");
    } else {
    System.out.println("Reação Estranho: Rosnar");
    }
  }

  public void reagir (){
    if(getIdade() < 5){
      System.out.println("Reação Novo: Abanar o rabo");
    } else {
      System.out.println("Reação Velho: Latir");
    }
    if (getPeso() < 10){
        System.out.println("Reação Leve: Pular");
    } else {
    System.out.println("Reação Pesado: Sentar");
    }
  }

}
