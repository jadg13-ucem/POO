import java.util.Scanner;

public class UsoFor {
    public static void main(String[] args) {
        //Ciclo for
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println("" + num + " * " + i + " = "+ (num * i));
        }
    }
}
