import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {14, 7, 25, 3, 18, 7, 30};
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número a buscar: ");
        int buscado = sc.nextInt();

        int contador = 0;
        int posicion = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                contador++;
                if (posicion == -1) {
                    posicion = i; // solo la primera aparición
                }
            }
        }

        if (posicion == -1) {
            System.out.println("No existe");
        } else {
            System.out.println("El número " + buscado + " aparece " + contador + " vez/veces.");
            System.out.println("Primera posición: " + posicion);
        }
        sc.close();
    }
}
