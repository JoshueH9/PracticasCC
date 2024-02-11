package kass.concurrente.herencia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * En esta clase, debes crear un contador extendiendo de la clase Thread
 * @author Kassandra Mirael
 * @version 1.1
 */
public class Hilos extends Thread {
    public static final Integer HILOS = 3;

    public static List<Thread> hilos = new ArrayList<>();

    @Override
    public void run() { //Sobrescribimos el metodo run
        int ID = Integer.parseInt(Thread.currentThread().getName());
        if(ID == 1){
            System.out.println("Hola Soy el hilo 1");
        }else{
            System.out.println("Hola soy el hilo: "+ Thread.currentThread().getName());//Pedimos el nombre del hilo pidiendo primero que se seleccione el Hilo
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Hilos h = new Hilos();

        for(int i=0; i<10; i++){
            Thread t = new Thread(h,""+i);
            hilos.add(t);
        }

        for(Thread hilo:hilos)
            hilo.start();

        for(Thread hilo:hilos)
            hilo.join();

    }
}
