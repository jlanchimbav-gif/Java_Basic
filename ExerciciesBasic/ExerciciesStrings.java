package ExerciciesBasic;
public class ExerciciesStrings {
    public static void main(String[] args) {
        /*Ejercicio 1: Concatenación de cadenas */
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Nombre completo: " + fullName);

        /*Ejercicio 2: Longitud de una cadena */
        String text = "Hello, World!";
        int length = text.length();
        System.out.println("Longitud del texto: " + length);

        /*Ejercicio 3: Obtener un carácter específico */
        char charAt5 = text.charAt(5);
        System.out.println("Carácter en la posición 5: " + charAt5);

        /*Ejercicio 4: Subcadena */
        String subText = text.substring(0, 5);
        System.out.println("Subcadena (0-5): " + subText);

        /*Ejercicio 5: Mayúsculas y minúsculas */
        String upperText = text.toUpperCase();
        String lowerText = text.toLowerCase();
        System.out.println("Texto en mayúsculas: " + upperText);
        System.out.println("Texto en minúsculas: " + lowerText);

        /*Ejercicio 6: Comprobar si contiene una subcadena */
        boolean containsWorld = text.contains("World");
        System.out.println("¿El texto contiene 'World'? " + containsWorld);

        /*Ejercicio 7: Comparación de cadenas */
        boolean equalsHello = text.equals("Hello, World!");
        boolean equalsIgnoreCase = text.equalsIgnoreCase("hello, world!");
        System.out.println("¿El texto es igual a 'Hello, World!'? " + equalsHello);
        System.out.println("¿El texto es igual a 'hello, world!' (ignorando mayúsculas)? " + equalsIgnoreCase);

    }
}
