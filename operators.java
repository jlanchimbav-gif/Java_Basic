public class operators {

    /* ejemplos simples con operadores de java */
    /* aritméticos */
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = a + b;
        System.out.println(sum);

        int rest = a - b;
        System.out.println(rest);

        int mult = a * b;
        System.out.println(mult);

        int div = a / b;
        System.out.println(div);

        int mod = a % b;
        System.out.println(mod);

        /*Asignación */

        a=b;
        System.out.println(a);
        a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);
        a*=b;
        System.out.println(a);
        a/=b;
        System.out.println(a);


/*Comparación */  
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        
 /*Lógicos */       
 /*y*/ 
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
         System.out.println(5<10 && 10>5);

    /*o*/
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
/*not*/
         System.out.println(!(5<10));

/*unario */
        int c = 5;
        c++;
        System.out.println(c);
        c--;
        System.out.println(c);
        c=-c;
        System.out.println(c);

 }
}      