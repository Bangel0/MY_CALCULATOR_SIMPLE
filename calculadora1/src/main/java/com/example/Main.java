package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // PASO2
        double numero1, numero2, resultado;
        String operacion;
        // PASO 3
        Scanner Calculator = new Scanner(System.in);
        System.out.println("ingrese el primer numero a calcular");
        numero1 = Calculator.nextDouble();
        System.out.println("ingrese el segundo numero a calcular");
        numero2 = Calculator.nextDouble();
        System.out.println("AHORA INGRESE LA OPERACION QUE QUIERA REALIZAR");
        System.out.println(" + SUMA ");
        System.out.println("- RESTA ");
        System.out.println(" * MULTIPLICACION");
        System.out.println(" / DIVISION ");
        System.out.println(" % MODULO");
        Scanner input = new Scanner(System.in);
        operacion = input.nextLine();

        resultado = 0;

        if (operacion.equalsIgnoreCase("+")) {
            resultado = (numero1 + numero2);
        }

        if (operacion.equalsIgnoreCase("-")) {
            resultado = (numero1 - numero2);
        }
        if (operacion.equalsIgnoreCase("*")) {
            resultado = numero1 * numero2;
        }
        if (operacion.equalsIgnoreCase("/")) {
            resultado = numero1 / numero2;
        }
        if (operacion.equalsIgnoreCase("%")) {
            resultado = numero1 % numero2;
        }

        System.out.println("El valor concluyente es " + resultado);

        System.out.println(" Realizaremos la comparación de los 2 valores ");
        if (numero1 > numero2) {
            System.out.println(numero1 + " Es mayor que " + numero2);
        }

        if (numero1 < numero2) {
            System.out.println(numero2 + " Es mayor que " + numero1);
        }

        if (numero1 == numero2) {
            System.out.println(numero1 + " y " + numero2 + " Son iguales");
        }

        if (resultado % 2 == 0) {
            System.out.println("El resultado es par");
        } else {
            System.out.println("El resultado " + resultado + " es impar");
        }
    }
}
