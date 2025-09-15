package archivos.servicio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ArchivoServicio {
    public void escribirCSV(String rutaArchivo, List<String[]> datos){
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))){
            for(String[] fila : datos){
                pw.println(String.join(",", fila));
            }

        } catch (IOException e){
            throw new RuntimeException("Error al escribir CSV", e);
        }
    }
}
