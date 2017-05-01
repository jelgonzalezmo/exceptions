/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practi;

/**
 *
 * @author GONZALES
 */
public class Practi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo(145);
        v1.arrancar();
        v1.detener();
        Vehiculo p1 = new Palanca(4,456);
        Palanca p2 = new Palanca(5, 542);
        p1.arrancar();
        p2.arrancar();
        Auto a1=new Auto (57,546); 
    a1.arrancar();
    }

}
