package kass.concurrente.modelo.producto;

/** 
 * Clase que simula un producto Tortilla
 * @author Pedro Joshue Pintor Muñoz
 * @version 1.0 febrero 2024. 
 */
public class Tortilla extends TortillaBolillo{

    public Tortilla() throws InterruptedException{
        setCantidad(getCantidad()-1);
        if(this.getCantidad()<0){
            System.out.println("Se nos termino el producto "+getNombre()+" iremos por mas, 5 unidades de tiempo.");
            Thread.sleep(5000);
        }
    }

    @Override
    public Double getPrecio(){
        return 1.;
    }

    @Override
    public String getNombre(){
        return "Tortilla";
    }
}
