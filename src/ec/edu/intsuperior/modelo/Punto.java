/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Usuario
 */
public class Punto {
    private int x;
    private int y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distanciaDosPuntos(int x2, int x1, int y2, int y1){
        double d;
        
        double w=Math.pow((double)(x2-x1), 2);
        double z=Math.pow((double)(y2-y1), 2);
        d=Math.sqrt(w+z);
        return d;
        
    }
    public double distanciaAlCentro(int x2, int y2){
        return distanciaDosPuntos(x2,0, y2,0);
    }
     
}
