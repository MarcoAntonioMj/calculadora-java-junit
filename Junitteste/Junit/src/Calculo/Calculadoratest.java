package Calculo;

import org.junit.Test;
import static org.junit.Assert.*;

public class Calculadoratest {
  @Test
  public void testSoma() {
    Calculadora calculadora = new Calculadora(5, 5);
    double resultado = calculadora.soma();
    double esperado = 10;
    assertEquals(esperado, resultado, 0);
  }

  @Test
  public void testsubtracao() {
    Calculadora calculadora = new Calculadora(5, 5);
    double resultado = calculadora.subtracao();
    double esperado = 0;
    assertEquals(esperado, resultado, 0);

  }

  @Test
  public void testmultiplicacao() {
    Calculadora calculadora = new Calculadora(5, 5);
    double resultado = calculadora.multiplicacao();
    double esperado = 25;
    assertEquals(esperado, resultado, 0);

  }

  @Test
  public void testDivisao() {
    Calculadora calculadora = new Calculadora(10, 2);
    double resultado = calculadora.divisao();
    double esperado = 5;
    assertEquals(esperado, resultado, 0);
  }

  @Test
  public void testDivisaoPorZero() {
    Calculadora calculadora = new Calculadora(10, 0);
    double resultado = calculadora.divisao();
    double esperado = 0;
    assertEquals(esperado, resultado, 0);
  }

  @Test
  public void testPotenciacao() {
    Calculadora calculadora = new Calculadora(2, 3);
    double resultado = calculadora.potenciacao();
    double esperado = 8;
    assertEquals(esperado, resultado, 0);
  }

}
