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
public class Auto extends Vehiculo {

    private int pesoMax;

    public Auto(int a, int pesoMax) {
        super(a);
        this.pesoMax = pesoMax;
    }

    public void arrancar() {System.out.println("b");
    }

    public void detener() {System.out.println("b1");
    }

    public void Acelerar(int cuanto) {
    }
}
