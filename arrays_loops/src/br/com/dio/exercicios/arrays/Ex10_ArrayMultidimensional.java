package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex10_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] m = new int[4][4];

        for(int l = 0; l < m.length; l++){
            for(int c = 0; c < m[l].length; c++){
                m[l][c] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : m) {
            for (int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
