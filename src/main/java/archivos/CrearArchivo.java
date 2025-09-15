package archivos;

import archivos.servicio.ArchivoServicio;

import java.util.ArrayList;
import java.util.List;

public class CrearArchivo {
    public static void main(String[] args) {
        String csvArchivo = "C:\\Cursos\\Java\\projects_git\\agenda-personal-excel-gui\\agenda_personal_excel_gui\\archivos\\agenda.csv";

        ArchivoServicio service = new ArchivoServicio();

        List<String[]> datos = new ArrayList<>();
        datos.add(new String[]{"Nombre", "Edad", "Email"});
        datos.add(new String[]{"Ana", "30", "ana@example.com"});
        datos.add(new String[]{"Luis", "25", "luis@example.com"});

        service.escribirCSV(csvArchivo, datos);
    }
}
