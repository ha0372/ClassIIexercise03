/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Estudiante extends Persona{
    private int Matricula;
    private String Carrera;
    
    public  Estudiante(String Nombre,String Direccion,String FechaNC,String Genero,int Edad,int Matricula,String Carrera){
        this.Nombre = Nombre;
        this.Dirreccion = Direccion;
        this.FechaNC = FechaNC;
        this.Genero = Genero;
        this.Edad = Edad;
        this.Matricula = Matricula;
        this.Carrera = Carrera;
        
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Nombre=" + Nombre + ", Dirreccion=" + Dirreccion + ", FechaNC=" + FechaNC + ", Genero=" + Genero + ", Edad=" + Edad + ", Matricula=" + Matricula + ", Carrera=" + Carrera + '}';
    }
    
    
}
