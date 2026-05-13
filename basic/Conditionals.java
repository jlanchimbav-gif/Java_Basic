package basic;
public class Conditionals {
    public static void main(String[] args) {
        int age = 18;
        if (age > 18) {
            System.out.println("Mayor de edad.");
        } else if (age == 18) {
            System.out.println("Adolescente.");
        }
        else {
            System.out.println("Menor de edad.");
        }

        /*switch */
         int dayofWeek = 3;
         switch (dayofWeek) {
             case 1:
                 System.out.println("Lunes");
                 break;
             case 2:
                 System.out.println("Martes");
                 break;
             case 3:
                 System.out.println("Miércoles");
                 break;
             default:
                 System.out.println("Día no válido");

         }
    }
}


