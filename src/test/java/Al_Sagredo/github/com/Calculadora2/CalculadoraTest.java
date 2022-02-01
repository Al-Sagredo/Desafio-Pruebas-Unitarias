package Al_Sagredo.github.com.Calculadora2;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
@DisplayName("TESTS")
public class CalculadoraTest 
{
    
    
    private static Logger logger = Logger.getLogger("Al-Sagredo.github.com.Calculadora2.CalculadoraTest");
    private final Calculadora calculadora = new Calculadora();
    
    @Test
    public void testSumar() {
    	logger.info("info test sumar");
    	Double actual = calculadora.sumar(1,2);
    	Assert.assertEquals(actual, 3,0);
    	
    }
    @Test
    public void testRestar() {
    	logger.info("info test restar");
    	Double actual = calculadora.sumar(1,2);
    	Assert.assertEquals(actual, 3,0);
    }
    
    @Test
    public void testMultiplicar() {
    	logger.info("info test multiplicar");
    	Double actual = calculadora.multiplicar(5,5);
    	Assert.assertEquals(actual, 25,0);
    }
    @Test
    public void testDividir() {
    	logger.info("info test dividir");
    	Double actual = calculadora.dividir(10, 0);
    	Assert.assertEquals(actual, 0,0);
    }
    

}


