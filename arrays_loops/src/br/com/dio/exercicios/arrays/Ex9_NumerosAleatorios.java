package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex9_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] aleatorios = new int[20];

        for(int i = 0; i < aleatorios.length; i++){
            int numero = random.nextInt(100);
            aleatorios[i] = numero;
        }

        System.out.println("Numeros aleatórios");
        for (int numero : aleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos numeros aleatórios");
        for (int numero : aleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}
