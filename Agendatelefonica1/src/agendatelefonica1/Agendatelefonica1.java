package agendatelefonica1;

import java.util.Scanner;

public class Agendatelefonica1 {

    static contacto contactos[] = new contacto[15];
    static int num = 0;

    public static void main(String[] args) {

        int op = 0;
        Scanner teclado = new Scanner(System.in);

        while (op != 5) {
            System.out.println("----------------------------------------------------");
            System.out.println("     Menu     ");
            System.out.println("1. Guardar contacto ");
            System.out.println("2. ver todos los contactos ");
            System.out.println("3. buscar un contacto ");
            System.out.println("4. Actualizar contacto ");
            System.out.println("5. salir ");
            System.out.println("-------------------------------------------------------");
            System.out.println("Ingrese el numero de opcion ");
            op = teclado.nextInt();
        }

    }

}
