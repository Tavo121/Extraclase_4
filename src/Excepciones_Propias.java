import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

/**
 * En esta clase se realizan diferentes ejemplos de exceptions generadas propias.
 */
public class Excepciones_Propias {

    /**
     * En este metodo se realiza un ejemplo de bloque try catch
     */
    public static void selfTry(){
        try {
            ArrayList list = new ArrayList(4);//se crea un array con 4 espacios null
            for (int a=0; a <=5; a++){//se fuerza una exception sobre el indice del array
                list.get(a);
            }

        }catch (Exception e){//captura de exception
            System.out.println("Exception capturada try");
            e.printStackTrace();
        }
    }

    /**
     * En este metodo se realiza un ejemplo de la estructura throw
     * @throws IOException exception que se va a lanzar por el metodo
     */
    public static void selfThrow() throws IOException {
        Socket socket = new Socket();
        socket.getOutputStream();//se fuerza una exception al buscar el canal de salida del socket
    }

    /**
     * En este metodo se realiza un ejemplo de la estructura finally parte de un try catch
     */
    public static void selfFinally(){
        try {
            System.out.println("Iniciando self finally");
            System.out.println("Realizando conteo de string");
            String name = "Nombre";
            for (int i = 0; i<=6; i++){//se fuerza una exception sobre el indice del string creado
                name.charAt(i);
            }

        }catch (Exception e){//se captura la exception generada y se imprime
            System.out.println("Catch self finally");
            e.printStackTrace();

        }finally {//el bloque finally siempre se ejecuta en el codigo
            System.out.println("Finally self finally");
        }
    }

    public static void main(String[] args) {
        //ejemplo try
        selfTry();
        System.out.println("Fin Try------------------------------------------------------");
        System.out.println("");

        //ejemplo throw
        try {
            selfThrow();
        }catch (IOException e){
            System.out.println("Exception capturada Throw");
            e.printStackTrace();
        }
        System.out.println("Fin throw------------------------------------------------------");
        System.out.println("");

        //ejemplo finally
        selfFinally();
        System.out.println("Fin Finally------------------------------------------------------");
    }
}
