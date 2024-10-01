package org.example;


public class Oficial extends Operario{

    private String categoria;

    public Oficial(String nombre, String apellido, String dni, String clase, int codTaller, String categoria) {
        super (nombre, apellido, dni, clase, codTaller);
            this.categoria = categoria;

    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" con categoria: " + this.categoria);

        return sb.toString();
    }
}
