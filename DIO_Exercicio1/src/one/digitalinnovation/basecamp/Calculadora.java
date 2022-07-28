package one.digitalinnovation.basecamp;

import java.util.Scanner;

public class Calculadora {

    public static void soma(double n1, double n2){
        double resultado = n1 + n2;

        System.out.println("A soma entre " + n1 + " e " + n2 + " é: " + resultado);
    }

    public static void subtracao(double n1, double n2) {
        double resultado = n1 - n2;

        System.out.println("A subtração entre " + n1 + " e " + n2 + " é: " + resultado);
    }

    public static void multiplicacao(double n1, double n2){
        double resultado = n1 * n2;

        System.out.println("A multiplicação entre " + n1 + " e " + n2 + " é: " + resultado);
    }

    public static void divisao(double n1, double n2){
        double resultado = n1 / n2;

        System.out.println("A divisão entre " + n1 + " e " + n2 + " é: " + resultado);
    }
}
