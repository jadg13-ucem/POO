import modelos.Calculo;
import modelos.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Estudiante> listado = new ArrayList<>();
        String resp = "si";
        Scanner leer = new Scanner(System.in);
        String nombre, carrera;
        double promedio;


        System.out.println("Agregar registros");
        do{
            System.out.println("Nombre: ");
            nombre = leer.nextLine();
            System.out.println("Carrera: ");
            carrera = leer.nextLine();
            System.out.println("Promedio: ");
            promedio = Double.parseDouble(leer.nextLine());
            listado.add(new Estudiante(nombre, carrera, promedio));
            System.out.println("Agregado...");

            System.out.println("Desaa agregar otro: Si - No");
            resp = leer.nextLine();

        }while(resp.equalsIgnoreCase("si"));

        System.out.println("Registros guardados");
        for(Estudiante est : listado){
            System.out.println(est);
        }

        Calculo misCalculos = new Calculo();
        System.out.println(misCalculos.calcularPromedio(listado));
    }
}
