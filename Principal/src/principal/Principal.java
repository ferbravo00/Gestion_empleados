/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import dominio.Persona;
import dominio.*;
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
        Persona p3 = new Persona ("Paco", "Paquito");
        Persona p4 = new Persona ("Nacho", "Nachito");
        Empleado e1 = new Empleado (234,"Paco","Garcia",445);
        Empleado e2 = new Empleado (234,"Pacomerte","Guapo",445);
        Gerente g1 = new Gerente ("Hola","eey",2345,"Nacho", "Nachito",345);
        
        
//        System.out.println(p1);
//        System.out.println(p2);
        
//        Persona personas [] = new Persona [2];
//        
//        personas[0] = p1;
//        personas[1] = p2;
//    
//        for (int i = 0; i < personas.length; i++) {
//            System.out.println(personas[i]);
//        }
        Persona personas [][] = new Persona [2][2];
        personas[0][0] = p1;
        personas[0][1] = p2;
        personas[1][0] = p3;
        personas[1][1] = p4;
        
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("Persona ["+i+"] ["+j+"]: \n"+personas[i][j]);
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("");
        
        
        imprimirnum(3,6,8,4);
        imprimirnum(3,6,8);
        imprimirnum(2,5,4,9,1);
        mostrarDetalles(g1);
        
    }
    
    public static void imprimir (Object tb[]){
        for (int i = 0; i < tb.length; i++) {
            System.out.println(tb[i]);
        }
    }
    
    public static void imprimirnum (int... num){
        for (int i = 0; i < num.length; i++) {
            System.out.println("num ["+i+"] = " + num[i]);
        }
    }
    
    public static void mostrarDetalles(Persona p){
        if(p instanceof Persona){
            System.out.println("Es una instancia de una PERSONA");
        }
        if(p instanceof Empleado){
            System.out.println("Es una instancia de una EMPLEADO");
            System.out.println("Su sueldo es: "+((Empleado) p).getSueldo());
        }
        if(p instanceof Gerente){
            System.out.println("Es una instancia de una GERENTE");
            System.out.println("Su departamento es: "+((Gerente) p).getDepartamento());
        }
    }
}
