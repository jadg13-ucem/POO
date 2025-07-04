import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> productos = new ArrayList<>();
        productos.add("Cafe");
        productos.add("Azucar");
        productos.add("Pan");

        for(String prod : productos){
            System.out.print(prod);
            System.out.println(" - tiene " + prod.length() + " letras");
        }

        String valor = "pan";
        boolean encontrado = false;
        for(String prod : productos){
            if (prod.equalsIgnoreCase(valor)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) System.out.println("Se encontro");
        else System.out.println("No se encontro");


    }
}
