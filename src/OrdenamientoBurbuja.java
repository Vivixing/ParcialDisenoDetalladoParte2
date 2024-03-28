public class OrdenamientoBurbuja {
    /**
     * Método que ordena un arreglo de números enteros de menor a mayor
     * @param arreglo arreglo de números enteros
     */
     public void burbuja(int[] arreglo) {
        for (int primerIndice = 0; primerIndice < arreglo.length; primerIndice++) {
            for (int segundoIndice = 0; segundoIndice < arreglo.length - 1; segundoIndice++) {
                int elementoActual = arreglo[segundoIndice],
                        elementoSiguiente = arreglo[segundoIndice + 1];
                if (elementoActual > elementoSiguiente) {
                    arreglo[segundoIndice] = elementoSiguiente;
                    arreglo[segundoIndice + 1] = elementoActual;
                }
            }
        }
    }

    /**
     * Método que ordena un arreglo de nombres de menor a mayor
     * @param arreglo arreglo de nombres
     */
    public void burbujas(String[] arreglo) {
        for (int primerIndice = 0; primerIndice < arreglo.length; primerIndice++) {
            for (int segundoIndice = 0; segundoIndice < arreglo.length - 1; segundoIndice++) {
                String elementoActual = arreglo[segundoIndice],
                        elementoSiguiente = arreglo[segundoIndice + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {
                    arreglo[segundoIndice] = elementoSiguiente;
                    arreglo[segundoIndice + 1] = elementoActual;
                }
            }
        }
    }
}
