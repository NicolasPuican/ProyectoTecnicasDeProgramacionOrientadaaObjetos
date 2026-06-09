/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacampo5;
import java.util.Scanner;
/**
 *
 * @author OTTO MARTINEZ
 */
public class PracticaCampo5 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Almacen miAlmacen= new Almacen();
        int opcion=0;
        System.out.println("===| SISTEMA DE CONTROL DE ALMACEN |===");
        do
        {
            System.out.println("1. Registrar producto (solo nombre)");
            System.out.println("2. Registrar producto(nombre y stock) ");
            System.out.println("3. Mostrar Inventario");
            System.out.println("4. Salir");
            System.out.println("Seleccion una opcion");
            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese nombre del producto: ");
                        String nom1 = sc.nextLine();
                        miAlmacen.registrarProducto(nom1);
                        break;

                    case 2:
                        System.out.print("Ingrese nombre del producto: ");
                        String nom2 = sc.nextLine();
                        System.out.print("Ingrese el stock inicial: ");
                        int cant = Integer.parseInt(sc.nextLine());
                        miAlmacen.registrarProducto(nom2, cant);
                        break;

                    case 3:
                        miAlmacen.mostrarInventario();
                        break;

                    case 4:
                        System.out.println("Saliendo del sistema del almacén...");
                        break;

                    default:
                        System.out.println("Opcion invalida. Intente nuevamente.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error de entrada: ¡Debe introducir un numero entero valido!");
            } catch (IllegalArgumentException e) {
                // Captura los errores de validación arrojados por la clase Producto
                System.out.println("Error en los datos del Producto: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                // Captura el error si el Array de Almacen se llena
                System.out.println("Error del Almacen: " + e.getMessage());
            }

        } while (opcion != 4);

        sc.close(); 
            
    }
    
}
