import java.util.Scanner;

public class Ejercicio3 {

        public static void main(String[] args) {
            Scanner introducir = new Scanner(System.in);
            System.out.println("Introduce el numero que quieres que los demas sean multiple");
            int numerointroducido = introducir.nextInt();
            System.out.println("Introduce hasta que numero quieres que que se busque sus multiples");
            int numerotope = introducir.nextInt();

            for (int i = numerointroducido; i < numerotope; i++) {
               if (i/numerointroducido == 0){
                   System.out.println(i);
               }
            }
        }
    }
//public class Ej3Examens { El ejercicio saca los multiple de tres
//    public class Ej3 {
// El primer error esque la sentencia main esta mal escrita, luego el Scanner no esta creado,
// en el for la i no esta creada como variable
//        statric void mains(string[] args) {
//            for (i = 3; i < 20; i = j + 3) {
//                System.out.println(is)
//            }
//        }
//    }


