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
                {
    static public String actualizarContacto(String telefono) {
        Scanner sr = new Scanner(System.in);
        int posicion = -1;
        for (int i = 0; i < 15; i++) {
            if (contactos[i] != null) {
            }
            if (contactos[i].verTelefono().equals(telefono)) {

                System.out.println("Ingrese Nuevo Nombre");
                String nombre = sr.nextLine();
                contactos[i].setNombre(nombre);
                System.out.println("Ingrese Nuevo Domicilio");
                String domicilio = sr.nextLine();
                contactos[i].setDomicilio(domicilio);
                posicion = i;
                break;
            }
        }
        if (posicion != -1) {
            return "Nombre: " + contactos[posicion];
        } else {
            return "Contacto no Encontrado";
        }
    }

    static public String verContacto(String numero) {
        int posicion = -1;
        for (int i = 0; i < 10; i++) {
            if (contactos[i] != null) {

            }
            if (contactos[i].verTelefono().equals(numero) && contactos != null) {
                posicion = i;
                break;
            }
        }
        if (posicion != -1) {
            return "Nombre: " + contactos[posicion].verNombre() + " Domicilio: " + contactos[posicion].verDomicilio();

        } else {
            return "Contacto no Encontrado";
        }
    }

    static public void guardarContacto() {
        if (num >= 15) {
            System.out.println("-------->La Memoria esta Llena<--------");
        } else {
            Scanner teclado = new Scanner(System.in);
            System.out.println("---------Nuevo Contacto----------");
            System.out.println("Ingrese el numero de Telefono de la Persona");
            String telefono = teclado.nextLine();
            System.out.println("Ingrese el Nombre de la Persona");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese el Domicilio de la Persona");
            String domicilio = teclado.nextLine();
            contactos[num] = new contacto(telefono, nombre, domicilio);
            System.out.println("------------------------------");
            System.out.println("Contacto Almacenado");
            System.out.println("------------------------------");
            num++;
        }
    }

    static public void verTodos() {
        for (int i = 0; i < num; i++) {
            System.out.println("Telefono: " + contactos[i].verTelefono());
            System.out.println("Nombre: " + contactos[i].verNombre());
            System.out.println("Domicilio: " + contactos[i].verDomicilio());
            System.out.println("##################################");
        }
    }

}
}
        }
    }
}