package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {

    public void mostrarServicios() {

        RutaGastronomica ruta1 = new RutaGastronomica("Sabores del Sur", 3, 4);
        RutaGastronomica ruta2 = new RutaGastronomica("Tour de Comidas Típicas", 2, 3);

        PaseoLacustre paseo1 = new PaseoLacustre("Paseo por el Lago Llanquihue", 2, "Lancha");
        PaseoLacustre paseo2 = new PaseoLacustre("Navegación al Atardecer", 1, "Catamarán");

        ExcursionCultural excursion1 = new ExcursionCultural("Historia de Frutillar", 3, "Teatro del Lago");
        ExcursionCultural excursion2 = new ExcursionCultural("Recorrido Patrimonial", 2, "Museo Colonial Alemán");

        System.out.println(ruta1);
        System.out.println();
        System.out.println(ruta2);
        System.out.println();
        System.out.println(paseo1);
        System.out.println();
        System.out.println(paseo2);
        System.out.println();
        System.out.println(excursion1);
        System.out.println();
        System.out.println(excursion2);
    }
}