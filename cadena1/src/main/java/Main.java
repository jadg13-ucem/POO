import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String cadena1, cadena2;
        cadena1 = "Hola desde la UCEM";
        cadena2 = "Hola desde la UCEm";
        int resultado = cadena1.compareTo(cadena2);
        int resultado2 = cadena2.compareToIgnoreCase(cadena1);
        System.out.println(resultado);
        System.out.println(resultado2);
        String cadena3= "";
        cadena3 = cadena3.concat(cadena1);
        cadena3 = cadena3.concat(" - ");
        cadena3 = cadena3.concat(cadena2);
        System.out.println(cadena3);

        boolean resp = cadena1.contains("UCEM");
        System.out.println(resp);

        resp = cadena1.endsWith("Em");
        System.out.println(resp);

        resp = cadena1.equals("Hola desde la UCEm");
        System.out.println(resp);
        resp = cadena1.equalsIgnoreCase("Hola desde la UCEm");
        System.out.println(resp);

        String cadena4 = "UCEM";
        System.out.println(cadena4);

        System.out.println(cadena4.replace("CE", "**"));
        System.out.println(cadena4.toLowerCase());

    }

}
