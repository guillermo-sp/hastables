import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Agenda {
    static Scanner teclado = new Scanner(System.in);
    static int opcion = 0;

   //wenas
    //cao
    public static void main(String[] args) {
        agenda2 listaAgenda = new agenda2();
        do {

            System.out.println("Que es lo que necesitas hacer con la agenda ? ");
            System.out.println("--------------------------------------------- ");
            System.out.println("1.Agregar una persona a la agenda");
            System.out.println("2.Borrar una persona mediante DNI");
            System.out.println("3.Editar persona mediante DNI");
            System.out.println("4.Buscar persona mediante DNI ");
            System.out.println("5.Listar agenda");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    String nombre = teclado.next();
                    String DNI = teclado.next();
                    int telefono = teclado.nextInt();
                    Persona persona = new Persona(nombre, DNI, telefono);
                    //AgregarPersona(persona);
                    listaAgenda.AgregarPersona(persona);

                    break;
                case 2:
                    String dniBorrar = teclado.next();
                    // borrarPersona(dniBorrar);
                    listaAgenda.borrarPersona(dniBorrar);

                    break;
                case 3:
                    String dnieditar = teclado.next();
                    //editarPersona(dnieditar);
                    listaAgenda.editarPersona(dnieditar);
                    break;
                case 4:
                    String dniBuscar = teclado.next();
                    //buscarPersona(dniBuscar);
                    listaAgenda.buscarPersona(dniBuscar);

                    break;
                case 5:
                    //listarPersonas();
                    listaAgenda.listarPersonas();

                    break;
                default:

                    break;
            }

        } while (opcion > 0 && opcion <= 5);
    }


}
