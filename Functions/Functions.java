package Functions;

public class Functions {
    public static void main(String[] args) {
        /* funcion sin parametros y sin retorno */
        printMessage();
        printMessage2();
        
    }

    public static void printMessage() {
        System.out.println("Hello, World!");
        /*funcion con parametros y sin retorno */
        printSum(5, 10);
        /* funcion con parametros y con retorno */
        int result = getSum(5, 10);
        System.out.println("The sum is: " + result);
    }

    public static void printMessage2() {
        System.out.println("Hello, World! (from printMessage2)");
    }

    public static void printSum(int a, int b) {
        System.out.println("The sum is: " + (a + b));
    }

    public static int getSum(int a, int b) {
        return a + b;

    }
}