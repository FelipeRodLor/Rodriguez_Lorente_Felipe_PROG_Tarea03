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
}
