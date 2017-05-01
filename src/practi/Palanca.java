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
public class Palanca extends Vehiculo {
    private int CanPuertas;
    public Palanca(int a,int CanPuertas){
    super(a);
    this.CanPuertas=CanPuertas;
    }
 

    @Override
    public void arrancar() {
        super.arrancar(); //To change body of generated methods, choose Tools | Templates.
    }
    public void Mover (String direccion){}
}
