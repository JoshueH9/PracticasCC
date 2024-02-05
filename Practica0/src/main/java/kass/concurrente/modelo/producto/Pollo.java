package kass.concurrente.modelo.producto;

/** 
 * Clase que simula un producto Pollo
 * @author Pedro Joshue Pintor Muñoz
 * @version 1.0 febrero 2024. 
 */
public class Pollo extends Carne{

    public Pollo() throws InterruptedException{      
        setCantidad(getCantidad()-1);
        if(this.getCantidad()<0){
            System.out.println("Se nos termino el producto "+getNombre()+" iremos por mas, 5 unidades de tiempo.");
            Thread.sleep(5000);
        }
    }

    @Override
    public Double getPrecio(){
        return 10.;
    }

    @Override
    public String getNombre(){
        return "Pollo";
    }
}
