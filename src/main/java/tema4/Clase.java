package tema4;

public class Clase<T> {
    private T objeto;

    public Clase(T objeto) {
        this.objeto = objeto;
    }

    public void mostrarTipo(){
        // muestra el nombre de la clase que implementa este objeto
        System.out.println("T es un: " + objeto.getClass().getName());
    }
}
