package mx.unam;

import java.util.Scanner;

public class Gato {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena:");
        String cadena = teclado.nextLine();
        char[] digito = cadena.toCharArray();

        if (digito.length == 9) {
            for (int i = 1; i < 4; i++) {

                if (i == 1 || i == 3) {
                    System.out.print("-------");
                    System.out.println(" ");
                }
                if (i == 2) {

                    System.out.println("|" + digito[0] + "|" + digito[1] + "|" + digito[2] + "|\n|" + digito[3] + "|" + digito[4] + "|"
                            + digito[5] + "|\n|" + digito[6] + "|" + digito[7] + "|" + digito[8] + "|");

                }

            }

        }else{
            System.out.println("Introduce 9 digitos");
        }
    }
}
