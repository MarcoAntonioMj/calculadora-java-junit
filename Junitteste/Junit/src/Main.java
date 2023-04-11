import Calculo.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2;
        int opcao;
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("======CALCULADORA======");
            System.out.println("Digite a opção:");
            System.out.println("1: SOMA");
            System.out.println("2: SUBTRAIR");
            System.out.println("3: MULTIPLICAR");
            System.out.println("4: DIVIDIR");
            System.out.println("5: POTENCIAR");
            System.out.println("6: SAIR");
            System.out.println("=======================");
            opcao = sc.nextInt();
            System.out.print("Escolha o 1º número que deseja calcular : ");
            n1 = sc.nextDouble();
            System.out.print("Escolha o 2º número que deseja calcular : ");
            n2 = sc.nextDouble();
            Calculadora calculadora = new Calculadora(n1, n2);

            switch (opcao) {
                case 1:
                    System.out.println("======SOMA======");
                    System.out.println("O resultado da soma é: " + calculadora.soma());
                    break;
                case 2:
                    System.out.println("======SUBTRAÇÃO======");
                    System.out.println("O resultado da subtração é: " + calculadora.subtracao());
                    break;
                case 3:
                    System.out.println("======MULTIPLICAR======");
                    System.out.println("O resultado da multiplicação é: " + calculadora.multiplicacao());
                    break;
                case 4:
                    System.out.println("======DIVISÃO======");
                    double resultadoDivisao = calculadora.divisao();
                    if (resultadoDivisao != 0) {
                        System.out.println("O resultado da divisão é: " + resultadoDivisao);
                    }
                    break;
                case 5:
                    System.out.println("======POTENCIAR======");
                    System.out.println("O resultado da potenciação é: " + calculadora.potenciacao());
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Deseja fazer outra operação? 1 - sim, 2 - não");
            int escolha = sc.nextInt();
            if (escolha == 2) {
                continuar = false;
                System.out.println("Fim do programa");
            }

        } while (continuar);

        sc.close();

    }
}
