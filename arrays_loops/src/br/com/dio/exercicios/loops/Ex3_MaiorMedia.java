package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int cont = 0;
        int maior = 0;
        int soma = 0;

        do{
            System.out.println("Número: ");
            num = scan.nextInt();
            soma += num;

            if(num > maior){
                maior = num;
            }

            cont ++;
        } while(cont < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma/5);

    }
}
