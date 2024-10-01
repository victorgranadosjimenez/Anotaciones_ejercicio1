package org.example;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class Empresa {


    //atributos
    private String nombre;

    private List<Empleado> empleadosEmpresa;


//método constructor
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleadosEmpresa = new LinkedList<>();
    }

    public String getNombreEmpresa() {
        return this.nombre;
    }
    public void setNombreEmpresa(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getEmpleadosEmpresa() {
        return this.empleadosEmpresa;
    }

    public void addEmpleados(Empleado emp) {
            this.empleadosEmpresa.add(emp);
    }

    public void addListEmpleados(List<Empleado> listEmp) {
        for (Empleado emp : listEmp) {
            this.empleadosEmpresa.add(emp);
        }
    }

    //método toString
    public String toString() {

        StringBuilder empleados = new StringBuilder();

        for (int i = 0; i < empleadosEmpresa.size(); i++) {
            empleados.append(empleadosEmpresa.get(i).toString());
            empleados.append("\n");
        }

        return empleados.toString();

    }



    @Empleados(
            nombreEmpleado="John",
            apellidoEmpleado="Fernandez",
            dni="66551111F",
            clase="Directivo",
            codigoDespacho = 4567
    )@Empleados(
            nombreEmpleado="Luis",
            apellidoEmpleado="Garcia",
            dni="44859607P",
            clase="Tecnico",
            codigoTaller = 55,
            perfil = "de ascensor"

    )@Empleados(
            nombreEmpleado="Pepe",
            apellidoEmpleado="Zamorano",
            dni="44637281R",
            clase="Oficial",
            codigoTaller = 68,
            categoria = "Jefe"

    )

    public static List<Empleado> cargadorDeContexto() throws NoSuchMethodException {

        Empresa empresaConContexto = new Empresa("Empresa con contexto");

        Method m = empresaConContexto.getClass().getMethod("cargadorDeContexto");

        //esta parte me daba error al acceder a las 3 anotaciones
        //hay que acceder al array de AnontacionesEmpleados
        // Acceder a las anotaciones repetidas
        if (m.isAnnotationPresent(AnotacionEmpleados.class)) {
            // Obtener la anotación contenedora
            AnotacionEmpleados contenedor = m.getAnnotation(AnotacionEmpleados.class);
            // Recorrer las anotaciones repetidas
            for (Empleados miAnotacion : contenedor.value()) {

                if( miAnotacion.clase().equals("Oficial")){
                    empresaConContexto.empleadosEmpresa.add(new Oficial(miAnotacion.nombreEmpleado(),
                            miAnotacion.apellidoEmpleado(), miAnotacion.dni(), miAnotacion.clase(),
                            miAnotacion.codigoTaller(), miAnotacion.categoria()));
                }
                if( miAnotacion.clase().equals("Directivo")){
                    empresaConContexto.empleadosEmpresa.add(new Directivo(miAnotacion.nombreEmpleado(),
                            miAnotacion.apellidoEmpleado(), miAnotacion.dni(), miAnotacion.clase(),
                            miAnotacion.codigoDespacho()));
                }
                if( miAnotacion.clase().equals("Técnico")){
                    empresaConContexto.empleadosEmpresa.add(new Tecnico(miAnotacion.nombreEmpleado(),
                            miAnotacion.apellidoEmpleado(), miAnotacion.dni(), miAnotacion.clase(),
                            miAnotacion.codigoTaller(), miAnotacion.categoria()));
                }

            }
        }
        return empresaConContexto.empleadosEmpresa;

    }




}

