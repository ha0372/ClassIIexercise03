/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Profesor extends Persona{
    private String Titulo;
    private String Dedicacion;
    
    public Profesor
    (String Nombre,String Direccion,String FechaNC,String Genero,int Edad,String Titulo,String Dedicacion){
         this.Nombre = Nombre;
         this.Dirreccion = Direccion;
         this.FechaNC = FechaNC;
         this.Genero = Genero;
         this.Edad = Edad;
         this.Titulo = Titulo ;
         this.Dedicacion = Dedicacion;
         
        
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDedicacion() {
        return Dedicacion;
    }

    public void setDedicacion(String Dedicacion) {
        this.Dedicacion = Dedicacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirreccion() {
        return Dirreccion;
    }

    public void setDirreccion(String Dirreccion) {
        this.Dirreccion = Dirreccion;
    }

    public String getFechaNC() {
        return FechaNC;
    }

    public void setFechaNC(String FechaNC) {
        this.FechaNC = FechaNC;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "Nombre=" + Nombre + ", Dirreccion=" + Dirreccion + ", FechaNC=" + FechaNC + ", Genero=" + Genero + ", Edad=" + Edad + ", Titulo=" + Titulo + ", Dedicacion=" + Dedicacion + '}';
    }
    

}
