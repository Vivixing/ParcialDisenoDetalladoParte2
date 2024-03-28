import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        OrdenamientoBurbuja ordenamientoBurbuja = new OrdenamientoBurbuja();
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Ingrese la opción que desea escoger");
			System.out.println("1. Método burbuja para los números");
			System.out.println("2. Método burbuja para los nombres");
			System.out.println("3. Saber si un número es primo");
			System.out.println("4. Método calular resultado de una operación de números");
			System.out.println("Seleccione su opción 1, 2, 3 o 4: ");
            int opcion = scanner.nextInt();
            switch(opcion) {
                case 1:
                    int[] numeros= {1, 9, 23, 4, 55, 100, 1, 1, 23};
                    System.out.println("Antes del método de la burbuja: " + Arrays.toString(numeros));
                    ordenamientoBurbuja.burbuja(numeros);
                    System.out.println("Después del método de la burbuja: " + Arrays.toString(numeros));
                    break;
                case 2:
                    String[] nombres = {"Leon", "Chris", "Jill", "Wesker", "Ada"};
                    System.out.println("Antes del método de la burbuja: " + Arrays.toString(nombres));
                    ordenamientoBurbuja.burbujas(nombres);
                    System.out.println("Después del método de la burbuja: " + Arrays.toString(nombres));
                    break;
                case 3:
                    System.out.println("Ingrese el numero para saber si es primo o no:" );
                    int numero = scanner.nextInt();
                    boolean esPrimo = ValidarNumeroPrimo.esPrimo(numero);
                    System.out.println(esPrimo);
                    break;
                case 4:
                    System.out.println("Ingrese los 4 numeros para realizar la operación:" );
                    System.out.println("Primer número: ");
                    double primerNumero = scanner.nextDouble();
                    System.out.println("Segundo número: ");
                    double segundoNumero = scanner.nextDouble();
                    System.out.println("Tercer número: ");
                    double tercerNumero = scanner.nextDouble();
                    System.out.println("Cuarto número: ");
                    double cuartoNumero = scanner.nextDouble();
                    double resultado = OperacionMatematica.calcularResultado(primerNumero, segundoNumero, tercerNumero, cuartoNumero);
                    System.out.println("El resultado de la operación es: " + resultado);
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;    
                default:
                    System.out.println("Opción no válida");
                    break;
            }             
        }while(scanner.hasNextLine());
        scanner.close(); 
    }
}
