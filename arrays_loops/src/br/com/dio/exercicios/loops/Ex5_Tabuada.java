package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número para ver a tabuada: ");
        int num = scan.nextInt();

        System.out.println("Tabuada de " + num);

        for (int cont = 1; cont <= 10; cont++){
            System.out.println(num + " X " + cont + " = " + num*cont);
        }
    }
}
