package modelos;

import java.util.ArrayList;

public class Calculo {

    public double calcularPromedio(ArrayList<Estudiante> lista){
        double suma = 0, promedio = 0;
        for(Estudiante est : lista){
            suma += est.getPromedio();
        }
        promedio = suma / lista.size();
        return promedio;
    }
}
