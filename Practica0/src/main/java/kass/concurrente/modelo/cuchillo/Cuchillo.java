package kass.concurrente.modelo.cuchillo;

/**
 * Interfaz que simulara un cuchillo
 * @author Kassandra Mirael
 * @version 1.0
 */
public interface Cuchillo {

    /**
     * Metodo que hace que cocine mas rapido al usar el cuchillo
     * Cocineros de 10 a 19 años usan cuchillos de bronce
     * Cocineros de 20 a 29 años usan cuchillos de plata
     * Cocineros de 30 años en adelante usan cuchillos de oro.
     * 
     * Los cuchillos de bronce, plata y oro reducen el tiempo de preparacion 
     * en 2,3 y 4 unidades de tiempo respectivamente.
     * @return El tiempo que reduce al usar dicho item
     */
    public int corta();
}
