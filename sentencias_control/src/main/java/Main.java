import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Sentencias de control
        //if
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad: ");
        edad = sc.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }

}
