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
        System.out.println("\n Ingrese la medida del ANGLOSAJON: \n" +
                "== Longitud == \n" +
                "in. Pulgada \n" +
                "ft. Pie \n" +
                "yd. Yarda \n" +
                "mi. Milla \n" +
                "== Masa == \n" +
                "lb. Libra \n" +
                "oz. Onza \n" +
                "== Volumen == \n" +
                "gal. Galón \n" +
                "floz. Onza líquida \n" +
                "== Temperatura == \n" +
                "f. Fahrenheit \n" +
                ": ");

        anglosajonMedida = sc.next().toLowerCase();

        System.out.println("Ingrese el valor ANGLOSAJON:");
        anglosajon = sc.nextInt();

        System.out.println("Ingrese la medida deseada del SIU (m, kg, l, c): ");
        medida = sc.next().toLowerCase();

        switch (anglosajonMedida) {
            case "in":
            case "ft":
            case "yd":
            case "mi":
                convertirLongitudAnglosajon(medida);
                break;

            case "lb":
            case "oz":
                convertirMasaAnglosajon(medida);
                break;

            case "gal":
            case "floz":
                convertirVolumenAnglosajon(medida);
                break;

            case "f":
                if (medida.equals("c")) {
                    System.out.println("Resultado: " + ((anglosajon - 32) * 5 / 9) + " °C");
                } else {
                    System.out.println("Conversión inválida");
                }
                break;

            default:
                System.out.println("Unidad no válida");
        }
    }

    private void convertirLongitudAnglosajon(String medida) {
        if (!medida.equals("m")) {
            System.out.println("Conversión inválida");
            return;
        }

        switch (anglosajonMedida) {
            case "in":
                System.out.println(anglosajon * Conversiones.PULGADA_A_METRO + " metros");
                break;
            case "ft":
                System.out.println(anglosajon * Conversiones.PIE_A_METRO + " metros");
                break;
            case "yd":
                System.out.println(anglosajon * Conversiones.YARDA_A_METRO + " metros");
                break;
            case "mi":
                System.out.println(anglosajon * Conversiones.MILLA_A_METRO + " metros");
                break;
        }
    }

    private void convertirMasaAnglosajon(String medida) {
        if (!medida.equals("kg")) {
            System.out.println("Conversión inválida");
            return;
        }

        switch (anglosajonMedida) {
            case "lb":
                System.out.println(anglosajon * Conversiones.LIBRA_A_KG + " kg");
                break;
            case "oz":
                System.out.println(anglosajon * Conversiones.ONZA_A_KG + " kg");
                break;
        }
    }

    private void convertirVolumenAnglosajon(String medida) {
        switch (anglosajonMedida) {
            case "gal":
                if (medida.equals("l")) {
                    System.out.println(anglosajon * Conversiones.GALON_A_LITRO + " litros");
                } else {
                    System.out.println("Conversión inválida");
                }
                break;

            case "floz":
                if (medida.equals("ml")) {
                    System.out.println(anglosajon * Conversiones.FLOZ_A_ML + " ml");
                } else {
                    System.out.println("Conversión inválida");
                }
                break;
        }
    }
}
