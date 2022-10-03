/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import dominio.Persona;
import dominio.Empleado;
import java.util.Arrays;
/**
 *
 * @author Alumno Mañana
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona ("Fer", "Bravo");
        Persona p2 = new Persona ("Ingrid", "Ayala");
        System.out.println(p1);
        System.out.println(p2);
        
        Arrays personas [] = new Arrays [5];
        
    }
    
    
}
