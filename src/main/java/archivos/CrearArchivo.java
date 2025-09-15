package archivos;

import archivos.servicio.ArchivoServicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrearArchivo {
    public static void main(String[] args) {
        String csvArchivo = "C:\\Cursos\\Java\\projects_git\\agenda-personal-excel-gui\\agenda_personal_excel_gui\\archivos\\agenda.csv";
        ArchivoServicio service = new ArchivoServicio();
        List<String[]> datos = new ArrayList<>();

//        datos.add(new String[]{"Nombre", "Edad", "Email"});
//        datos.add(new String[]{"Ana", "30", "ana@example.com"});
//        datos.add(new String[]{"Luis", "25", "luis@example.com"});

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n Menu agenda personal");
            System.out.println("1. Agregar Contactos");
            System.out.println("2. Mostrar Contactos");
            System.out.println("3. Guardar en CSV");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1 ->{
                    System.out.println("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    System.out.println("Edad");
                    String edad = scanner.nextLine();
                    datos.add(new String[]{nombre, apellido, email, edad});
                    System.out.println("Contacto Agregado");
                }
                case 2 -> {
                    System.out.println("Mostrar contactos");
                    for(String[] fila : datos){
                        System.out.println(String.join(" | ", fila));
                    }
                }
                case 3 -> {
                    service.escribirCSV(csvArchivo, datos);
                    System.out.println("Archivo CSV guardado en: " + csvArchivo);
                }
                case 4 -> {
                    System.out.println("Saliendo del programa");

                }
                default -> {
                    System.out.println("Opción invalida");
                }
            }
        } while (opcion !=4);

    }
}
