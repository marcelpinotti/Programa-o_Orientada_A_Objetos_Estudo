import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo curso3 = new Curso("curso python", "descrição curso python", 8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(curso3);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp FullStack Developer");
        bootcamp.setDescricao("Descrição Bootcamp FullStack Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcel = new Dev();
        devMarcel.setNome("Marcel");
        devMarcel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcel:" + devMarcel.getConteudosInscritos());
        devMarcel.progredir();
        devMarcel.progredir();
        devMarcel.progredir();
        devMarcel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcel: " + devMarcel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcel: " + devMarcel.getConteudosConcluidos());
        System.out.println("XP:" + devMarcel.calcularTotalXp());

        System.out.println("-------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());

    }
}
