import java.util.Scanner;

public class UsoWhile {
    public static void main(String[] args) {
        //Mostrar los numeros pares de 1 hasta x
        int x, cont;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero mayor a 1: ");
        x = sc.nextInt();
        cont = 1;
        while(cont <= x){
            if(cont % 2 == 0) System.out.println(cont);
            cont++;
        }
    }
}
