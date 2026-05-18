package structures;

public class list {
    public static void main(String[] args) {
       /* creacion y declaracion */ 
       java.util.ArrayList<String> names = new java.util.ArrayList<String>();
         /* agregar elementos */
         names.add("Jorge");
            names.add("Alejandro");
               names.add("JaguarDev");
                names.add("lobo");
               /* acceder a elementos */
                System.out.println(names.getFirst());
                 System.out.println(names.getLast());
                 /* Eliminar elementos  */
                    names.remove("lobo");
                    /* buscar un  elementos */
                    System.out.println(names.contains("Jorge"));
                    /* limpiar la lista */
                    // names.clear();
                    /* buscar un elemento */
                    System.out.println(names.indexOf("Jorge"));

                    names.add("Jorge");    /* no permite duplicados */
                    names.add("Jorge");

                    var countries = new java.util.ArrayList<String>();
                    countries.add("Ecuador");
                    countries.add("Rusia");
                    countries.add("Estados Unidos");

                    names.addAll(countries); /* agregar todos los elementos de otra lista */
                    System.out.println(names);
                    


    }
}

