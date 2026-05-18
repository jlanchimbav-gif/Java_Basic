package structures;

public class sets {
    public static void main(String[] args) {
        /* Declaracion y creacion*/
        java.util.HashSet<String> names = new java.util.HashSet<String>();
        /* tamaño*/ 
        System.out.println(names.size());
        /* agregar elementos */
        names.add("Jorge");
        names.add("Alejandro");
        names.add("JaguarDev");
        names.add("lobo");
        /* tamaño después de agregar elementos */
        System.out.println(names.size());
        /* acceder a elementos */
        // Note: Sets do not support indexed access like lists do
        /* modificar un elemento */
        // Note: Sets do not support direct modification of elements

    }
}
