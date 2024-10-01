package org.example;

import java.lang.annotation.*;

//Crear la anotacion
@Documented //psts javadoc
@Inherited //herencia
@Target(ElementType.METHOD) //para usarlo en el método static
@Retention(RetentionPolicy.RUNTIME) //usado en tiempo de ejecucion
@Repeatable(AnotacionEmpleados.class)
public @interface Empleados{
    String nombreEmpleado();
    String apellidoEmpleado();
    String dni();
    String clase();
    int codigoDespacho() default 0;  //para no rellenar oficial y tecnico
    int codigoTaller() default 0;
    String categoria() default "no tiene"; //para no rellenar directivo y tecnico
    String perfil() default "no tiene"; //para no rellenar oficial y directivo


}