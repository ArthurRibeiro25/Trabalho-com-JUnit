package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        int a = 0;
        int b = 0;

        do{
            System.out.println("Digite a opção desejada: \n1- Somar\n2- Subtrair\n3- Multiplicar\n4- Dividir\n0 - Sair");
            option = scanner.nextInt();

            if(option != 0){
                System.out.println("Informe o primeiro número: ");
                a = scanner.nextInt();
                System.out.println("Informe o segundo número: ");
                b = scanner.nextInt();
            }


            switch (option) {
                case 1:
                    System.out.println("Resultado da soma: " + somar(a, b));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + subtrair(a, b));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + multiplicar(a, b));
                    break;
                case 4:
                    System.out.println("Resultado da divisão: " + dividir(a, b));
                    break;
                case 0:
                    System.out.println("Encerrando!");
                    break;
                default:
                    System.out.println("A opção informada não existe!");
                    break;
            }
        }while(option != 0);
    }


    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static float dividir(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Divisão por 0 não é permitido!");
        }
        return (float) a / b;
    }
}

