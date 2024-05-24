import Entity.Persona;

import java.util.Arrays;
import java.util.List;

public class StreamApi {

    public void EnfoqueTradicional (){
        List<Persona> personas = obtenerListaDePersonas();

        // Enfoque Tradicional
        for (Persona persona : personas) {
            if (persona.getEdad() > 25) {
                System.out.println(persona.getNombre());
            }
        }
    }
    public void StreamAPIEjemplo() {
        List<Persona> personas = obtenerListaDePersonas();

        // Stream API
        personas.stream()
                .filter(persona -> persona.getEdad() > 25)
                .map(Persona::getNombre)
                .forEach(System.out::println);
    }
    private static List<Persona> obtenerListaDePersonas() {
        // Lógica para obtener la lista de personas
        List<Persona> getPersonas = Arrays.asList(
                new Persona("Juan", 10),
                new Persona("María", 22),
                new Persona("Pedro", 28),
                new Persona("Ana", 15),
                new Persona("Carlos", 18),
                new Persona("Luisa", 27),
                new Persona("Miguel", 40),
                new Persona("Laura", 25),
                new Persona("Andrés", 32),
                new Persona("Sofía", 29)
        );
        return getPersonas;
        // ...
    }

}
