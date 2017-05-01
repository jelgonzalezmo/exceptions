/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practi2;

/**
 *
 * @author GONZALES
 */
public class Test {
 
    public Test(){
    dividirxcero();
    }
    double dividirxcero(){
    double result=0;
    try{result=25/0;}
    catch(ArithmeticException exception){
        System.out.println("no se puede dividir por cero");
    }
    return result;

}

}
