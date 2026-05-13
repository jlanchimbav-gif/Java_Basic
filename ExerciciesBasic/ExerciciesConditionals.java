package ExerciciesBasic;
public class ExerciciesConditionals {
    public static void main(String[] args) {
       
        /*verificar si uns persona puede votar */
        int age = 18;
        if (age >= 18) {
            System.out.println("La persona puede votar.");
        } else if (age == 17) {
            System.out.println("La persona puede votar en un año.");
        }
        else {
            System.out.println("La persona no puede votar.");
        }

        /* verificar si un número es positivo, negativo o cero */
        int number = 5;
        if (number > 0) {
            System.out.println("El número es positivo.");
        } else if (number < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        /* verificar si un numero esta dentro de un rango */
        int value = 15;
        if (value >= 10 && value <= 20) {
            System.out.println("El número está dentro del rango.");
        } else {
            System.out.println("El número no está dentro del rango.");
        }

        /* verificar un sistema de calificaciones aprobado,reprobado o sobresaliente */
        int grade = 85;
        if (grade >= 70 && grade < 85) {
            System.out.println("La calificación es aprobada.");
        } else if (grade >= 85) {
            System.out.println("La calificación es sobresaliente.");
        } else {
            System.out.println("La calificación es reprobada.");
        }
        
    }
}
