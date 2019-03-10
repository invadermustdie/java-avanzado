package tema3;

public class Conexion {
    private static Conexion instancia = null;
    public static Conexion getInstance(){
        if(instancia==null){
            // no se ha instanciado
            instancia = new Conexion();
        }
        return instancia;
    }

    // implementacion del patron singleton
    private Conexion(){

    }
}
