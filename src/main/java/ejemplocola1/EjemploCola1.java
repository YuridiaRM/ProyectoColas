package ejemplocola1;

import java.util.Scanner;

public class EjemploCola1 {

    public static void main(String[] args) {
        ColaNombres objCola = new ColaNombres();
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ DE OPCIONES (COLA) ---");
            System.out.println("1. Poner elemento en la Cola");
            System.out.println("2. Quitar elemento de la Cola");
            System.out.println("3. Mostrar elementos de la Cola");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            
            if (leer.hasNextInt()) {
                opcion = leer.nextInt();
                leer.nextLine(); 
                
                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el nombre a insertar en la cola: ");
                        String nombre = leer.nextLine();
                        System.out.println(objCola.pone(nombre));
                        break;
                    case 2:
                        System.out.println("Acción: " + objCola.quita());
                        break;
                    case 3:
                        objCola.mostrar();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intenta nuevamente.");
                }
            } else {
                System.out.println("Por favor, ingresa un número válido.");
                leer.next(); 
            }
        } while (opcion != 4);
        
        leer.close();
    }
}