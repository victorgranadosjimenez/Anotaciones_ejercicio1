package org.example;

public class Tecnico extends Operario{

    private String perfil;

    public Tecnico(String nombre, String apellido, String dni, String clase, int codTaller, String perfil) {
        super (nombre, apellido, dni, clase, codTaller);
        this.perfil = perfil;

    }
    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" con perfil: " + this.perfil);

        return sb.toString();
    }
}
