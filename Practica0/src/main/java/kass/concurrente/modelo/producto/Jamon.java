package kass.concurrente.modelo.producto;

/** 
 * Clase que simula un producto Jamon
 * @author Pedro Joshue Pintor Muñoz
 * @version 1.0 febrero 2024. 
 */
public class Jamon extends Carne{

    public Jamon() throws InterruptedException{
        setCantidad(getCantidad()-1);
        if(this.getCantidad()<0){
            System.out.println("Se nos termino el producto "+getNombre()+" iremos por mas, 5 unidades de tiempo.");
            Thread.sleep(5000);
        }    
    }
    
    @Override
    public Double getPrecio(){
        return 2.5;
    }

    @Override
    public String getNombre(){
        return "Jamon";
    }
}
