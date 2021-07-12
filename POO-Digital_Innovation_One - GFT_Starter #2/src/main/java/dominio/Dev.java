package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {

    private String nome;
    private List<Conteudo> cursosMentoriasInscritos = new ArrayList<>();
    private List<Conteudo> cursosMentoriasFinalizados = new ArrayList<>();
    private double experienciaXP;


    public Dev (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Conteudo> getCursosMentoriasInscritos() {
        return cursosMentoriasInscritos;
    }

    public void setCursosMentoriasInscritos(List<Conteudo> cursosMentoriasInscritos) {
        this.cursosMentoriasInscritos = cursosMentoriasInscritos;
    }

    public List<Conteudo> getCursosMentoriasFinalizados() {
        return cursosMentoriasFinalizados;
    }

    public void setCursosMentoriasFinalizados(List<Conteudo> cursosMentoriasFinalizados) {
        this.cursosMentoriasFinalizados = cursosMentoriasFinalizados;
    }

    public double ExperienciaXP() {
        return experienciaXP = cursosMentoriasFinalizados
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXP())
                .sum();
    }

    public void inscrever(Conteudo conteudo) {
        if (cursosMentoriasInscritos.contains(conteudo)){
            System.out.println(this.getNome() + ", você já está inscrito neste conteúdo.");
        } else {
           cursosMentoriasInscritos.add(conteudo);
        }
    }

    public void inscrever(Bootcamp bootcamp){
       // for (Conteudo conteudo: bootcamp.getCursosMentorias()) {
       //     inscrever(conteudo);
       // }
        bootcamp.getCursosMentorias().stream().forEach(this::inscrever);
        bootcamp.getDevs().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudoOptional = cursosMentoriasInscritos.stream().findFirst();
        if(conteudoOptional.isPresent()){
            cursosMentoriasFinalizados.add(conteudoOptional.get());
            cursosMentoriasInscritos.remove(conteudoOptional.get());
        } else {
            System.out.println(this.getNome() + ", você já concluiu todos os conteúdos.");
        }

    }

    @Override
    public String toString () {
        return "\nDev: " + this.getNome() + ", experiência: " + this.experienciaXP;
    }
}
