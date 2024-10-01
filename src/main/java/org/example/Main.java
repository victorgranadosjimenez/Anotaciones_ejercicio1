package org.example;
import org.example.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NullPointerException {


        //probamos a crear la empresa Zara
        Tecnico luis = new Tecnico("Luis", "Ruiz", "34567799P",
                "Técnico", 9876, "de maquinaria");
        Oficial marta = new Oficial("Marta", "Ramos", "39875421L",
                "Oficial", 9911, "principiante");
        Operario miriam = new Operario("Miriam", "Sanchez", "22332211K",
                "Operario", 6120);
        Directivo jaime = new Directivo("Jaime", "Bravo", "98123455D",
                "Directivo", 6611);

        Empresa zara = new Empresa("Zara");
        zara.addListEmpleados(Empresa.cargadorDeContexto());
        zara.addEmpleados(luis);
        zara.addEmpleados(miriam);
        zara.addEmpleados(jaime);
        zara.addEmpleados(marta);

        System.out.println("La empresa Zara cuenta con:");
        System.out.println(zara.toString());


    }
}