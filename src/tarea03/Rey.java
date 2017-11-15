/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 * Se crea la clase Rey con los atributos color de la clase Color y posicion de
 * la clase Posicion.
 *
 * @author Felipillo
 */
public class Rey {

    private Color color;
    private Posicion posicion;

    /**
     * Constructor que acepta como parametros los colores de la clase Color.
     *
     * @param color
     */
    public Rey(Color color) {
        switch (color) {
            case BLANCO:
                this.color = Color.BLANCO;
                this.posicion = new Posicion(1, 'E');
                break;
            case NEGRO:
                this.color = Color.NEGRO;
                this.posicion = new Posicion(8, 'E');
                break;

        }

    }

    /**
     * Cosntructor que crea por defecto un Rey de color blanco.
     */
    public Rey() {
        color = Color.BLANCO;
    }

    /**
     * Metodo que retorna el color.
     *
     * @return
     */
    public Color getColor() {
        return color;
    }

    /**
     * Metodo que retorna la posicion.
     *
     * @return
     */
    public Posicion getPosicion() {
        return posicion;
    }

    /**
     * Metodo que retorna la representacion de dicho objeto (color y posicion).
     *
     * @return
     */
    public String toString() {

        String representacion = color + " " + posicion;

        return representacion;
    }

    /**
     * Metodo para ir actualizando la posicion que va tomando el Rey segun la
     * direccion.
     *
     * @param direccion
     */

    public void mueve(Direccion direccion) {

        int fila = posicion.getFila();
        int columna = posicion.getColumna();

        switch (direccion) {

            case SUR:
                if ((columna >= 65 && columna <= 72) && (fila <= 8 && fila >= 1)) {
                    fila = posicion.getFila() + 1;
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case NORTE:
                if ((columna >= 65 && columna <= 72) && (fila <= 8 && fila >= 1)) {
                    fila = posicion.getFila() - 1;
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case ESTE:
                if ((columna >= 65 && columna <= 72) && (fila <= 8 && fila >= 1)) {
                    fila = posicion.getColumna() + 1;
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case OESTE:
                if ((columna >= 65 && columna <= 72) && (fila <= 8 && fila >= 1)) {
                    fila = posicion.getColumna() - 1;
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case NORESTE:
                if ((columna >= 65 && columna <= 72) && (fila <= 8 && fila >= 1)) {
                    fila = posicion.getFila() - 1;
                    columna = posicion.getColumna() + 1;
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case SURESTE:
                if ((columna >= 65 && columna <= 72) && (fila <= 8 && fila >= 1)) {
                    fila = posicion.getFila() + 1;
                    columna = posicion.getColumna() + 1;
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case SUROESTE:
                if ((columna >= 65 && columna <= 72) && (fila <= 8 && fila >= 1)) {
                    fila = posicion.getFila() + 1;
                    columna = posicion.getColumna() - 1;
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case NOROESTE:
                if ((columna >= 65 && columna <= 72) && (fila <= 8 && fila >= 1)) {
                    fila = posicion.getFila() - 1;
                    columna = posicion.getColumna() - 1;
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

        }

    }
}
