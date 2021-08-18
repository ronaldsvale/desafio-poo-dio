import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Orientação a Objetos em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Fundamentos de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de alunos de Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Júlia: " + devJulia.getConteudosInscritos());
        devJulia.progredir();
        devJulia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Júlia: " + devJulia.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Júlia: " + devJulia.getConteudosConcluidos());
        System.out.println("XP: " + devJulia.calcularTotalXp());

        System.out.println("------");

        Dev devRonald = new Dev();
        devRonald.setNome("Ronald");
        devRonald.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Ronald: " + devRonald.getConteudosInscritos());
        devRonald.progredir();
        devRonald.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Ronald: " + devRonald.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Ronald: " + devRonald.getConteudosConcluidos());
        System.out.println("XP: " + devRonald.calcularTotalXp());

    }
}
