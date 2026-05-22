package ExerciciesBasic;
public class OperatorsExercicies {
    
    public static void main(String[] args) {
        /*crea una variable con cada operacion aritmetica */
        int a = 10;
        int b = 5;
        int sum = a + b;
        int rest = a - b;
        int mult = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Rest: " + rest);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
        /*Asignación */
        a = b;
        System.out.println("Asignación: " + a);
        a += b;
        System.out.println("Asignación con suma: " + a);
        a -= b;
        System.out.println("Asignación con resta: " + a);
        a *= b;
        System.out.println("Asignación con multiplicación: " + a);
        a /= b;
        System.out.println("Asignación con división: " + a);
        /* imprime 3 comparaciones verdaderas y 3 falsas */
        boolean comp1 = a > b;
        boolean comp2 = a < b;
        boolean comp3 = a == b;
        System.out.println("Comparación 1 (a > b): " + comp1);
        System.out.println("Comparación 2 (a < b): " + comp2);
        System.out.println("Comparación 3 (a == b): " + comp3);
        /*imprime utilizando operador logico and */
        boolean comp4 = a > b && a < 20;
        System.out.println("Comparación 4 (a > b && a < 20): " + comp4);
        /*imprime utilizando operador logico or */
        boolean comp5 = a > b || a < 20;
        System.out.println("Comparación 5 (a > b || a < 20): " + comp5);
        /*imprime utilizando operador logico not */
        boolean comp6 = !(a == b);
        System.out.println("Comparación 6 (!(a == b)): " + comp6);
        /*imprime 1 ejercicio conbinando los operadores */
        boolean comp7 = (a > b) && (a < 20) || (a == b);
        System.out.println("Comparación 7 ((a > b) && (a < 20) || (a == b)): " + comp7);
        /* verificar si un número es primo o no */
        int num = 17;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("El número " + num + " es primo: " + isPrime);

}
}

