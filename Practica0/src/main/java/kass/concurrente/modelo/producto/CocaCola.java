package kass.concurrente.modelo.producto;

/** 
 * Clase que simula un producto CocaCola
 * @author Pedro Joshue Pintor Muñoz
 * @version 1.0 febrero 2024. 
 */
public class CocaCola extends Bebidas{

    public CocaCola() throws InterruptedException{ 
        setCantidad(getCantidad()-1);
        if(this.getCantidad()<0){
            System.out.println("Se nos termino el producto "+getNombre()+" iremos por mas, 5 unidades de tiempo.");
            Thread.sleep(5000);
        }
    }
    
    @Override
    public Double getPrecio(){
        return 15.2;
    }

    @Override
    public String getNombre(){
        return "CocaCola";
    }
}
