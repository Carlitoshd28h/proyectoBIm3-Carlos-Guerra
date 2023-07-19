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
            if (op == 1) {
                guardarContacto();
            } else if (op == 2) {
                System.out.println("-----Los Datos de los Contactos son: -----");
                verTodos();
            } else if (op == 3) {
                System.out.println("-------Buscar Contacto-------");
                System.out.println("Ingrese el Numero de telefono: ");
                Scanner sd = new Scanner(System.in);
                String numero = sd.nextLine();
                System.out.println(vertodosloscontacto(numero));

            } else if (op == 4) {
                System.out.println("-------Actualizar Contacto-------");
                System.out.println("Ingrese el Numero de telefono: ");
                Scanner sd = new Scanner(System.in);
                String numero = sd.nextLine();
                System.out.println(ActualizarContacto(numero));
            } else if (op == 5) {
                System.out.println("Programa Finalizado");
            } else {
                System.out.println("OPCION INCORRECTA");
            }
        }
    }
}