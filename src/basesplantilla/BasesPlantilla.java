/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basesplantilla;

import java.util.Scanner;

public class BasesPlantilla {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] datos;
        String nombreTabla = "";
        int columnas = 0;
        int filas = 0;

        System.out.print("Nombre tabla: ");
        nombreTabla = sc.nextLine();

        System.out.print("Cantidad columnas: ");
        columnas = sc.nextInt();

        System.out.print("Cantidad filas: ");
        filas = sc.nextInt();
        sc.nextLine();

        System.out.println("Inserte datos en orden: ");

        try {
            for (int k = 1; k <= filas; k++) {

                datos = new String[columnas];

                for (int i = 0; i < datos.length; i++) {

                    datos[i] = sc.nextLine();

                }

                System.out.println(tablasYdatos(nombreTabla, datos));

            }
        } catch (NullPointerException e1) {

            System.out.println("ERROR. Ingrese datos correctos");

        } catch (IllegalArgumentException e2) {

            System.out.println("ERROR. La tabla debe tener almenos una columna");

        }

    }

    public static String tablasYdatos(String nombreTabla, String[] datos) throws NullPointerException {

        String inicio = "INSERT INTO " + nombreTabla + " VALUES (";
        String separador = "',";
        String separador2 = ",";
        String fin = ");";
        int caracter = 0;

        if (datos.length == 0) {

            throw new IllegalArgumentException();

        } else {

            for (int i = 0; i < datos.length; i++) {

                while ((caracter < datos[i].length()) && (Character.isDigit(datos[i].charAt(caracter)))) {
                    caracter++;
                }
                if (caracter < datos[i].length()) {

                    inicio = inicio + "'" + datos[i] + separador;

                } else {

                    inicio = inicio + datos[i] + separador2;

                }

                caracter = 0;

            }

            inicio = inicio.substring(0, inicio.length() - 1);

            return inicio + fin;

        }
    }

}
