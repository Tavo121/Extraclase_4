/**
 * En esta clase se realiza un ejemplo de la estructura finally siendo parte de un try catch
 */
public class Finally {

    /**
     * En este metodo se realiza un ejemplo de el bloque finally, el cual siempre se ejecuta en el codigo.
     */
    public static void finallyExample(){
        try{
            System.out.println("Iniciando ejemplo finally");
            String test = "hola mundo";
            int num = Integer.parseInt(test);//se fuerza una exception para mostrar el bloque catch
            System.out.println("Esto no se imprime");//no se imprime al ocurrir una exception

        }catch (Exception e){//captura la exception lanzada
            System.out.println("Bloque catch ejecutado");

        }finally {//bloque finally siempre se ejecuta
            System.out.println("Bloque finally ejecutado");
        }
    }

    public static void main(String[] args) {//metodo main para realizar las pruebas
        //ejemplo finally
        finallyExample();
    }
}
