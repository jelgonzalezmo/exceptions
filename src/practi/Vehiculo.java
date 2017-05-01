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
public class Vehiculo {
    protected int CabFuerza;
    public Vehiculo(int CabFuerza){
    this.CabFuerza=CabFuerza;
    }
    public void arrancar(){System.out.println("a"); }
    public void detener(){System.out.println("a1");}
}
