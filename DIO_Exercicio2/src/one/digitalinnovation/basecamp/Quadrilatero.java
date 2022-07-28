package one.digitalinnovation.basecamp;

public class Quadrilatero {

    //Quadrado
    public static void area(double lado){
        System.out.println("Área do Quadrado: " + lado * lado);
    }

    //Retangulo
    public static void area(double lado1, double lado2){
        System.out.println("Área do Retangulo: " + lado1 * lado2);
    }

    //Trapezio
    public static void area(double baseMenor, double baseMaior, double altura){
        System.out.println("Área do Trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    //Funções de retorno
    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double lado1, double lado1){
        return lado1 * lado2
    }

    public static double area(double baseMenor, double baseMaior, double altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
