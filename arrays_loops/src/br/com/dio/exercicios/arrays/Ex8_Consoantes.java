package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex8_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0;
        int count = 0;

        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") ||
                   letra.equalsIgnoreCase("e") ||
                   letra.equalsIgnoreCase("i") ||
                   letra.equalsIgnoreCase("o") ||
                   letra.equalsIgnoreCase("u")) ){
                consoantes[count] = letra;
                qtdConsoantes ++;
            }

            count++;

        } while(count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes ) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }

        System.out.println("\nQuantidade consoantes: " + qtdConsoantes);

    }
}
