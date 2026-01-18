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
                "2. Anglosajon -> SIU \n" +
                "opcion: ");
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
        System.out.println("\n Ingrese la medida del SIU (Sistema Internacional de Unidades): \n" +
                "== Longitud == \n" +
                "m. Metro \n" +
                "== Masa == \n" +
                "kg. Kilogramo \n" +
                "l. Litro \n" +
                "== Temperatura ==\n" +
                "c. Celsius \n" +
                ": ");
        siuMedida = sc.next();
        System.out.println("Ingrese el valor del SIU :");
        siu = sc.nextInt();
        System.out.println("Ingresa la medida deseada: ");
        System.out.println("\n " +
                "== Longitud == \n " +
                "in. Pulgada \n " +
                "ft. Pie\n " +
                "yd. Yarda \n " +
                "mi. Milla \n " +
                "== Masa == \n " +
                "lb. Libra \n " +
                "== Volumen == \n " +
                "floz. Onza Liquida \n " +
                "gal. Galón \n " +
                "f. Fahrenheit \n" +
                ": ");
        medida = sc.next().toLowerCase();
        switch (siuMedida) {
            case "m":
                convertirMetros(medida);
                break;
            case "kg":
                convertirKilogramos(medida);
                break;
            case "l":
                convertirLitros(medida);
                break;
            case "c":
                if (medida.equals("f")) {
                    System.out.println("Resultado: " + ((siu * 9 / 5) + 32) + " F");
                } else {
                    System.out.println("Conversion invalida");
                }
                break;
            default:
                System.out.println("Conversion invalida o unidad desconocida");
        }
    }

    private void convertirMetros(String medida) {
        switch (medida) {
            case "in":
                System.out.println(siu * Conversiones.METRO_A_PULGADA + " Pulgadas");
                break;
            case "ft":
                System.out.println(siu * Conversiones.METRO_A_PIE + " pies");
                break;
            case "yd":
                System.out.println(siu * Conversiones.METRO_A_YARDA + " yardas");
                break;
            case "mi":
                System.out.println(siu * Conversiones.METRO_A_MILLA + " millas");
                break;
            default:
                System.out.println("Conversión no valida");
        }
    }

    public void convertirKilogramos(String medida) {
        switch (medida) {
            case "lb":
                System.out.println(siu * Conversiones.KG_A_LIBRA + " libras");
                break;
            case "oz":
                System.out.println(siu * Conversiones.KG_A_ONZA + " onzas");
                break;
            default:
                System.out.println("Conversión invalida");
        }
    }

    public void convertirLitros(String medida) {
        switch (medida) {
            case "gal":
                System.out.println(siu * Conversiones.L_A_GALON + " galones");
                break;
            default:
                System.out.println("Conversion invalida");
        }
    }

    public void ANGLOSAJON_TO_SIU() {
        System.out.println("Ingrese la medida del ANGLOSAJON :");
    }
}
