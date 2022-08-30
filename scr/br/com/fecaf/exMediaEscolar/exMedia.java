package exAula05.scr.br.com.fecaf.exMediaEscolar;

import java.util.Scanner;

public class exMedia {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String nomeAluno;
        String nomeDocente;
        String sexoAluno;
        String sexoDocente;
        String nomeCurso;
        String nomeDisciplina;
        String Aluno = null;
        String situacao = "reprovado";
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;
        float notaExame = 0;
        boolean feminino = false;
        boolean masculino = false;

        Scanner entraDados = new Scanner(System.in);
        System.out.printf("Favor inserir o nome do Aluno: ");
        nomeAluno = entraDados.nextLine();
        if (nomeAluno.length() == 0) {
            System.out.printf("[ERRO!]: DADO INVÁLIDO: FAVOR INSERIR UM DADO VÁLIDO.");
            System.exit(-1);
        }
        ;

        System.out.printf("Favor inserir o nome do Docente: ");
        nomeDocente = entraDados.nextLine();
        if (nomeDocente.length() == 0) {
            System.out.printf("[ERRO!]: DADO INVÁLIDO: FAVOR INSERIR UM DADO VÁLIDO.");
            System.exit(-1);
        }
        ;

        System.out.printf("Favor inserir o sexo do Professor: ");
        sexoDocente = entraDados.next().toLowerCase();
        if (sexoDocente.length() == 0) {
            System.out.printf("[ERRO!]: DADO INVÁLIDO: FAVOR INSERIR UM DADO VÁLIDO.");
            System.exit(-1);
        }
        ;
        switch (sexoDocente) {
            case "feminino", "f", "mulher", "menina":
                feminino = true;
                sexoDocente = "Professora: ";
                break;
            case "masculino", "homem", "menino", "m":
                masculino = true;
                sexoDocente = "Professor:";
                break;
            default:
                System.out.printf("[ERRO!]: DADO INVÁLIDO: FAVOR INSERIR UM DADO VÁLIDO.");
                System.exit(-1);
                break;
        }
        ;

        System.out.printf("Favor inserir o sexo do Estudante: ");
        sexoAluno = entraDados.next().toLowerCase();
        if (sexoAluno.length() == 0) {
            System.out.printf("[ERRO!]: DADO INVÁLIDO: FAVOR INSERIR UM DADO VÁLIDO.");
            System.exit(-1);
        }
        ;
        switch (sexoAluno) {
            case "feminino", "f", "mulher", "menina":
                feminino = true;
                sexoAluno = "A Aluna: ";
                Aluno = "da Aluna";
                break;
            case "masculino", "homem", "menino", "m":
                masculino = true;
                sexoAluno = "O Aluno: ";
                Aluno = "do Aluno";
                break;
            default:
                System.out.printf("[ERRO!]: DADO INVÁLIDO: FAVOR INSERIR UM DADO VÁLIDO.");
                System.exit(-1);
                break;
        }
        ;

        System.out.printf("Favor Inserir o nome do curso: ");
        nomeCurso = entraDados.next();
        if (nomeCurso.length() == 0) {
            System.out.printf("[ERRO!]: DADO INVÁLIDO: FAVOR INSERIR UM DADO VÁLIDO.");

            System.exit(-1);
        }
        ;
        System.out.printf("Favor inserir a disciplina: ");
        nomeDisciplina = entraDados.next().toLowerCase();
        if (nomeDisciplina.length() == 0) {
            System.out.printf("[ERRO!]: DADO INVÁLIDO: FAVOR INSERIR UM DADO VÁLIDO.");
            System.exit(-1);
        }
        ;

        System.out.printf("Favor inserir a Nota 1: ");
        nota1 = entraDados.nextFloat();
        if (nota1 < 0 || nota1 > 100) {
            System.out.printf("[ERRO!]: DADO INVÁLIDO: FAVOR INSERIR UM DADO VÁLIDO.");
            System.exit(-1);

        }

        System.out.printf("Favor inserir a Nota 2: ");
        nota2 = entraDados.nextFloat();
        if (nota2 < 0 || nota2 > 100) {
            System.out.printf("[ERRO!]: DADO INVÁLIDO: FAVOR INSERIR UM DADO VÁLIDO.");
            System.exit(-1);
        }

        System.out.printf("Favor inserir a Nota 3: ");
        nota3 = entraDados.nextFloat();
        if (nota3 < 0 || nota3 > 100) {
            System.out.printf("[ERRO!]: DADO INVÁLIDO: FAVOR INSERIR UM DADO VÁLIDO.");
            System.exit(-1);
        }
        ;
        System.out.printf("Favor inserir a Nota 4: ");
        nota4 = entraDados.nextFloat();
        if (nota4 < 0 || nota4 > 100) {
            System.out.printf("[ERRO!]: DADO INVÁLIDO: FAVOR INSERIR UM DADO VÁLIDO.");
            System.exit(-1);
        }
        ;
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println();

        if (media >= 70) {
            System.out.println("APROVADO");
            situacao = "APROVADO";
        } else if (media < 50) {
            System.out.println("REPROVADO");
            situacao = "REPROVADO";

        } else if ((media > 50) || (media <= 69.9)) {
            System.out.println("EXAME!");
            System.out.println("Insira a nota do exame");
            notaExame = entraDados.nextFloat();
            if ((media + notaExame) / 2 >= 60) {
                System.out.println("APROVADO");
                situacao = "APROVADO";
            } else
                System.out.println("REPROVADO");
        }

        if (media >= 70) {
            System.out.println("__________________________________________________________________________");
            System.out.println(sexoAluno + nomeAluno + " foi " + situacao + " na disciplina " + nomeDisciplina);
            System.out.println("Curso: " + nomeCurso);
            System.out.println(sexoDocente + " " + nomeDocente);
            System.out.println("__________________________________________________________________________");
            System.out.println("Notas " + Aluno + " | " + nota1 + " | " + nota2 + " | " + nota3 + " | " + nota4);
            System.out.println("Media Final: " + media);
            System.out.println("__________________________________________________________________________");
        }
        if (media <= 60) {
            System.out.println(sexoAluno + nomeAluno + " foi " + situacao + " na disciplina " + nomeDisciplina);
            System.out.println("Curso: " + nomeCurso);
            System.out.println(sexoDocente + nomeDocente);
            System.out.println("__________________________________________________________________________");
            System.out.println("Notas " + Aluno + " | " + nota1 + " | " + nota2 + " | " + nota3 + " | " + nota4 + " | "
                    + notaExame);
            System.out.println("Media Final: " + media);
            System.out.println("Media final do exame: " + (media + notaExame) / 2);
            System.out.println("__________________________________________________________________________");
        }
    }
}