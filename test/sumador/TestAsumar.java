package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAsumar {

	 @Test
	    public void testUnaCifra() {
	        ASumar sumi = new ASumar();
	        String resultado = sumi.sumativo("5");
	        assertEquals("5 = 5",resultado );
	    }
	 
	 @Test
	    public void testNegativo() {
	        ASumar sumi = new ASumar();
	        String resultado = sumi.sumativo("-5");
	        assertEquals("Negativo. Siempre negativo.",resultado );
	    }
	 @Test
	    public void testMasCifras() {
	        ASumar sumi = new ASumar();
	        String resultado = sumi.sumativo("123");
	        assertEquals("1 + 2 + 3 = 6",resultado );
	    }

}
