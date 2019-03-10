package tema5;

import java.util.ArrayList;
import java.util.List;

public class AppWild {
    public static void main(String[] args) {
        AppWild aw = new AppWild();
        Alumno alumno1 = new Alumno("Alejandro");
        Alumno alumno2 = new Alumno("Cece");
        Alumno alumno3 = new Alumno("Pruebaa");

        Profesor profesor1 = new Profesor("Profe1");
        Profesor profesor2 = new Profesor("Profe2");
        Profesor profesor3 = new Profesor("Profe3");

        //List lista = new ArrayList();
        List<Profesor> lista = new ArrayList();


        lista.add(profesor1);
        lista.add(profesor2);
        lista.add(profesor3);

        //aw.listarUpperBounded(lista);
        //aw.listarLowerBounded(lista);
        aw.listarUnBounded(lista);
    }

    //private void listar(List<Alumno> lista) {
//    private void listar(List<?> lista) {
//        for (Object a : lista) {
//            if (a instanceof Alumno)
//                System.out.println(((Alumno)a).getNombre());
//            else if(a instanceof Profesor)
//                System.out.println(((Profesor)a).getNombre());
//        }
//    }

    // acepta cualquier tipo que sea sub clase de persona
    private void listarUpperBounded(List<? extends Persona> lista) {
        for (Persona persona : lista) {
                System.out.println(persona.getNombre());
            }
    }

    // acepta cualquier tipo de la super clase que se esta indicando
    private void listarLowerBounded(List<Profesor> lista) {
        for (Object alumno : lista) {
            System.out.println(((Persona)alumno).getNombre());
        }
    }


    // no seindica el tipo
    private void listarUnBounded(List<?> lista) {
        for (Object persona: lista) {
            System.out.println(((Persona)persona).getNombre());
        }
    }

}
