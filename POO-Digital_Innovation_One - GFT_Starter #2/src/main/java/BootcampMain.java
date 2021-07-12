import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;


import java.time.LocalDate;
import java.util.Arrays;

public class BootcampMain {

    public static void main (String[] args){

        Curso cursoJava = new Curso("JAVA BÁSICO", "INTRODUÇÃO À LINGUAGEM JAVA", 30);
        Curso cursoJava1 = new Curso("JAVA MODERNO", "STREAMS, LAMBDAS e MÓDULOS", 120);
        Curso cursoSpring = new Curso("PRIMEIROS PASSOS - SPRING BOOT", "INTRODUÇÃO AO SPRING BOOT", 45);

        Mentoria mentoriaJava = new Mentoria("APRENDENDO A USAR STREAMS", "STREAMS E PRINCIPAIS MÉTODOS", LocalDate.of(2021, 06, 21));

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setName("BOOTCAMP EXPERT EM JAVA");
        bootcampJava.setDataInicio(LocalDate.now());
        bootcampJava.setDataFim(bootcampJava.getDataInicio().plusDays(50));
        bootcampJava.setCursosMentorias(Arrays.asList(cursoJava, cursoJava1, cursoSpring, mentoriaJava));

        Dev Marcel = new Dev("Marcel Pinotti");
        Marcel.inscrever(cursoJava);
        Marcel.inscrever(bootcampJava);

        Dev Viviane = new Dev("Viviane Pinotti");
        Viviane.inscrever(cursoSpring);
        Viviane.inscrever(mentoriaJava);
        Viviane.inscrever(bootcampJava);
        Marcel.progredir();
        Marcel.progredir();
        Viviane.progredir();
        Viviane.progredir();
        Viviane.progredir();
        System.out.println(Marcel.getNome() + " : " + Marcel.ExperienciaXP() + " XP");
        System.out.println(Viviane.getNome() + " : " + Viviane.ExperienciaXP() + " XP");
        System.out.println(bootcampJava.toString());
    }
}
