import java.util.Scanner;

public class UsoSwitch {

    public static void main(String[] args) {
        int dia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero del 1 al 7: ");
        dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }

    }
}
