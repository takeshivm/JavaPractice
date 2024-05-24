//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Ejemplo práctico utilizando la interfaz Function y el operador map en un Stream
        EjemploFunctionMap ejemplo = new EjemploFunctionMap();

        System.out.println("Números originales: " + ejemplo.getNumeros());
        System.out.println("Números duplicados: " + ejemplo.getNumerosDuplicados());

        // Ejemplo de stream api vs forma tradicional

        StreamApi stream = new StreamApi();
        System.out.println(" --------- ENFOQUE TRADICIONAL ----------");
        stream.EnfoqueTradicional();

        System.out.println(" --------- API STREAM ----------");
        stream.StreamAPIEjemplo();



    }
}