package org.example;

public class Directivo extends Empleado{

    private int codigoDespacho;

    public Directivo(String nombre, String apellido, String dni, String clase, int codDespacho){
        super(nombre, apellido, dni, clase);
        this.codigoDespacho = codDespacho;
    }

    public int getCodigoDespacho() {
        return codigoDespacho;
    }
    public void setCodigoDespacho(int codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" con Codigo de despacho: " + this.codigoDespacho);

        return sb.toString();
    }


}
