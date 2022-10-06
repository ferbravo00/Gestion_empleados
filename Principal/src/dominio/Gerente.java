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
public class Gerente extends Empleado{
    private String departamento;
    private String estudios;

    public Gerente(String departamento, String estudios, int numSS, String nombre, String apellido, int sueldo) {
        super(numSS, nombre, apellido, sueldo);
        this.departamento = departamento;
        this.estudios = estudios;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    @Override
    public String toString() {
        return "Gerente{" + super.toString()+ departamento + ", estudios=" + estudios + '}';
    }
    
    
}
