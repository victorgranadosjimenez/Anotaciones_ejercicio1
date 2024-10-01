package org.example;

public class Operario extends Empleado{

    public int codigoTaller;


    public Operario(String nombre, String apellido, String dni, String clase, int codTaller){
        super(nombre, apellido, dni, clase);
        this.codigoTaller = codTaller;
    }

   public int getCodigoTaller() {
       return codigoTaller;
   }
   public void setCodigoTaller(int codigoTaller) {
       this.codigoTaller = codigoTaller;
   }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" con Codigo de Taller: " + this.codigoTaller);

        return sb.toString();
    }
}
