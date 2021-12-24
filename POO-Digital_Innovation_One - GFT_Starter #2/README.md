# Live de Programação Orientada a Objetos - 4 Pilares (Abstração, Encapsulamento, Herança e Polimorfismo)

### Resumo
Neste repositório é apresentado o projeto que serviu como explicação para a base de POO, os 4 pilares.

- **Projeto**:
  - Tema: Bootcamps para desenvolvimento profissional;
  - Professor:
    - **Venilton FalvoJr**
    - *Repositório da mentoria:* https://github.com/falvojr/dio-live-20210621

## PRIMEIRO PILAR (ABSTRAÇÃO)

*ABSTRAÇÃO* é a capacidade de absorver quais são as necessidades reais para solucionar um problema computacional. 

A ABSTRAÇÃO está diretamente relacionado com as <u>*classes de domínio, aos atributos e métodos*</u> destas classes"

- domínio = problemas computacionais.

- atributos = características.

- métodos = comportamentos.

## SEGUNDO PILAR (ENCAPSULAMENTO)

*ENCAPSULAMENTO* é o pilar responsável pela segurança das informações, é como as informações estão sendo expostas através das suas interfaces de uso.

O principal objetivo do *ENCAPSULAMENTO* é a não exposição das informações que não são necessárias.

Podemos considerar a interface de uso como o nível de acesso (permisão) as informações:

- Nível de acesso:
  - **public:** todas as classes podem acessar os atributos e métodos ("o nível mais baixo de proteção");
  - **protected**: somente as classes filhas têm total acesso aos atributos e métodos ("entra o conceito de herança");
  - **package:** os atributos e métodos da classe só estarão disponíveis, para as outras classes, dentro do pacote de criação da classe dos mesmos ("não são muito utilizados"); 
  - **private:** os atributos só podem ser acessados dentro da própria classe e através dos métodos públicos("o nível mais alto de proteção").

**obs:** Os getters e setters tem uma relação muito forte com o conceito de encapsulamento, mas são uma convensão Java, para os desenvolvedores Java manterem um padrão de desenvolvimento de códigos.

## TERCEIRO PILAR (HERANÇA)

*HERANÇA* é o pilar que explora a reutilização de código, onde existe uma classe mãe (mais genérica), que "doa" suas características  e comportamentos para classes filhas serem implementadas.

Classe Mãe = Classe Base.

Classe Filha = Classe Derivada.

Conceito de DRY: **Don’t Repeat Yourself** (Não Se Repita) - Não repetição de código (reaproveitamento de código).

A *HERANÇA* precisa fazer sentido em termos de semântica, exemplo, "Curso extends Conteudo = Curso **é um** Conteúdo".

A classe base pode ser abstrata, desde que ela só sirva como base para as classes derivadas, desta forma a mesma não pode ser instanciada.

Existindo um método abstrato dentro da classe base, todas as classes derivadas são obrigadas a implementar o método, esse obrigação na implementação é chamada de **Princípio da Sobrescrita**.


## QUARTO PILAR (POLIMORFISMO)

*POLIMORFISMO* é a capacidade de referenciar um objeto de diferentes formas, desde que essa forma respeite a hierarquia de classes.

**Princípio da Sobrecarga**: são métodos recebem o mesmo nome mas que recebem parâmetros diferentes.
