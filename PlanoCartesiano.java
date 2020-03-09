/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planocartesiano;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Armando
 */
public class PlanoCartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea los punto
        Punto p1 = new Punto(),
              p2 = new Punto(),
              p3 = new Punto(),
              p4 = new Punto();
        
        // Lista para almacenar las distancias
        ArrayList<Double> distancias = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList();

        p1.setNombre("Punto 1");
        p1.setX(0);
        p1.setY(0);
        p2.setNombre("Punto 2");
        p2.setX(0);
        p2.setY(0);
        p3.setNombre("Punto 3");
        p3.setX(1);
        p3.setY(1);
        p4.setNombre("Punto 4");
        p4.setX(0);
        p4.setY(0);
        
        double distancia = 0;
        distancia = p1.distancia(p2);
        if (distancia > 0) {
            distancias.add(distancia);
            nombres.add(p1.getNombre() + " y " + p2.getNombre());
        }
        distancia = p1.distancia(p3);
        if (distancia > 0) {
            distancias.add(distancia);
            nombres.add(p1.getNombre() + " y " + p3.getNombre());
        }
        distancia = p1.distancia(p4);
        if (distancia > 0) {
            distancias.add(distancia);
            nombres.add(p1.getNombre() + " y " + p4.getNombre());
        }
        distancia = p2.distancia(p3);
        if (distancia > 0) {
            distancias.add(distancia);
            nombres.add(p2.getNombre() + " y " + p3.getNombre());
        }
        distancia = p2.distancia(p4);
        if (distancia > 0) {
            distancias.add(distancia);
            nombres.add(p2.getNombre() + " y " + p4.getNombre());
        }
        distancia = p3.distancia(p4);
        if (distancia > 0) {
            distancias.add(distancia);
            nombres.add(p3.getNombre() + " y " + p4.getNombre());
        }
        if (distancias.size() == 0) {
            System.out.println("Son los mismos puntos");    
        } else {
            double distanciaMenor = Collections.min(distancias);
            int indice = distancias.indexOf(distanciaMenor);
            System.out.println("La distancia menor es " + distanciaMenor + " entre " + nombres.get(indice));    
        }
        
        
    }
    
}
