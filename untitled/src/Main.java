public class Main {
    /**
     * @param device --> operación a realizar (SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN)
     * @param num1 --> primer numero de la operación
     * @param num2 --> segundo numero de la operación (divisor en caso de division)
     * @return resultado o null en caso de fallo.
     */
    public static void main(String[] args) {

        Operaciones metodos = new Operaciones();
        float num1 = 20;
        float num2 = 10;
        Float resultado = metodos.calculadora(Operaciones.SUMA, num1, num2);

        System.out.println("El resultado de la suma es: " + resultado);

    }
}