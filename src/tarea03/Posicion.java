/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 * Se crea la clase Posicion con un constructor y una serie de metodos.
 *
 * @author Felipillo
 */
public class Posicion {

    private int fila;
    private char columna;

    /**
     * Se crea el constructor que acepta como entrada fila y columna. Se valida
     * que el valor introducido esta en el rango. Si no esta dentro del rango se
     * le asigna el valor por defecto y se le informa de lo sucedido.
     *
     * @param fila
     * @param columna
     */
    public Posicion(int fila, char columna) {

        if (fila <= 8 && fila >= 1) {
            this.fila = fila;
        } else {
            this.fila = 1;
            System.out.println("Fila incorrecta, se le ha asignado la fila 1 por defecto");

        }

        if (columna >= 65 && columna <= 72) {
            this.columna = columna;
        } else {
            this.columna = 'a';
            System.out.println("Columna incorrecta, se le ha asignado la columna a por defecto");
        }
    }

    /**
     * Se crea el metodo getFila que devuelve el valor de la fila.
     *
     * @return
     */
    public int getFila() {
        return fila;
    }

    /**
     * Se cra el metodo setFila que recibe el valor de la fila. Se valida que
     * este dentro del rango, sino lo esta se le asigna la fila por defecto.
     *
     * @param fila
     */
    public void setFila(int fila) {
        if (fila <= 8 && fila >= 1) {
            this.fila = fila;
        } else {
            this.fila = 1;
            System.out.println("Fila incorrecta, se le ha asignado la fila 1 por defecto");

        }
    }

    /**
     * Se cra el metodo getColumna que devuelve el valor de la columna.
     *
     * @return
     */
    public char getColumna() {
        return columna;

    }

    /**
     * Se crea el metodo setColumna que recibe el valor de la columna. Se valida
     * que este dentro del rango, sino lo esta se le asigna la columna por
     * defecto.
     *
     * @param columna
     */
    public void setColumna(char columna) {

        if (columna >= 65 && columna <= 72) {
            this.columna = columna;
        } else {
            this.columna = 'a';
            System.out.println("Columna incorrecta, se le ha asignado la columna a por defecto");
        }
    }

    /**
     * Se crea el metodo toString que devuelve mediante un String la
     * representacion de la fila y la columna.
     *
     * @return
     */
    public String toString() {

        return Integer.toString(fila, columna);

    }

}
