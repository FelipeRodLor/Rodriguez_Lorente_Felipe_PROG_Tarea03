/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 *
 *
 * @author Felipillo
 */
public class Posicion {

    private int fila;
    private char columna;

    public Posicion(int fila, char columna) {

        if (fila <= 8 && fila >= 1) {
            this.fila = fila;
        } else {
            this.fila = 1;
            System.out.println("Fila incorrecta, se le ha asignado la fila 1 por defecto");

        }

        if (columna == 'a' || columna == 'b' || columna == 'd' || columna == 'e' || columna == 'f' || columna == 'g' || columna == 'h') {
            this.columna = columna;
        } else {
            this.columna = 'a';
            System.out.println("Columna incorrecta, se le ha asignado la columna a por defecto");
        }
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if (fila <= 8 && fila >= 1) {
            this.fila = fila;
        } else {
            this.fila = 1;
            System.out.println("Fila incorrecta, se le ha asignado la fila 1 por defecto");

        }
    }

    public char getColumna() {
        return columna;

    }

    public void setColumna(char columna) {
        if (columna == 'a' || columna == 'b' || columna == 'd' || columna == 'e' || columna == 'f' || columna == 'g' || columna == 'h') {
            this.columna = columna;
        } else {
            this.columna = 'a';
            System.out.println("Columna incorrecta, se le ha asignado la columna a por defecto");
        }
    }

    public String toString() {

        return Integer.toString(fila, columna);

    }

}
