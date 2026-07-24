//Importar la clase Estudiante
import modelo.EstudianteLicenciatura;
import modelo.EstudiantePosgrado;

public class Main {

    //Metodo principal donde inicia la ejecucion del programa
    public static void main(String[] args) {

        //Crear objetos de tipo Estudiante
        EstudianteLicenciatura estudianteLicenciatura =
                new EstudianteLicenciatura(
                "A001",
                "Eufracio Tolentino",
                "Ingenieria en Sistemas",
                9.5,
                        5,
                        180
        );
        EstudiantePosgrado estudiantePosgrado =
                new EstudiantePosgrado(
                "P001",
                "Gisela Colmenares",
                "Tecnoligías de la Información",
                9.7,
                        "Maestría",
                        "Aplicacion de inteligencia artificial en la educación"
        );

        //Metodo que muestra la informacion inicial de los estudiantes
        System.out.println("===== SISTEMA DE GESTION DE ESTUDIANTES =====");

        System.out.println("===== ESTUDIANTE DE LICENCIATURA =====");
        estudianteLicenciatura.mostrarDatos();
        estudianteLicenciatura.mostrarAvanceAcademico();
        System.out.println("===== ESTUDIANTE DE POSGRADO =====");
        estudiantePosgrado.mostrarDatos();
        estudiantePosgrado.mostrarInvestigacion();
        System.out.println("\n===== ACTUALIZANDO INFORMACION =====\n");

        //Metodos heredados de la cale Estudiante
        estudianteLicenciatura.actualizarPromedio(9.8);
        //Metodo que permite cambiar la carrera del estudiante
        estudiantePosgrado.cambiarCarrera("Ciencias Computacionales");

        //Mostrar informacion actualizada
        System.out.println("\n===== LICENCIATURA ACTUALIZADA =====");
        estudianteLicenciatura.mostrarDatos();

        System.out.println("\n===== POSGRADO ACTUALIZADO =====");
        estudiantePosgrado.mostrarDatos();
    }
}