package cl.llanquihuetour.app;
import cl.llanquihuetour.model.RutaTuristica;
import cl.llanquihuetour.service.LlanquihueService;
import cl.llanquihuetour.util.LectorArchivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal del sistema Llanquihue Tour
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LectorArchivo lector = new LectorArchivo();
        
        ArrayList<RutaTuristica> rutasDelArchivo = lector.cargarrutas("rutas.txt");
        LlanquihueService servicio = new LlanquihueService(rutasDelArchivo);
        
        int opcion = 0;

        do {
            System.out.println("\n------VISUALIZACIÓN LLANQUIHUE TOUR------");
            System.out.println("1. Mostrar todas las Rutas y sus guias");
            System.out.println("2. Buscar Rutas por Presupuesto Máximo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERROR, USAR SOLAMENTE NUMEROS ENTEROS POSITIVOS");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n---LISTADO GENERAL---");
                    servicio.listarRutas();
                    break;

                case 2:
                    System.out.println("\n--- FILTRAR POR PRESUPUESTO MÁXIMO ---");
                    System.out.print("Ingrese su presupuesto disponible ($): ");
                    try {
                        int presupuesto = Integer.parseInt(scanner.nextLine());
                        System.out.println("\n[Resultados que se ajustan a su presupuesto]:");
                        servicio.buscarPorPresupuestoMaximo(presupuesto);
                    } catch (NumberFormatException e) {
                        System.out.println("Error, El presupuesto debe ser un número entero positivo");
                    }
                    break;

                case 3:
                    System.out.println("Gracias por usar el sistema de Llanquihue Tour");
                    break;

                default:
                    System.out.println("Opción incorrecta. Intente un número del 1 al 3.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
