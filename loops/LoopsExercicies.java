package loops;

public class LoopsExercicies {
    public static void main(String[] args) {
        
        /* imprime los numeros del 1 al 10 usando while */
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        /* usa do-while y imprime un arraylist */
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        int j = 0;
        do {
            System.out.println(names[j]);
            j++;
        } while (j < names.length);
        /* imprime los multiplos de 5 del 1 al 100 usando for */
        for (int k = 5; k <= 100; k += 5) {
            System.out.println(k);
        }
          /*usa for-each para recorrer un hashset */
        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        for (String fruit : set) {
            System.out.println(fruit);
        }
        /* usa continue para saltar miltiplos de 10 */
        for (int l = 1; l <= 100; l++) {
            if (l % 10 == 0) {
                continue;
            }
            System.out.println(l);
        }
    }
}
