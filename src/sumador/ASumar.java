package sumador;

/**
 * @author anais
 *
 */
public class ASumar {
	private static final String NO_VÁLIDO = "No válido";
	private static final String NEGATIVO = "Negativo. Siempre negativo.";
	/**
	 * @param cad
	 * @return
	 */
	public String sumativo(String cad) {
		String numero = cad; 
        if (numero.length() == 1) { //1 digito
           return (numero + " = " + numero);       
	} else if (numero.charAt(0) == '-') { //Numero negativo
	return NEGATIVO; 
	} else if (cad.length() > 1) { //Mas de 1 digito.		 		
		 numero = "";
			for (int i = 0; i < cad.length(); i++) {         
		            numero = numero + cad.substring(i,i+1);  
		            if (i < cad.length()-1) {
		            	numero = numero +" + ";
		            } else if (i == cad.length()-1) {
		            	numero = numero +" = ";
		            }
		        }		
			numero = numero + String.valueOf(total(cad));		
			return numero;
	}
	return NO_VÁLIDO;
}	
	/**
	 * @param valor_inicial
	 * @return
	 */
	public int total(String valor_inicial) {
        int suma = 0;
        for (int i = 0; i < valor_inicial.length(); i++) {   
            String digito = valor_inicial.substring(i,i+1);
            suma = suma + Integer.parseInt(digito);         
        }
        return suma;
    }			
}

	
	
	