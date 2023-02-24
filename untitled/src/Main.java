/**
 * Clase principal que ejecuta una operación aritmética utilizando la clase Operaciones.
 */
public class Main {

    /**
     * Realiza una operación aritmética especificada y muestra el resultado por consola.
     * @param device el tipo de operación a realizar. Los valores permitidos son Operaciones.SUMA,
     *               Operaciones.RESTA, Operaciones.MULTIPLICACION y Operaciones.DIVISION.
     * @param num1 el primer número de la operación.
     * @param num2 el segundo número de la operación, en el caso de la división representa el divisor.
     * @return el resultado de la operación o null si ocurrió un error.
     */
    public static Float realizarOperacion(int device, float num1, float num2) {
        Operaciones operaciones = new Operaciones();
        return operaciones.calculadora(device, num1, num2);
    }

    /**
     * Método principal que ejecuta una operación de suma y muestra el resultado por consola.
     * @param args argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        float num1 = 20;
        float num2 = 10;
        Float resultado = realizarOperacion(Operaciones.SUMA, num1, num2);

        if (resultado != null) {
            System.out.println("El resultado de la suma es: " + resultado);
        } else {
            System.out.println("Ocurrió un error al realizar la operación.");
        }
    }
}
