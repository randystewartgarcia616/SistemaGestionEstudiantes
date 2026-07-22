//Importar la clase Estudiante
import modelo.Estudiante;

public class Main {

    //Metodo principal donde inicia la ejecucion del programa
    public static void main(String[] args) {

        //Crear objetos de tipo Estudiante
        Estudiante estudiante1 = new Estudiante(
                "A001",
                "Eufracio Tolentino",
                "Ingenieria en Sistemas",
                9.5
        );
        Estudiante estudiante2 = new Estudiante(
                "A002",
                "Gisela Colemanres",
                "Contaduria",
                8.8
        );
        Estudiante estudiante3 = new Estudiante(
                "A003",
                "Roberto Palos",
                "Administración",
                9.2
        );

        //Metodo que muestra la informacion inicial de los estudiantes
        System.out.println("===== SISTEMA DE GESTION DE ESTUDIANTES =====");

        System.out.println("===== ESTUDIANTE 1 =====");
        estudiante1.mostrarDatos();
        System.out.println("===== ESTUDIANTE 2 =====");
        estudiante2.mostrarDatos();
        System.out.println("===== ESTUDIANTE 3 =====");
        estudiante3.mostrarDatos();
        System.out.println("\n===== ACTUALIZANDO INFORMACION =====\n");

        //Actualizar informacion
        //Metodo que actualiza el promedio del estudiante
        estudiante2.actualizarPromedio(9.6);
        //Metodo que permite cambiar la carrera del estudiante
        estudiante3.cambiarCarrera("Ingenieria Industrial");

        //Mostrar informacion actualizada
        System.out.println("===== ESTUDIANTE 2 (ACTUALIZADO) =====");
        estudiante2.mostrarDatos();

        System.out.println();

        System.out.println("===== ESTUDIANTE 3 (ACTUALIZADO) =====");
        estudiante3.mostrarDatos();
    }
}
