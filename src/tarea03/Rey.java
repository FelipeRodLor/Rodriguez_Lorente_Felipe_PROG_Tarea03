/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 *
 * @author Felipillo
 */
public class Rey {

    private Color color;
    private Posicion posicion;
    private Direccion direccion;

    public Rey(Color color) {
        switch (color) {
            case BLANCO:
                this.color = Color.BLANCO;
                this.posicion = new Posicion(1, 'e');
                break;
            case NEGRO:
                this.color = Color.NEGRO;
                this.posicion = new Posicion(8, 'e');
                break;

        }

    }

    public Rey() {
        color = Color.BLANCO;
    }

    public Color getColor() {
        return color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public String toString() {

        String representacion = color + " " + posicion;

        return representacion;
    }

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
