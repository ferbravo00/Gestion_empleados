/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Empleado extends Persona{
    private int numSS;

    public Empleado(int numSS, String nombre, String apellido) {
        super(nombre, apellido);
        this.numSS = numSS;
    }

    public int getNumSS() {
        return numSS;
    }

    public void setNumSS(int numSS) {
        this.numSS = numSS;
    }

    @Override
    public String toString() {
        return "Empleado{" +super.toString()+ "numSS=" + numSS + '}';
    }
    
    
}
