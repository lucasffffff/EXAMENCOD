/**

 Esta clase define varias operaciones matemáticas, como la suma, la resta, la multiplicación,

 la división, la raíz cuadrada, la raíz cúbica y la raíz de cualquier índice.
 */
public class Operaciones {

    private static Float resultado = null;
    static final int SUMA = 1;
    static final int RESTA = 2;
    static final int MULTIPLICACION = 3;
    static final int DIVISION = 4;
    static final int RAIZ_CUADRADA = 10;
    static final int RAIZ_CUBICA = 6;
    static final int RAIZ = 5;

/**

 Calcula el resultado de una operación matemática con dos números.
 @param device el tipo de operación a realizar (suma, resta, multiplicación, división,raíz cuadrada o raíz cúbica)
 @param num1 el primer número de la operación
 @param num2 el segundo número de la operación (divisor en caso de división o índice en caso de raíz)
 @return el resultado de la operación, o null en caso de fallo.
 */
public static Float calculadora(int device, float num1, float num2) {
    switch (device) {
        case SUMA:
            try {
                resultado = num1 + num2;
            } catch (Exception e) {
                System.out.println("Error");
            }
            break;
        case RESTA:
            try {
                resultado = num1 - num2;
            } catch (Exception e) {
                System.out.println("Error");
            }
            break;
        case MULTIPLICACION:
            try {
                resultado = num1 * num2;
            } catch (Exception e) {
                System.out.println("Error");
            }
            break;
        case DIVISION:
            try {
                resultado = num1 / num2;
            } catch (Exception e) {
                System.out.println("Error");
            }
            break;
        case RAIZ_CUADRADA:
            try {
                resultado = (float) Math.sqrt(num1);
            } catch (Exception e) {
                System.out.println("Error");
            }
            break;
        case RAIZ_CUBICA:
            try {
                resultado = (float) Math.cbrt(num1);
            } catch (Exception e) {
                System.out.println("Error");
            }
            break;
        case RAIZ:
            resultado = raiz(num1, num2);
            break;
    }
    return resultado;
}
    /**

     Calcula la raíz de cualquier índice de un número.
     @param num1 el radicando
     @param num2 el índice de la raíz
     @return el resultado de la raíz, o null en caso de fallo.
     */
    public static Float raiz(float num1, float num2) {
        try {
            resultado = (float) Math.pow(num1, 1 / num2);
        } catch (Exception e) {
            System.out.println("Error");
        }
        return resultado;
    }
}




