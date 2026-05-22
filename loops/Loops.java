package loops;

public class Loops {
    public static void main(String[] args) {
        /* for */ 
        for(int i = 0; i < 5; i++) {
            System.out.println("Hola mundo");
        }
        String[] nombres = {"Jorge", "Alejandro", "Jaguardev"};
        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        } 
        /* for each */
        for(String nombre : nombres) {
            System.out.println(nombre);
        }
        java.util.HashSet<String> numberSet = new java.util.HashSet<>();
        numberSet.add("Uno");
        numberSet.add("Dos");
        numberSet.add("Tres");
        numberSet.add("Cuatro");
        for(String number : numberSet) {
            System.out.println(number);
        }
        java.util.HashMap<String, String> countriesMap = new java.util.HashMap<>();
        countriesMap.put("1", "Ecuador");
        countriesMap.put("2", "Rusia");
        countriesMap.put("3", "Colombia");
        countriesMap.put("4", "Venezuela");
        for(java.util.Map.Entry<String, String> entry : countriesMap.entrySet()) {
            System.out.println(entry.getValue());
        }
        /* while */
        int i = 0;
        while(i < 5) {
            System.out.println("Hola mundo");
            i++;
        }
            /* do while */
        int j = 0;
        do {
            System.out.println("Hola mundo");
            j++;
        } while(j < 5);
    }
    /* control de bucles */
    /* break y continue */
    public static void controlDeBucles() {
        int i = 0;
        while(i < 5) {
            System.out.println("Hola mundo");
            i++;
            if(i == 3) {
                break; // rompe el bucle
            }
        }
        
        for(int j = 0; j < 5; j++) {
            if(j == 2) {
                continue; // salta a la siguiente iteración
            }
            System.out.println(j);
        }
    }
}

