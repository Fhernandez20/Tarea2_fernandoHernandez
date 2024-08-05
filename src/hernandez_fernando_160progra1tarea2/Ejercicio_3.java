/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hernandez_fernando_160progra1tarea2;

import java.util.Scanner;

/**
 *
 * @author fdhg0
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        while (true) {
            System.out.println("----MENU----");
            System.out.println("1-Palabra diagonal");
            System.out.println("2-Piramide de Numero");
            System.out.println("3-Lista Palindromo o no");
            System.out.println("4-Salir");
            System.out.println("");
            System.out.println("Ingrese la opcion deseada");
            int opcion = lea.nextInt();

            switch (opcion) {

                case 1:
                    String palabra1;
                    System.out.println("Favor ingrese una palabra: ");
                    palabra1 = lea.next().toUpperCase();

                    for (int contadorLetra = 0; contadorLetra < palabra1.length(); contadorLetra++) {

                        for (int contadorEspacio = 0; contadorEspacio < contadorLetra; contadorEspacio++) {
                            System.out.print(" ");
                        }

                        System.out.println(palabra1.charAt(contadorLetra));
                    }
                    for (int contadorLetraReversa = palabra1.length() - 1; contadorLetraReversa >= 0; contadorLetraReversa--) {

                        for (int contadorEspacio2 = 0; contadorEspacio2 < contadorLetraReversa; contadorEspacio2++) {
                            System.out.print(" ");
                        }

                        System.out.println(palabra1.charAt(contadorLetraReversa));
                    }
                    System.out.println(" ");
                    break;

                case 2:

                    System.out.println("Numero de Filas: ");
                    int numFilas = lea.nextInt();

                    for (int fila = numFilas; fila > 0; fila--) {
                        for (int espacio1 = 0; espacio1 <= numFilas -fila; espacio1++) {
                            System.out.print(" ");
                        }

                        for (int espacio2 = 1; espacio2 <= fila; espacio2++) {
                            System.out.print(fila + " ");
                        }
                        System.out.println();
                    }
                    break;
                    
                    

                case 3:

                    int numPalabra = 0;
                    int contadorCantPalabras = 0;
                    int contadorPalidromo;
                    String palabra;
                    String palabraReversa = "";
                    int contadorListaP = 0;
                    int contadorListaNP = 0;
                    String listaPalindromos = "";
                    String listaNPalindromos = "";
                    char letra;

                    System.out.println("Ingrese la cantidad de palabras: ");
                    int cantidadPalabras = lea.nextInt();

                    while (contadorCantPalabras < cantidadPalabras) {
                        numPalabra = numPalabra + 1;
                        System.out.println("ingrese la palabra " + numPalabra + ": ");
                        palabra = lea.next().toLowerCase();
                        contadorPalidromo = palabra.length() - 1;

                        while (contadorPalidromo >= 0) {
                            letra = palabra.charAt(contadorPalidromo);
                            palabraReversa += letra;
                            contadorPalidromo--;
                        }

                        if (palabraReversa.equals(palabra)) {
                            contadorListaP++;
                            listaPalindromos += contadorListaP + ": " + palabra + "\n";
                        } else {
                            contadorListaNP++;
                            listaNPalindromos += contadorListaNP + ": " + palabra + "\n";
                        }
                        palabraReversa = "";
                        contadorCantPalabras++;

                    }

                    System.out.println("---PALINDROMO---");
                    System.out.println(listaPalindromos);
                    System.out.println("---NO PALINDROMO---");
                    System.out.println(listaNPalindromos);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
