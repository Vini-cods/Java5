import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        double[] notas1 = {7.0, 8.5, 6.0};
//        AlunoTeste aluno1 = new AlunoTeste("Ana Clara", 16, notas1);
//
//        double[] notas2 = {5.5, 6.0, 4.5};
//        AlunoTeste aluno2 = new AlunoTeste("João Pedro", 17, notas2);
//
//        aluno1.exibirDados();
//        System.out.println();
//        aluno2.exibirDados();


                Scanner scanner = new Scanner(System.in);

                System.out.println("===== Sistema de Cadastro de Alunos =====");
                System.out.print("Quantos alunos deseja cadastrar? ");
                int quantidadeAlunos = scanner.nextInt();
                scanner.nextLine(); // consumir quebra de linha

                for (int i = 1; i <= quantidadeAlunos; i++) {
                    System.out.println("\n--- Aluno " + i + " ---");

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();

                    System.out.print("Nota 1: ");
                    double nota1 = scanner.nextDouble();

                    System.out.print("Nota 2: ");
                    double nota2 = scanner.nextDouble();

                    System.out.print("Nota 3: ");
                    double nota3 = scanner.nextDouble();
                    scanner.nextLine(); // consumir quebra de linha

                    AlunoNovo alunoNovo = new AlunoNovo(nome, idade, nota1, nota2, nota3);
                    System.out.println("\nResultado do aluno:");
                    alunoNovo.exibirDados();
                }
                scanner.close();
                System.out.println("\nCadastro finalizado.");
    }
}