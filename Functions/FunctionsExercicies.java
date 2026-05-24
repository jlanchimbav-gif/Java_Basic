package Functions;

public class FunctionsExercicies {
    public static void main(String[] args) {
    /* crea una funcion que imprima "bienvenido a java basic"*/
        printWelcomeMessage("bienvenido a java basic");
        System.out.println();
        /* crea un metodo que reciba 2 numeros enteros y los reste*/ 
        int result = subtractNumbers(10, 5);
        System.out.println("The difference is: " + result);
    }
    public static void printWelcomeMessage(String message) {
        System.out.println(message);
    }

    public static int subtractNumbers(int a, int b) {
        return a - b;
    }
    /* crea un metodo que calcule el cuadrado de un numero (n*m) */
    public static int calculateSquare(int n, int m) {
        return n * m;
    }
    /*crea un metodo que reciba un array y devuelva la media y la retorna*/
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return (double) sum / numbers.length;
    }
}