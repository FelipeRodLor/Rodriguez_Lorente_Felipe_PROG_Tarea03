/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

import utilidades.Entrada;

/**
 *
 * @author Felipillo
 */
public class Principal {

    public static void main(String[] args) {

        Rey rey;
        int menu;
        int color;
        int movimiento;
        

        System.out.println("¿De que color quieres el Rey? Introduzca 1 para el BLANCO o 2 para el NEGRO");
        color = Entrada.entero();
        while (color != 1 && color != 2) {
            System.out.println("Has introducido un numero incorrecto. Introduce 1 para el color BLANCO o 2 para el color NEGRO");
            color = Entrada.entero();
        }

        if ((color) == 1) {
            rey = new Rey(Color.BLANCO);
        } else {
            rey = new Rey(Color.NEGRO);

        }
        do{

        System.out.println("¿Que quieres hacer con el rey? 1-Moverlo  2-Informacion sobre el rey 3-Salir del programa");
        menu = Entrada.entero();
        while ((menu < 1) && (menu > 3)) {
            System.out.println("Has introducido una opcion incorrecta. Introduce 1-Moverlo  2-Informacion sobre su posicion  3-Salir del programa");
            menu = Entrada.caracter();
        }

        
            switch (menu) {
                case 1:

                    do {
                        System.out.println("Introduce 1 para moverlo una posicion hacia el Norte");
                        System.out.println("Introduce 2 para moverlo una posicion hacia el sur");
                        System.out.println("Introduce 3 para moverlo una posicion hacia el Oeste");
                        System.out.println("Introduce 4 para moverlo una posicion hacia la Este");
                        System.out.println("Introduce 5 para moverlo hacia el Noroeste");
                        System.out.println("Introduce 6 para moverlo hacia el Noreste");
                        System.out.println("Introduce 7 para moverlo hacia el Suroeste");
                        System.out.println("Introduce 8 para moverlo hacia el Sureste");
                        System.out.println("Introduce un 9 para volver al menu");
                        movimiento = Entrada.entero();
                    } while (menu < 1 && menu > 9);

                    switch (movimiento) {
                        case 1:
                            rey.mueve(Direccion.NORTE);
                            break;
                        case 2:
                            rey.mueve(Direccion.SUR);
                            break;
                        case 3:
                            rey.mueve(Direccion.OESTE);
                            break;
                        case 4:
                            rey.mueve(Direccion.ESTE);
                            break;
                        case 5:
                            rey.mueve(Direccion.NOROESTE);
                            break;
                        case 6:
                            rey.mueve(Direccion.NORESTE);
                            break;
                        case 7:
                            rey.mueve(Direccion.SURESTE);
                            break;
                        case 8:
                            rey.mueve(Direccion.SUROESTE);
                        case 9:
                          
                            break;

                    }
                    while (movimiento != 9) {
                        break;
                    }
                    break;

                case 2:
                    System.out.println(rey.toString());
                    break;
                case 3:
                    System.out.println("Has abandonado correctamente");
                    break;

            }

        } while (menu != 3);
    }
}
