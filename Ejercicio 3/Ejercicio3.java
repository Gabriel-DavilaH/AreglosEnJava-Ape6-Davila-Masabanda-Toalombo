import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] datos = {14, 7, 25, 3, 18};

        int[] copia = Arrays.copyOf(datos, datos.length); // copia real
        Arrays.sort(copia); // se ordena solo la copia

        System.out.println("Original: " + Arrays.toString(datos));
        System.out.println("Copia ordenada: " + Arrays.toString(copia));

        int segundoMayor = copia[copia.length - 2];
        System.out.println("Segundo número mayor: " + segundoMayor);

        int pos = Arrays.binarySearch(copia, 14);
        System.out.println("Posición del 14 en la copia: " + pos);
    }
}
