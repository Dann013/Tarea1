package mx.unam;

import java.util.Scanner;

public class string {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nombre, profesion y pais de origen");
        String entrada = teclado.nextLine();

        String[] separacion = entrada.toUpperCase().split(" ");

        System.out.println("NOMBRE: " + separacion[0] + "\nPROFESION: " + separacion[1] + "\nPAIS:" + separacion[2]);

    }

}
