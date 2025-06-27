import java.util.Scanner;

public class UsoDoWhile {
    public static void main(String[] args) {
        String option;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Quieres salir?");
            option = sc.nextLine();

        }while(option.equalsIgnoreCase("no"));
        System.out.println("Adios...");

    }
}
