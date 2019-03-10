package tema3;

import com.sun.xml.internal.ws.api.pipe.helper.PipeAdapter;

import java.util.ArrayList;
import java.util.List;

public class PaisDAOImpl {

    private static PaisDAOImpl instancia = null;

    private List paises = null;

    private PaisDAOImpl() {
    }

    public static PaisDAOImpl getInstance() {
        if (instancia == null) {
            instancia = new PaisDAOImpl();
        }
        return instancia;
    }

    public List getPaises() {

        if (paises == null) {
            paises = new ArrayList();
            Pais p1 = new Pais("Bolivia");
            Pais p2 = new Pais("Peru");
            Pais p3 = new Pais("Brasil");

            paises.add(p1);
            paises.add(p2);
            paises.add(p3);
        }
        return paises;
    }
}
