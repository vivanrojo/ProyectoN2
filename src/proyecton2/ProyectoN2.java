
package proyecton2;

import java.util.Scanner;

public class ProyectoN2 {

    
    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el sueldo del trabajador
        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = scanner.nextDouble();

        // Calcular el aumento según las condiciones dadas
        double aumento;
        if (sueldo < 1000) {
            aumento = sueldo * 0.17;  // Aumento del 17% si el sueldo es inferior a 1000 Euros
        } else {
            aumento = sueldo * 0.12;  // Aumento del 12% en caso contrario
        }

        // Calcular el nuevo sueldo sumando el aumento al sueldo original
        double nuevoSueldo = sueldo + aumento;

        // Imprimir el nuevo sueldo del trabajador
        System.out.println("Nuevo sueldo del trabajador: " + nuevoSueldo);

        // Cerrar el objeto Scanner
        scanner.close();
        
        
        
    }//fin main -
    
}
