package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNum;
        int cont = 0;
        int num;
        int par = 0, impar = 0;

        System.out.println("Quantidade de números: ");
        qtdNum = scan.nextInt();

        do{
            System.out.println("Numero: ");
            num = scan.nextInt();

            if (num % 2 == 0){
                par ++;
            } else{
                impar ++;
            }

            cont ++;

        } while(cont < qtdNum);

        System.out.println("Quantidade de Pares: " + par);
        System.out.println("Quantidade de Impares: " + impar);
    }
}
