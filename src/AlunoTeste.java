public class AlunoTeste {
    String nome;
    int idade;
    double[] notas;

    public AlunoTeste(String nome, int idade, double[] notas) {
     this.nome = nome;
     this.idade = idade;
     this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean aprovado() {
        return calcularMedia() >= 7;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Média: %.2f\n" + calcularMedia());
        System.out.println("Aprovado? " + (aprovado() ? "Sim" : "Não" ));
    }
}
