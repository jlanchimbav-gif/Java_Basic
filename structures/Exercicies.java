package structures;

public class Exercicies {
    public static void main(String[] args) {
        
        /* crea un array con 5 elemntos e imprime su longitud */
        int[] numbers = {1, 2, 3, 4, 5,6,7,8,9,10};
        System.out.println("Longitud del array: " + numbers.length);

        /* crea un arraylist con 5 elementos y luego elimina uno */
        java.util.ArrayList<Integer> numberList = new java.util.ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        System.out.println("Valores del arraylist: " + numberList);
        numberList.remove(2); // Elimina el elemento en el índice 2 (valor 3)
        System.out.println("Valores del arraylist después de eliminar un elemento: " + numberList);

            /* crea un hashmap con 3 pares clave-valor e imprime el valor de una clave específica */
        java.util.HashMap<String, String> map = new java.util.HashMap<>();
        map.put("clave1", "valor1");    
        map.put("clave2", "valor2");
        map.put("clave3", "valor3");
        System.out.println("Valor de clave2: " + map.get("clave2"));

        /*crea un hashset con 5 elementos e imprime su tamaño */
        java.util.HashSet<String> names = new java.util.HashSet<String>();
        names.add("Jorge");
        names.add("Alejandro");
        names.add("JaguarDev");
        names.add("lobo");
        System.out.println("Tamaño del hashset: " + names.size());

        /* dado un array, transformar a list y luego a maps u finalmente en un sets */
        String[] array = {"A", "B", "C", "D", "E"};
        java.util.List<String> list = java.util.Arrays.asList(array);
        java.util.Map<String, String> mapFromList = new java.util.HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            mapFromList.put("key" + i, list.get(i));
        }
        java.util.Set<String> setFromList = new java.util.HashSet<>(list);
        System.out.println("Valores del array: " + java.util.Arrays.toString(array));
        System.out.println("Valores de la lista: " + list);
        System.out.println("Valores del mapa: " + mapFromList);
        System.out.println("Valores del conjunto: " + setFromList);

    }
}
