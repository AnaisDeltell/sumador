package sumador;

/**
 * @author anais
 *
 */
public class ASumar {

	/**
	 * @param cad
	 * @return
	 */
	public String  sumativo(String cad) {
		String numero = cad; 
        if (numero.length() == 1) {
           return (numero + " = " + numero);       
	}
	return "No válido";


}
}

	
	
	