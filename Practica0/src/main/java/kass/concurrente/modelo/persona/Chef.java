package kass.concurrente.modelo.persona;

import java.util.ArrayList;
import java.util.List;

import kass.concurrente.modelo.cuchillo.Cuchillo;
import kass.concurrente.modelo.producto.Platillo;
import kass.concurrente.modelo.producto.ProductoInventario;

import kass.concurrente.modelo.producto.Tortilla;
import kass.concurrente.modelo.producto.Bolillo;

import kass.concurrente.modelo.producto.Jamon;
import kass.concurrente.modelo.producto.Pollo;

/**
 * Clase que simula a un chef
 * @author Pedro Joshue Pintor Muñoz
 * @version 1.0 febrero 2024.
 */
public class Chef extends Persona implements Cuchillo{
    
    private Cuchillo cu;
    List<ProductoInventario> productos;

    public Chef(String nombre, Integer edad, Cuchillo cu) {
        super(nombre, edad);
        this.cu = cu;
    }

    public Cuchillo getCu() {
        return cu;
    }

    public void setCu(Cuchillo cu) {
        this.cu = cu;
    }

    @Override
    public int corta(){
        if (this.edad < 20 && this.edad > 9)
            return 2;
            else if (this.edad < 30 && this.edad > 19)
                return 3;
                else
                    return 4;
    }
    
    /** 
     * Metodo en donde el chef prepara un taco de pollo
     * @return Un platillo de taco de pollo.
     */
    public Platillo preparaTacoPollo() throws InterruptedException{
        productos = new ArrayList<>();
        productos.add(new Tortilla());
        productos.add(new Pollo());
        return new Platillo(productos,10.,5-corta(),"Taco de Pollo");
    }

    /** 
     * Metodo en donde el chef prepara una torta de jamon
     * @return Un platillo de torta de jamon.
     */
    public Platillo preparaTortaJamon() throws InterruptedException{
        productos = new ArrayList<>();
        productos.add(new Bolillo());
        productos.add(new Jamon());
        return new Platillo(productos,10.,6-corta(),"Torta de Jamon");
    }

    /** 
     * Metodo en donde el chef prepara una torta de pollo
     * @return Un platillo de torta de pollo.
     */
    public Platillo preparaTortaPollo() throws InterruptedException{
        productos = new ArrayList<>();
        productos.add(new Bolillo());
        productos.add(new Pollo());
        return new Platillo(productos,10.,7-corta(),"Torta de Pollo");
    }

    /** 
     * Metodo en donde el chef prepara un platillo personalizado
     * @return Un platillo personalizado.
     */
    public Platillo preparaPersonalizado(List<ProductoInventario> productos, Integer tiempoCoccion){
        return new Platillo(productos,10.,tiempoCoccion-corta(),"Personalizado");
    }

}
