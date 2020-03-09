/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planocartesiano;

/**
 *
 * @author Armando
 */
public class Punto {
    private int x;
    private int y;
    private String nombre;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double distancia(Punto p2) {
        return Math.sqrt((Math.pow(p2.getX() - this.getX(), 2)) + (Math.pow(p2.getY() - this.getY(), 2)));
    }
}
