import Calculo.Calculadora;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2;
        int opcao;
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> historico = new ArrayList<>();

        do {
            System.out.println("======CALCULADORA======");
            System.out.println("Digite a opção:");
            System.out.println("1: SOMA");
            System.out.println("2: SUBTRAIR");
            System.out.println("3: MULTIPLICAR");
            System.out.println("4: DIVIDIR");
            System.out.println("5: POTENCIAR");
            System.out.println("6: HISTORICO");
            System.out.println("7: SAIR");
            System.out.println("=======================");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("======SOMA======");
                    System.out.print("Escolha o 1º número que deseja calcular : ");
                    n1 = sc.nextDouble();
                    System.out.print("Escolha o 2º número que deseja calcular : ");
                    n2 = sc.nextDouble();
                    Calculadora calculadora1 = new Calculadora(n1, n2);
                    System.out.println("O resultado da soma é: " + calculadora1.soma());
                    historico.add(n1 + " + " + n2 + " = " + calculadora1.soma());
                    break;
                case 2:
                    System.out.println("======SUBTRAÇÃO======");
                    System.out.print("Escolha o 1º número que deseja calcular : ");
                    n1 = sc.nextDouble();
                    System.out.print("Escolha o 2º número que deseja calcular : ");
                    n2 = sc.nextDouble();
                    Calculadora calculadora2 = new Calculadora(n1, n2);
                    System.out.println("O resultado da subtração é: " + calculadora2.subtracao());
                    historico.add(n1 + " - " + n2 + " = " + calculadora2.subtracao());

                    break;
                case 3:
                    System.out.println("======MULTIPLICAR======");
                    System.out.print("Escolha o 1º número que deseja calcular : ");
                    n1 = sc.nextDouble();
                    System.out.print("Escolha o 2º número que deseja calcular : ");
                    n2 = sc.nextDouble();
                    Calculadora calculadora3 = new Calculadora(n1, n2);
                    System.out.println("O resultado da multiplicação é: " + calculadora3.multiplicacao());
                    historico.add(n1 + " * " + n2 + " = " + calculadora3.multiplicacao());

                    break;
                case 4:
                    System.out.println("======DIVISÃO======");
                    System.out.print("Escolha o 1º número que deseja calcular : ");
                    n1 = sc.nextDouble();
                    System.out.print("Escolha o 2º número que deseja calcular : ");
                    n2 = sc.nextDouble();
                    Calculadora calculadora4 = new Calculadora(n1, n2);
                    historico.add(n1 + " /" + n2 + " = " + calculadora4.divisao());

                    double resultadoDivisao = calculadora4.divisao();
                    if (resultadoDivisao != 0) {
                        System.out.println("O resultado da divisão é: " + resultadoDivisao);
                    }
                    break;
                case 5:
                    System.out.println("======POTENCIAR======");
                    System.out.print("Escolha o 1º número que deseja calcular : ");
                    n1 = sc.nextDouble();
                    System.out.print("Escolha o 2º número que deseja calcular : ");
                    n2 = sc.nextDouble();
                    Calculadora calculadora5 = new Calculadora(n1, n2);
                    System.out.println("O resultado da potenciação é: " + calculadora5.potenciacao());
                    historico.add(n1 + " ^" + n2 + " = " + calculadora5.potenciacao());

                case 6:
                    System.out.println("======HISTÓRICO======");
                    if (historico.isEmpty()) {
                        System.out.println("Não há operações registradas no histórico ainda.");
                    } else {
                        System.out.println("Operações registradas no histórico:");
                        for (String item : historico) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 7:
                    System.out.println("======SAIR======");
                    continuar = false;
                    System.out.println("Fim do programa");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }

        } while (continuar);

        sc.close();

    }

}
