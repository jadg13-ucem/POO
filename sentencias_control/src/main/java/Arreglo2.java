public class Arreglo2 {
    public static void main(String[] args) {
        //arreglo de enteros
        //Notas y obtener el promedio
        int[] notas = new int[4];
        notas[0] = 60;
        notas[1] = 80;
        notas[2] = 90;
        notas[3] = 85;
        float suma=0, promedio;
        int cont = 0;
        while(cont < 4){
            suma += notas[cont];
            cont++;
        }
        promedio = suma / notas.length;
        System.out.println("El promedio es: " + promedio);
    }
}
