# Live Coding - Abstraindo Domínio Através da Orieteção a Objetos

### Instrutor Everis - Flavius Gama

## Programação Orientada a Objetos

- *Objeto* é um pacote de informações;

  - Nem sempre pode ser um objeto em si, ele pode ser um processo.  

## Pilares

  - A POO é constituída de 4 Pilares:

    - Herança

    - Polimorfismo - *(Pilar muito importante para trabalhar com POO)*

    - Encapsulamento - *(Pilar muito importante para trabalhar com POO)*

    - Abstração.    

## Classes

   - é um tipo estruturado  que pode conter (membros):

      - Atributos (dados/campos).
      - Métodos (funções/operações);

   - pode possuir outros membros:

      - construtores;
      - sobrecarga;
      - sobrescrita: pode escrever o mesmo método usando parâmetros diferentes;
      - encapsulamento: cada classe só permite acesso a atributos através de métodos (funções).
      - polimorfismo.

## UML

   - Ferramenta que serve para nortear o analista e o desenvolvedor a criar o sistema.
      - Ela representa o sistema através de diferentes diagramas:
        - de classes;
        - de objetos;
        - de classes de uso;
        - etc.
        
## Visibilidade

   - public. visível em todo o sistema.
   - protected. visível na classe, no pacote e nas subclasses.
   - default. visível na classe e no pacote.
   - private. não é visível no sistema, apenas na classe. 

## Enum

   - Pode servir como uma opção para criação de tipos sem a necessidade de criação de uma subclasse.
   - Utilizada para recursos finitos.
      - ex: Pessoa (física / jurídica), Gênero (masculino/feminino), etc.      

## Interface

   - Declara métodos comuns para diferentes tipos de classes;
     - Implementa em diferentes classes.
       - Ex. List.
