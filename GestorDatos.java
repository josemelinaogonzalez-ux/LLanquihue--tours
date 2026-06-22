package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> cargarTours(String ruta) {

        ArrayList<Tour> lista = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 3) {
                    String destino = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[2]);

                    Tour tour = new Tour(destino, tipo, precio);
                    lista.add(tour);
                } else {
                    System.out.println("Línea inválida: " + linea);
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        return lista;
    }
}