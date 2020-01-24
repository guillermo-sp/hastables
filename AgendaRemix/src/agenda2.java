import java.util.Enumeration;
import java.util.Hashtable;

public class agenda2 {
    Hashtable<String, Persona> ListarPersonas = new Hashtable<>();

    public void AgregarPersona(Persona persona) {
        if (ListarPersonas.containsKey(persona.getDni())) {
            System.out.println("La persona ya existe");
        } else
            ListarPersonas.put(persona.getDni(), persona);
        System.out.println("Persona añadida correctamente");

    }

    public void borrarPersona(String dni) {
        if (ListarPersonas.containsKey(dni)) {
            ListarPersonas.remove(dni);
            System.out.println("Persona borrada correctamente");
        } else
            System.out.println("Persona no existente");
    }

    public void editarPersona(String dni) {
        if (ListarPersonas.containsKey(dni)) {
            Persona personaencontrada = ListarPersonas.get(dni);
            personaencontrada.setNombre("Nombre modificado");
            ListarPersonas.replace(personaencontrada.getDni(), personaencontrada);
            System.out.println("Persona editada correctamente ");
        } else
            System.out.println("Persona no existente");

    }

    public void buscarPersona(String dni) {
        if (ListarPersonas.containsKey(dni)) {
            Persona personaencontrada = ListarPersonas.get(dni);
            ListarPersonas.get(dni).ListarPersonas();
        } else
            System.out.println("Persona no existente");

    }

    public void listarPersonas() {
        Enumeration<Persona> personas = ListarPersonas.elements();
        while (personas.hasMoreElements()) {
            Persona personaEncontrada = personas.nextElement();
            personaEncontrada.ListarPersonas();
        }
    }
}
