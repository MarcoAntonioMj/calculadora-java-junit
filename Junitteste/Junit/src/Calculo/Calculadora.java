package Calculo;

public class Calculadora {
  private double n1;
  private double n2;

  public Calculadora(double n1, double n2) {
    this.n1 = n1;
    this.n2 = n2;
  }

  public double soma() {
    return n1 + n2;
  }

  public double subtracao() {
    return n1 - n2;
  }

  public double multiplicacao() {
    return n1 * n2;
  }

  public double divisao() {
    if (n2 == 0) {
      System.out.println("Não é possível dividir por zero.");
      return 0;
    } else {
      return n1 / n2;
    }
  }

  public double potenciacao() {
    return Math.pow(n1, n2);

  }
}
