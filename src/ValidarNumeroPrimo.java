public class ValidarNumeroPrimo {
    /**
	 * Método que valida si un número es primo o no
     * @param primerNumero número que se desea saber si es primo o no
     * @return retorna true si el número es primo, de lo contrario retorna false
     */
    public static boolean esPrimo(int primerNumero){
        int ultimoNumero = 2;
		boolean validarSiEsPrimo = true;
		while ((validarSiEsPrimo) && (ultimoNumero != primerNumero)) {
			if (primerNumero % ultimoNumero == 0)
				validarSiEsPrimo = false;
			ultimoNumero++;
		}
		return validarSiEsPrimo;
    }
}
