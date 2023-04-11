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
}
