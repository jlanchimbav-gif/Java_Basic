package structures;

public class maps {
    public static void main(String[] args) {
        /* Declaracion y creacion */
        java.util.HashMap<String, Integer> ages = new java.util.HashMap<String, Integer>();
        /* agregar elementos */
        ages.put("Jorge", 30);
        ages.put("Alejandro", 25);
        ages.put("JaguarDev", 28);
        ages.put("lobo", 35);
        /* acceder a elementos */
        System.out.println(ages.get("Jorge"));
        System.out.println(ages.get("Alejandro"));
        /* eliminar elementos */
        ages.remove("lobo");
        /* buscar un elemento */
        System.out.println(ages.containsKey("Jorge"));
        System.out.println(ages.containsValue(30));
        /* modificar un elemento */
        ages.put("Jorge", 31);
        System.out.println(ages.get("Jorge"));
        
    } 
}
