/**

 * 
 */
package mx.projectK.hotelK;

import java.util.Scanner;

/**
 * 
 */
public class Menu {
	private final String RUTA_CLIENTES="/home/calakmul/Documents/learning/dev/eclipse-workspace/KHotel/data/clientes.db";
	private final String RUTA_HABITACIONES="/home/calakmul/Documents/learning/dev/eclipse-workspace/KHotel/data/habitaciones.db";
	private final String RUTA_RESERVACIONES="/home/calakmul/Documents/learning/dev/eclipse-workspace/KHotel/data/reservaciones.db";
	
	private Scanner scanner;
	private int opcionMenu;
	
	
	
	public Menu() {
		menu();
	}
	
	
	
	private void menu() { 
		do {	
			System.out.println("=====================");
			System.out.println("Bienvenido a K Hotel");
			System.out.println("=====================");
			System.out.println("\n");
			
			System.out.println("\t++++++++++++++++++++++");
            System.out.println("\t+   Menú Principal   +");
            System.out.println("\t++++++++++++++++++++++");
            
            System.out.println("\t\t1. Clientes");
            System.out.println("\t\t2. Habitaciones");
            System.out.println("\t\t3. Reservaciones");
            System.out.println("\t\t4. Reportes");
            System.out.println("\t\t5. Salir");
            System.out.print("\t\tSeleccione una opción: ");
            opcionMenu = scanner.nextInt();

            if (opcionMenu >= 1 && opcionMenu <= 4) {
            	switch(opcionMenu) {
	            	case 1: 
	            		
	            		break;   
	            	case 2:
	            		
	            		break;
	            	case 3: 
	            		
	            		break; 
	            	case 4:
	            		
	            		break;
	            	default:
	            		System.out.println("Opción inválida. Intenta nuevamente.");
            	}
            } else if (opcionMenu != 5) {
                System.out.println("Opción inválida. Intenta nuevamente."); 
            }
        } while (opcionMenu != 5);

        System.out.println("\nGracias por usar el sistema. ¡Hasta luego!");
        scanner.close();		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("=== Hotel K ===");
		new Menu();		
	}
}
