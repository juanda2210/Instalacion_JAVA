package Java.tiposDeDatos;

public class Main {

    public static final String CONSTANTE = "Hola amigos";

    public static void main(String[] args) {


        System.out.println("Este es un mensaje que se imprime con salto de linea al final");
        System.out.print("Este es un mensaje que se imprime sin salto de linea");
        System.out.print("Acá está la prubea");
        System.out.println("Solo para salto de linea");
        System.out.println("------------------------");

        System.out.println(
                CONSTANTE + """ 
                 es un gusto poder saludarlos el dia de hoy
                Que les parece si empezamos con la identificacion de los diferentes datos variables en JAVA
                """);

        boolean booleanito = true;
        byte numeroConOchoBytes = -128;
        int numeroEntero = 222;
        long numeroMasGrandeQueUnEntero = 8000000000L;
        float numeroDecimalPequeno = 1.75f;
        double numeroDecimalGrande = 199.99;
        char caracterSolo = 'A';
        String cadenaDeText = "Bueeenoooo. Este es el final";

        System.out.println(
                "------------------------------------------\n" +
                        "valor booleano: " + booleanito + "\n" +
                        "valor byte: " + numeroConOchoBytes + "\n" +
                        "valor int: " + numeroEntero + "\n" +
                        "valor long: " + numeroMasGrandeQueUnEntero + "\n" +
                        "valor float: " + numeroDecimalPequeno + "\n" +
                        "valor double: " + numeroDecimalGrande + "\n" +
                        "valor char: " + caracterSolo + "\n" +
                        cadenaDeText + "\n" +
                        "------------------------------------------"
        );
    }
}
