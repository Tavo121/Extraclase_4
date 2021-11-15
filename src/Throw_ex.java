/**
 * En esta clase se realizan unos ejemplos de estructuras throw y throws
 */
public class Throw_ex {

    /**
     * Este metodo es un ejemplo throw de java
     */
    public static void throwExample (){
        try{
            throw new NullPointerException("Prueba");//se crea un objeto throwable el cual es la exception

        }catch(NullPointerException e){
            System.out.println("Exepcion capturada");//aviso de exception capturada
            throw e; //detalle de la exception

        }
    }

    /**
     * Este metodo es un ejemplo de throws java
     * @throws IllegalAccessException Exception que se va a lanzar por el metodo.
     */
    public static void throwsExample() throws IllegalAccessException{
        System.out.println("Exception launch");
        throw new IllegalAccessException("Prueba throws"); //se crea un objeto throwable el cual es la exeption
    }


    public static void main(String[] args) {//main para realizar las pruebas
        //ejemplo throw
        throwExample();

        //ejemplo throws
        try{
            throwsExample();

        }catch (IllegalAccessException e){
            System.out.println("Exception capturada (throws)");
            e.printStackTrace();
        }
    }

}
