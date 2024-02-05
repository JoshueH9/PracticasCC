package kass.concurrente;

import java.util.ArrayList;
import java.util.List;

import kass.concurrente.modelo.cuchillo.Cuchillo;
import kass.concurrente.modelo.persona.Chef;
import kass.concurrente.modelo.persona.Persona;
import kass.concurrente.modelo.producto.Agua;
import kass.concurrente.modelo.producto.Bolillo;
import kass.concurrente.modelo.producto.CocaCola;
import kass.concurrente.modelo.producto.Platillo;
import kass.concurrente.modelo.producto.ProductoInventario;

/**
 * Clase Main
 * Aqui va toda tu simulacion
 * Genera un par de clientes para que los atienda el chef
 * @author Kassandra Mirael
 * @version 1.0
 */
public class Main {

    protected static Cuchillo cu;

    public static void main(String[] args) throws InterruptedException {
        
        Chef joshue = new Chef("Joshue",24, cu);
        Persona angelica = new Persona("Angelica", 27);
        Persona marco = new Persona("Marco",24);
        System.out.println("\n--- Inicia el día ---\n");
        
        // Ejemplo cliente normal.
        System.out.println(joshue.getNombre()+" atiende a, "+angelica.getNombre());
        Platillo platoActual = joshue.preparaTortaPollo();
        System.out.println("Cocinando: "+platoActual.getNombre());
        System.out.println("Tiempo hasta terminar "+platoActual.getTiempoCoccion()+" unidades d tiempo");
        Thread.sleep(platoActual.getTiempoCoccion()*(long)1000);
        platoActual.calculaPrecio();
        System.out.println("\n-- Cliente despachado ---\n");

        // Ejemplo de venta con productos solos.
        System.out.println(joshue.getNombre()+" atiende a "+marco.getNombre());
        List<ProductoInventario> productos = new ArrayList<>();
        productos.add(new CocaCola());
        productos.add(new Agua());
        productos.add(new Bolillo());
        platoActual = joshue.preparaPersonalizado(productos,6);
        System.out.println("Cocinando "+platoActual.getNombre());
        System.out.println("Tiempo hasta terminar: "+platoActual.getTiempoCoccion()+" unidades de tiempo");
        Thread.sleep(platoActual.getTiempoCoccion()*(long)1000);
        System.out.println("\n--- Cliente despachado ---\n");

        System.out.println("\n--- Ganancias del día ---\n");

        System.out.println(platoActual.calculaPrecio());

    }
}