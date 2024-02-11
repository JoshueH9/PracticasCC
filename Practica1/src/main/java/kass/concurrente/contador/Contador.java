package kass.concurrente.contador;

public class Contador implements Runnable {
    public static final int RONDAS = 10000;
    private int valor;

    /** Metodo constructor. */
    public Contador() {
        this.valor = 0;
    }

    /**
     * Metodo que obtiene el valor.
     * @return El valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * Metodo que asigna un nuevo valor.
     * @param valor El nuevo valor
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public void run() {
        System.out.println("DENTRO RUN");
        suma();
    }

    /**
     * Metodo que suma
     */
    public void suma() {
        long ID = Thread.currentThread().getId();

        for(int i = 0; i < RONDAS; ++i){
            try {
                if(ID % 2 == 0)
                    Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }            
            valor = valor + 1;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Contador c = new Contador();

        Thread h1 = new Thread(c,"1");
        Thread h2 = new Thread(c,"2");
        Thread h3 = new Thread(c,"3");

        h1.start();h2.start();h3.start();

        h1.join();h2.join();h3.join();

        System.out.println("EL VALOR ES: " + c.getValor());
    }
}
