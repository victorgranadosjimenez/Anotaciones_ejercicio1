package org.example;
import java.lang.annotation.*;

//Crear la anotacion
@Documented //psts javadoc
@Inherited //herencia
@Target(ElementType.METHOD) //para usarlo en el método static
@Retention(RetentionPolicy.RUNTIME) //usado en tiempo de ejecucion
public @interface AnotacionEmpleados {
    Empleados[] value();
}

