import android.util.Log;

/**
 * Created by caro on 12/04/2016.
 */
public class hilo extends Thread {
    //metodo run es la tarea a realizar por el hilo
    @Override
    public void run() {
        super.run();
        //no se interactua directamente con el UI
        //interfaz grafica(UI) es manejada por el hilo pricipal
        // para interactuar necesitan metodos de sincronizacion
        for (int i = 0: i < 500; i++){
            Log.e("HILO 1:", "EL VALOR ES" + i);
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
