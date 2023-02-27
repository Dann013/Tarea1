package mx.unam;

import java.util.Scanner;

public class ASCII {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una cadena de caracteres:");
        String entrada = teclado.nextLine();

        System.out.printf("Tecleaste: %s%n", entrada);
        int[] almacenarVar = new int[entrada.length()];
        boolean V_o_F = true;

        for (int indice = 0; indice < entrada.length(); indice++) {

            System.out.printf("El simbolo %c corresponde al numero %d en codigo ASCII%n", entrada.charAt(indice), (int) entrada.charAt(indice));
            almacenarVar[indice] = (int) entrada.charAt(indice);
        }

        for (int indice = 0; indice < entrada.length() - 1; indice++) {

            if (almacenarVar[indice] + 1 == almacenarVar[indice + 1]) {
                V_o_F = true;
            } else {
                V_o_F = false;
                break;
            }
        }

        if (V_o_F == true) {
            System.out.printf("TRUE:La serie si es consecutiva! %n");
        } else {
            System.out.printf("FALSE:La cadena no es consecutiva! %n");
        }
    }

}
