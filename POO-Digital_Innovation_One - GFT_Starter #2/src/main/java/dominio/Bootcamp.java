package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    private String name;
    private List<Dev> devs = new ArrayList<>();
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<Conteudo> cursosMentorias = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public List<Conteudo> getCursosMentorias() {
        return cursosMentorias;
    }

    public void setCursosMentorias(List<Conteudo> cursosMentorias) {
        this.cursosMentorias = cursosMentorias;
    }

    @Override
    public String toString (){
        return  "-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-" +
                "\nBootcamp: " + this.getName() +
                "\nInscritos: " + this.getDevs() +
                "\nData de Início: " + this.getDataInicio() +
                "\nData de Fim: " + this.getDataFim() +
                "\nTrilha: " + this.getCursosMentorias() +
                "\n-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-";
    }
}
