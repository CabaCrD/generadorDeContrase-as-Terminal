// Author CabaCrD
package main;
import java.util.Scanner; //PARA INTRODUCIR DATOS DE ENTRADA

public class main {
	
	/** EL METODO PRINCIPAL **/
	public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        String cadenaMinus = "abcdefghijklmnopqrstuvwxyz";
        String cadenaMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cadenaNum = "1234567890";
        String cadenaSimb = "!@#$%^&*_-+=";
        String cadena = "";
		String contrasena = "";
        int longitud = 0;
        String veMinus;
        String veMayus;
        String veNum;
        String veSimbol;

        try {

            // LONGITUD DE LA CONTRASEÑA

            do { //BUCLE QUE NO SE CERRARA HASTA QUE SE CUMPLAN CIERTOS PARAMETROS

                System.out.println("Introduzca la longitud de la contraseña (8/2048)");
                longitud = key.nextInt(); // INPUT PARA OBTENER LA LONGITUD
                key.nextLine(); //PARA EVITAR ERRORES DE LINEA

                if (longitud < 8 || longitud > 2048) { System.out.println("Introduzca una longitud entre 8 y 2048");} // SI NO ELEGIMOS UNA LONGITUD VALIDA

            } while (longitud < 8 || longitud > 2048); // SE CIERRA EL BUCLE

            // QUE CONTENGA MINUSCULAS

            do { //BUCLE QUE NO SE CERRARA HASTA QUE SE CUMPLAN CIERTOS PARAMETROS

                System.out.println("¿Quiere que contenga minúsculas?(S/N)");
                veMinus = key.nextLine().toUpperCase();

                if (!veMinus.equals("S") && !veMinus.equals("N")) { System.out.println("Seleccione una opción válida (S/N)");} // SI NO ELEGIMOS NINGUNA DE LAS DOS OPCIONES

            } while (!veMinus.equals("S") && !veMinus.equals("N")); // SE CIERRA EL BUCLE

            // QUE CONTENGA MAYUSCULAS

            do { //BUCLE QUE NO SE CERRARA HASTA QUE SE CUMPLAN CIERTOS PARAMETROS
				
                System.out.println("¿Quiere que contenga mayúsculas?(S/N)");
                veMayus = key.nextLine().toUpperCase();

                if (!veMayus.equals("S") && !veMayus.equals("N")) { System.out.println("Seleccione una opción válida (S/N)"); } // SI NO ELEGIMOS NINGUNA DE LAS DOS OPCIONES

            } while (!veMayus.equals("S") && !veMayus.equals("N")); // SE CIERRA EL BUCLE

            // QUE CONTENGA NUMEROS

            do { //BUCLE QUE NO SE CERRARA HASTA QUE SE CUMPLAN CIERTOS PARAMETROS

                System.out.println("¿Quiere que contenga números?(S/N)");
                veNum = key.nextLine().toUpperCase();

                if (!veNum.equals("S") && !veNum.equals("N")) { System.out.println("Seleccione una opción válida (S/N)"); } // SI NO ELEGIMOS NINGUNA DE LAS DOS OPCIONES

            } while (!veNum.equals("S") && !veNum.equals("N")); // SE CIERRA EL BUCLE

            // QUE CONTENGA SIMBOLOS

            do { //BUCLE QUE NO SE CERRARA HASTA QUE SE CUMPLAN CIERTOS PARAMETROS

                System.out.println("¿Quiere que contenga símbolos?(S/N)");
                veSimbol = key.nextLine().toUpperCase();

                if (!veSimbol.equals("S") && !veSimbol.equals("N")) { System.out.println("Seleccione una opción válida (S/N)"); } // SI NO ELEGIMOS NINGUNA DE LAS DOS OPCIONES

            } while (!veSimbol.equals("S") && !veSimbol.equals("N")); // SE CIERRA EL BUCLE

			// LISTA DE CONDICIONALES, QUE SI LOS SELLECIONAMOS CON ANTERIODAD, IRAN SUMANDO VALORES A LA CADENA

            if (veMinus.equals("S")) { cadena += cadenaMinus; }

            if (veMayus.equals("S")) { cadena += cadenaMayus; }

            if (veNum.equals("S")) { cadena += cadenaNum; }

            if (veSimbol.equals("S")) { cadena += cadenaSimb; }

			//SI NO SELECCIONAMOS NINGUNA OPCIÓN APARTE DE LA LONGITUD

			if (cadena == "" || cadena.length() == 0 ){

				System.out.println("No has seleccionado ninguna opción");
				key.close();
				System.exit(0);

			}
           
			// BUCLE QUE CREARA NUESTRA CONTRASEÑA

			for (int i = 0; i < longitud; i++) {

				int index = (int) (Math.random() * cadena.length()); //OBTENEMOS ALEATORIAMENTE EL NUMERO DE INDICE EN NUESTRA CADENA
				char aleatoriaChar = cadena.charAt(index); //OBTENEMOS EL VALOR OBTENIDO DEL INDICE ANTERIOR
				contrasena += aleatoriaChar; //GENERAMOS LA CONTRASEÑA
				
			}

            System.out.println("Contraseña generada: " + contrasena); //MOSTRAMOS LA CONTRASEÑA PÒR PANTALLA

        } catch (Exception e) { // SI HUBO ALGUN ERROR INESPERADO

            System.out.println("Error inesperado: " + e); //NOS MUESTRA CUAL ES ESE ERROR INDICADO

        } 

    }

}