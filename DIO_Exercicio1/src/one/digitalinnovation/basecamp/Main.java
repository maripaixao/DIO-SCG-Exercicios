package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(5, 6);
        Calculadora.subtracao(8, 1);
        Calculadora.multiplicacao(9, 4);
        Calculadora.divisao(7, 2);

        // Mensagem
        System.out.println("\nExercício Mensagem");
        Mensagem.obterMensagem(11);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);

        // Empréstimo
        System.out.println("\nExercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
