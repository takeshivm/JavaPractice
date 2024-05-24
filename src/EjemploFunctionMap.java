import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EjemploFunctionMap {

    /*
    * Claro, veamos un ejemplo práctico utilizando la interfaz Function y el operador map en un Stream.
    *  Supongamos que tenemos una lista de números y queremos duplicar cada número utilizando la función Function.
    * */
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Definir la función que duplica un número
    private Function<Integer, Integer> duplicarNumero = num -> num * 2;

    // Usar el operador map para aplicar la función a cada elemento del Stream
    private List<Integer> numerosDuplicados = numeros.stream()
            .map(duplicarNumero)
            .collect(Collectors.toList());

    public List<Integer> getNumeros() {
        return numeros;
    }

    public List<Integer> getNumerosDuplicados() {
        return numerosDuplicados;
    }

    // Imprimir el resultado

//    System.out.println("Números originales: " + getNumeros);
//    System.out.println("Números duplicados: " + numerosDuplicados);

}
