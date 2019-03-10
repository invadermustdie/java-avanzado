package tema3;

public class App {

    public static void main(String[] args) {
//
//        PaisDAOImpl paisDAO = new PaisDAOImpl();
//
//        for (Object o : paisDAO.getPaises()) {
//            System.out.println(((Pais) o).getNombre());
//        }
//
//        System.out.println("----------------------------");
//
//        for (Object o : paisDAO.getPaises()) {
//            System.out.println(((Pais) o).getNombre());
//        }
//
//        PaisDAOImpl paisDAO1 = new PaisDAOImpl();
//
//        for (Object o : paisDAO1.getPaises()) {
//            System.out.println(((Pais) o).getNombre());
//        }

        PaisDAOImpl dao = PaisDAOImpl.getInstance();
        for (Object o : dao.getPaises()) {
            System.out.println(((Pais) o).getNombre());
        }

        System.out.println("---------------------------------");

        PaisDAOImpl dao1 = PaisDAOImpl.getInstance();
        for (Object o : dao1.getPaises()) {
            System.out.println(((Pais) o).getNombre());
        }

    }
}
