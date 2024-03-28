public class OperacionMatematica {
    /**
     * Método que realiza una operación matemática con los números ingresados
     * @param primerNumero  primer número para realizar la operación
     * @param segundoNumero segundo número para realizar la operación
     * @param tercerNumero  tercer número para realizar la operación
     * @param cuartoNumero  cuarto número para realizar la operación
     * @return retorna el resultado de la operación matemática
     */
    public static double calcularResultado(double primerNumero, double segundoNumero, double tercerNumero, double cuartoNumero) {
        double resultado;
        resultado = ((primerNumero + segundoNumero) * (tercerNumero - cuartoNumero)) / (primerNumero * cuartoNumero);
        return resultado;
    }
}
