/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacampo5;

/**
 *
 * @author OTTO MARTINEZ
 */
public class Producto {
    private String nombre;
    private int stock;
    
    public Producto(String nombre , int stock)
    {
        this.nombre= nombre;
        this.stock= stock;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre==null || nombre.trim().isEmpty())
        {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no debe ser negativo.");
        }
        this.stock = stock;
    }
    
   
    
}
