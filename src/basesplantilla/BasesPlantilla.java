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

        for (int k = 1; k < filas; filas++) {

            datos = new String[columnas];

            for (int i = 0; i < datos.length; i++) {

                datos[i] = sc.nextLine();

            }

            System.out.println(tablasYdatos(nombreTabla, datos));

        }

    }

    public static String tablasYdatos(String nombreTabla, String[] datos) {

        String inicio = "INSERT INTO " + nombreTabla + " VALUES ('";
        String separador = "','";
        String fin = ");";

        for (int i = 0; i < datos.length; i++) {

            inicio = inicio + datos[i] + separador;

        }

        inicio = inicio.substring(0, inicio.length() - 2);

        return inicio + fin;

    }

}
