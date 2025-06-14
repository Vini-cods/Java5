# Programação Orientada a Objetos em Java

Este projeto demonstra os conceitos fundamentais da Programação Orientada a Objetos (POO) em Java através de um sistema de cadastro de alunos com diferentes implementações de classes.

## 📚 Conteúdo da Aula

### 1. Classes e Objetos
- Criação de classes com atributos e métodos
- Instanciação de objetos
- Encapsulamento com modificadores de acesso

### 2. Construtores
- Inicialização de objetos através de construtores
- Uso da palavra-chave `this`

### 3. Métodos
- Métodos de cálculo (`calcularMedia()`)
- Métodos de validação (`aprovado()`)
- Métodos de exibição (`exibirDados()`)
- Métodos getters (`getNome()`, `getIdade()`)

### 4. Entrada de Dados
- Uso da classe `Scanner` para captura de entrada do usuário
- Tratamento de diferentes tipos de dados

## 🏗️ Estrutura do Projeto

### Classe `AlunoNovo`
```java
public class AlunoNovo {
    private String nome;
    private int idade;
    private double nota1, nota2, nota3;
    // Construtores e métodos...
}
```

**Características:**
- Atributos **privados** (encapsulamento)
- Três notas específicas (nota1, nota2, nota3)
- Métodos getter para acesso aos atributos
- Formatação de saída com `printf`

### Classe `AlunoTeste`
```java
public class AlunoTeste {
    String nome;
    int idade;
    double[] notas;
    // Construtores e métodos...
}
```

**Características:**
- Atributos com visibilidade **padrão** (package-private)
- Array de notas (flexível para qualquer quantidade)
- Uso de loop `for-each` para cálculo da média

### Classe `Main`
- Sistema interativo de cadastro
- Uso da classe `Scanner` para entrada de dados
- Loop para cadastro de múltiplos alunos

## 🔧 Como Executar

1. Compile todos os arquivos Java:
```bash
javac *.java
```

2. Execute o programa:
```bash
java Main
```

3. Siga as instruções no console para cadastrar alunos

## 🖥️ Exemplo de Execução

```
===== Sistema de Cadastro de Alunos =====
Quantos alunos deseja cadastrar? 2

--- Aluno 1 ---
Nome: Maria Silva
Idade: 16
Nota 1: 8.5
Nota 2: 7.0
Nota 3: 9.0

Resultado do aluno:
Nome: Maria Silva
Idade: 16
Média: 8.17
Aprovado? Sim

--- Aluno 2 ---
Nome: João Santos
Idade: 17
Nota 1: 6.0
Nota 2: 5.5
Nota 3: 6.5

Resultado do aluno:
Nome: João Santos
Idade: 17
Média: 6.00
Aprovado? Não

Cadastro finalizado.
```

## 🎯 Conceitos de POO Demonstrados

### 1. **Encapsulamento**
- `AlunoNovo`: atributos privados com métodos getter
- `AlunoTeste`: atributos com visibilidade padrão

### 2. **Abstração**
- Métodos que encapsulam lógica complexa (`calcularMedia()`, `aprovado()`)
- Interface simples para o usuário através de `exibirDados()`

### 3. **Modularidade**
- Separação de responsabilidades entre classes
- Código reutilizável e organizado

## 🔍 Diferenças entre as Classes

| Aspecto | AlunoNovo | AlunoTeste |
|---------|-----------|------------|
| **Visibilidade** | Atributos privados | Atributos padrão |
| **Notas** | 3 notas fixas | Array flexível |
| **Getters** | Possui métodos getter | Não possui |
| **Formatação** | Usa `printf` | Usa `println` |
| **Flexibilidade** | Menos flexível | Mais flexível |

## 💡 Recursos Técnicos Utilizados

### Scanner
```java
Scanner scanner = new Scanner(System.in);
int quantidade = scanner.nextInt();
scanner.nextLine(); // Consumir quebra de linha
```

### Operador Ternário
```java
System.out.println("Aprovado? " + (aprovado() ? "Sim" : "Não"));
```

### Formatação de Saída
```java
System.out.printf("Média: %.2f\n", calcularMedia());
```

### Loop For-Each
```java
for (double nota : notas) {
    soma += nota;
}
