package kass.concurrente.modelo.producto;

import java.util.List;

/**
 * Clase que modela un platillo
 * @author Kassandra Mirael
 * @author Pedro Joshue Pintor Muñoz
 * @version 1.1 febrero 2024. 
 */
public class Platillo {
    
    private List<ProductoInventario> productosRequeridos;
    private Double precio;
    private Integer tiempoCoccion;
    private String nombre;
    private static Double precioFinal = 0.;

    public Platillo() {
    }

    public Platillo(String nombre, Integer tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
        this.nombre = nombre;
    }

    public Platillo(List<ProductoInventario> productosRequeridos, Double precio, Integer tiempoCoccion, String nombre) {
        this.productosRequeridos = productosRequeridos;
        this.precio = precio;
        this.tiempoCoccion = tiempoCoccion;
        this.nombre = nombre;
    }
    
    public List<ProductoInventario> getProductosRequeridos() {
        return productosRequeridos;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getTiempoCoccion() {
        return tiempoCoccion;
    }

    public String getNombre() {
        return nombre;
    }

    public static Double getPrecioFinal() {
        return precioFinal;
    }

    public static void setPrecioFinal(Double precioFinal) {
        Platillo.precioFinal = precioFinal;
    }

    /**
     * Este metodo calcula el precio sobre el precio de los items, se ignora
     * el precio base.
     * @return El precio de la suma de cada item utilizado
     */
    public Double calculaPrecio(){

        for(int i=0; i<productosRequeridos.size(); i++){
            setPrecioFinal(getPrecioFinal()+productosRequeridos.get(i).getPrecio());
        }
        
        return precioFinal;
    }




}
