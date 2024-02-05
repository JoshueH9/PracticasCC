package kass.concurrente.modelo.producto;

/**
 * Clase que modela un producto de un inventario
 * @author Kassandra Mirael
 */
public class ProductoInventario extends Producto{

    /** Cantidad de productos de un tipo en el inventario */
    protected Integer cantidadd = 10;

    public ProductoInventario(String nombre, Double precio, Integer cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadd = cantidad;
    }

    public ProductoInventario(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public ProductoInventario(){}

    public Integer getCantidad() {
        return cantidadd;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidadd = cantidad;
    }
   

}
