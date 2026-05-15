package structures;

public class Arrays {
    public static void main(String[] args) {
    /* Un arreglo es una estructura de datos que almacena una colección de elementos del mismo tipo.
    }
    /* Declaracion y creacion de arreglos */
int[] numbers = new int[5]; // Arreglo de enteros con 5 elementos
     System.out.println(numbers[0]);
     
String[] names ={"Alejandro", "Jaguar", "JaguarDev"}; // Arreglo de cadenas con 3 elementos
     System.out.println(names[0]); // Imprime el primer elemento del arreglo

     /* acceso a elementos del arreglo */
     System.out.println(numbers[2]); // Imprime el tercer elemento del arreglo
     System.out.println(names[1]); // Imprime el segundo elemento del arreglo

        /* Modificacion de elementos del arreglo */

        numbers[0] = 10; // Asigna el valor 10 al primer elemento del arreglo
        names[1] = "Pantera"; // Asigna el valor "Pantera" al segundo elemento del arreglo
        System.out.println(numbers[0]); // Imprime el primer elemento del arreglo
        System.out.println(names[1]); // Imprime el segundo elemento del arreglo


}
}