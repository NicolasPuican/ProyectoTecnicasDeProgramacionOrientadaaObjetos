/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacampo5;

/**
 *
 * @author OTTO MARTINEZ
 */
public class Almacen {
    //limite de 5 
    private Producto [] inventario= new Producto[5];
    private int contadorProductos =0;
    
    public Almacen()
    {
        inventario[0] = new Producto("Pernos", 1);
      
        contadorProductos = 1;
    }
    //sobrecarga
    //producto sin stock
    public void registrarProducto(String nombre)
    {
        registrarProducto(nombre,0);
    }
    //sobrecarga 
    //producto con stock
    public void registrarProducto(String nombre, int cantidad)
    {
        if(contadorProductos<inventario.length)
        {
            inventario[contadorProductos] = new Producto(nombre, cantidad);
            contadorProductos++;  
            System.out.println("Producto '" + nombre + "' registrado con éxito");
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("Almacén lleno, maximo 5 tipos de producto");
        }
    }
    
    public void mostrarInventario()
    {
        System.out.println("---|INVENTARIO ALMACEN|---");
        if(contadorProductos==0)
        {
            System.out.println("Almacen vacio de productos");
            return;
        }
        for(int i =0; i<contadorProductos;i++)
        {
            System.out.println("- " + inventario[i].getNombre() + " | Stock: " + inventario[i].getStock() + " unidades.");
        }
    }
    
}
