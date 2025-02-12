package MathHelper.java;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathHelper Funcoes = new MathHelper();
        System.out.println("digite o primeiro valor:");
        double v1 = sc.nextDouble();
        System.out.println("digite o segundo valor:");
        double v2 = sc.nextDouble();
        System.out.println("digite o operador:");
        System.out.println("1-soma");
        System.out.println("2-subtração");
        System.out.println("3-multiplicação");
        System.out.println("4-divisão");
        System.out.println("5-média");
        System.out.println("6-próximo");
        System.out.println("7-nome");
        System.out.println("8-maior");
        System.out.println("0-sair");
        System.out.println("Escolhe uma das opções:");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 0:
                break;
            case 1:
                System.out.println(MathHelper.soma(v1, v2));
                break;
            case 2:
                System.out.println(MathHelper.subtracao(v1, v2));
                break;
            case 3:
                System.out.println(MathHelper.multiplicacao(v1, v2));
                break;
            case 4:
                System.out.println(MathHelper.divisao(v1, v2));
                break;
            case 5:
                System.out.println(MathHelper.media(v1, v2));
                break;
            case 6:
                System.out.println("escreve um numéro:");
                int numero = sc.nextInt();
                System.out.println(MathHelper.numeroSeguinte(numero));
                break;
            case 7:
                while(true) {
                    System.out.println("Qual é o seu nome:");
                    String nome = sc.nextLine();
                    System.out.println("Qual é o seu apelido:");
                    String apelido = sc.nextLine();
                    if(nome.matches("[a-zA-Z]+") && apelido.matches("[a-zA-Z]+")){
                        System.out.println(MathHelper.juntarNome(nome, apelido));
                        break;
                    }else {
                        System.out.println("erro volta a introduzir com minusculas e maiusculas");
                    }
                }
                break;
            case 8:
                System.out.println("Quantos numeros quer:");
                int numer = sc.nextInt();
                int[] numm = new int[numer];

                for(int i = 0; i < numer; ++i) {
                    System.out.println("Introduz um número:");
                    numm[i] = sc.nextInt();
                }

                System.out.println("O maior numero é " + MathHelper.maior(numm));
                break;
            default:
                System.out.println("valor falso");
        }

        while(op != 0) {
        }

    }
}