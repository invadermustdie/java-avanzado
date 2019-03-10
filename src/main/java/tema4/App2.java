package tema4;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {

        /*
        //List lista = new ArrayList();
        List<String> lista = new ArrayList();
        lista.add("Alejandro");
        //lista.add(2);
        lista.add("Pepe");
        //lista.add(true);

        System.out.println(lista);
        */

        //prueba de diferentes esteriotipos
//        Clase clase = new Clase("Alejandr", 23, "pepe", true);
//        clase.mostrarTipo();

        // lista de clase
        List <Clase> lista = new ArrayList<>();
        lista.add(new Clase("Alejandro", "cece", 23, 12));
        for (Clase c:lista){
            c.mostrarTipo();
        }
    }
}
