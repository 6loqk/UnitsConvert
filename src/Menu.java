import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    int opcion;
    int siu;
    int anglosajon;
    String medida;
    String siuMedida;
    String anglosajonMedida;

    public void Convert() {
        System.out.println("---UnitConvert---");
        System.out.println("Selecciona que tipo de conversion deseas: \n " +
                "1. SIU -> Anglosajon \n " +
                "2. Anglosajon -> SIU");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                SIU_TO_ANGLOSAJON();
                break;
            case 2:
                ANGLOSAJON_TO_SIU();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    private void SIU_TO_ANGLOSAJON() {
        System.out.println("Ingrese la medida del SIU (Sistema Internacional de Unidades): " +
                "-- Longitud -- \n" +
                "m. Metro \n" +
                "-- Masa -- \n" +
                "kg. Kilogramo \n" +
                "-- Tiempo -- \n" +
                "s. Segundo\n" +
                "-- Temperatura\n" +
                "k. Kelvin \n" +
                "c. Celsius \n" +
                "-- Corriente Electrica -- \n" +
                "a. Ampere \n" +
                "-- Intensidad Luminosa --\n" +
                "cd. Candela \n" +
                "-- Cantidad de Sustancia -- \n" +
                "mol. Mol \n" +
                "floz. Onza Liquida");
        siuMedida = sc.next();
        System.out.println("Ingrese el valor del SIU :");
        siu = sc.nextInt();
        System.out.println("Ingresa la medida deseada: ");
        System.out.println("\n " +
                "-- Longitud -- \n " +
                "in. Pulgada \n " +
                "ft. Pie\n " +
                "yd. Yarda \n " +
                "mi. Milla -- \n " +
                "-- Masa -- \n " +
                "oz. Onza \n " +
                "lb. Libra \n " +
                "ton. Tonelada \n " +
                "-- Tiempo -- \n " +
                "s. Segundo \n " +
                "min. Minuto \n " +
                "h. Hora \n " +
                "-- Temperatura -- \n " +
                "F. Fahrenheit \n " +
                "-- Volumen -- \n " +
                "floz. Onza Liquida \n " +
                "pt. Pinta \n " +
                "qt. Cuarto \n " +
                "gal. Galón \n " +
                "lbf. Libra-Fuerza");
        sc.nextLine();
        medida = sc.nextLine();
        switch (medida) {
            case "in":
                System.out.println("El resultado de tu valor " + siuMedida + " a " + medida + " es de : " );
                break;
        }
    }

    public void ANGLOSAJON_TO_SIU() {
        System.out.println("Ingrese la medida del ANGLOSAJON :");
    }
}
