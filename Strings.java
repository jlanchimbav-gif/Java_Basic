public class Strings {
    public static void main(String[] args) {
        /*cadenas de texto */
        String nameString = "Jaguar dev";
        String str2 = "hola Mundo";
      
        /*operaciones con cadenas */
        /*concatenación */
        String str3 = nameString + " " + str2;
        System.out.println(str3);
        /*hallar la longitud de una cadena */
        int length = nameString.length();
        System.out.println("Longitud de nameString: " + length);
        /*obtener un carácter específico */
        char charAt = nameString.charAt(0);
        System.out.println("Carácter en la posición 0: " + charAt);
        /*Subcadena */
        String subString = nameString.substring(0, 5);
        System.out.println("Subcadena: " + subString);
        /*mayúsculas y minúsculas */
        String upperCase = nameString.toUpperCase();
        String lowerCase = nameString.toLowerCase();
        System.out.println("Mayúsculas: " + upperCase);
        System.out.println("Minúsculas: " + lowerCase);
        /*comprobar si contiene*/
        boolean contains = nameString.contains("dev");
        System.out.println("Contiene 'dev': " + contains);
        /* comparacion*/
        boolean equals = nameString.equals("Jaguar dev");
        System.out.println("Es igual a 'Jaguar dev': " + equals);
        System.out.println("Es igual a 'jaguar dev': " + nameString.equalsIgnoreCase("jaguar dev"));
        /* Trim y reemplazo */
        String trimmed = nameString.trim();
        System.out.println("Cadena sin espacios: " + trimmed);
        String replaced = nameString.replace("dev", "developer");
        System.out.println("Cadena reemplazada: " + replaced);
        /* format */
        int age = 26;
        String formatted = String.format("Mi nombre es %s y tengo %d años", nameString, age);
        System.out.println(formatted);

    }
}
