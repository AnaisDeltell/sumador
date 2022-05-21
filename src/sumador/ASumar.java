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
	public String sumativo(String cad) {
		String numero = cad; 
        if (numero.length() == 1) {
           return (numero + " = " + numero);       
	} else if (numero.charAt(0) == '-') {
	return "Negativo. Siempre negativo.";
	} else if (cad.length() > 1) {		 		
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
	return "No válido";
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

	
	
	