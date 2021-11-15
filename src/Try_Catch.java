import java.io.IOException;
import java.net.Socket;

/**
 * En esta clase se realiza un ejemplo de la estructura try catch
 */
public class Try_Catch {

    /**
     * En este metodo se realiza un ejemplo de bloques try catch mediante una IOException
     */
    public static void tryExample(){
        try {
            Socket sc = new Socket();//se crea un socket vacio
            sc.getInputStream();//se intenta obtener el canal de recibido de datos

        }catch (IOException e){
            System.out.println("Exception capturada");//aviso de captura de exception
            e.printStackTrace();//detalles de la exception
        }
    }

    public static void main(String[] args) {//metodo para realizar las pruebas
        //ejemplo de bloque try catch
        tryExample();
    }

}
