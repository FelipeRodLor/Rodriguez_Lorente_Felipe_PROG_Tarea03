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

        String representacion = color + " " + posicion.getFila() + posicion.getColumna();

        return representacion;
    }

    /**
     * Metodo para ir actualizando la posicion que va tomando el Rey segun la
     * direccion. Se valida que el rey no se salga del tablero, en dicho caso se
     * le informa al usuario.
     *
     * @param direccion
     */
    public void mueve(Direccion direccion) {

        int fila = posicion.getFila();
        int columna = posicion.getColumna();

        switch (direccion) {

            case SUR:
                if (fila < 8) {
                    fila = fila + 1;
                    posicion.setFila(fila);

                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case NORTE:
                if (fila > 1) {
                    fila = fila - 1;
                    posicion.setFila(fila);

                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case ESTE:
                if (columna < 72) {
                    columna = columna + 1;
                    posicion.setColumna((char) columna);
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }

                break;

            case OESTE:
                if (columna > 65) {
                    columna = columna - 1;
                    posicion.setColumna((char) columna);
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case NORESTE:
                if ((columna < 72) && (fila > 1)) {
                    fila = fila - 1;
                    columna = columna + 1;
                    posicion.setColumna((char) columna);
                    posicion.setFila(fila);
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case SURESTE:
                if ((columna < 72) && (fila < 8)) {
                    fila = fila + 1;
                    columna = columna + 1;
                    posicion.setColumna((char) columna);
                    posicion.setFila(fila);
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case SUROESTE:
                if ((columna > 65) && (fila < 8)) {
                    fila = fila + 1;
                    columna = columna - 1;
                    posicion.setColumna((char) columna);
                    posicion.setFila(fila);
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

            case NOROESTE:
                if ((columna < 72) && (fila > 1)) {
                    fila = fila - 1;
                    columna = columna - 1;
                    posicion.setColumna((char) columna);
                    posicion.setFila(fila);
                } else {
                    System.out.println("Movimiento incorrecto, el rey se sale del tablero");
                }
                break;

        }

    }
}
