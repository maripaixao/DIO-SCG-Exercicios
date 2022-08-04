package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int mult = 1;

        for(int i = fatorial; i >= 1; i--){
            mult *= i;
        }

        System.out.println(fatorial + "! = " + mult);
    }
}
