package org.example;


public class Empleado {

    String nombre;
    String apellido;
    String dni;
    String clase;



    public Empleado(String nombre, String apellido, String dni, String clase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.clase = clase;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" El empleado " + this.nombre + " " + this.apellido + " con DNI "
                + this.dni + " con clase " + this.clase);
        return sb.toString();
    }
}


