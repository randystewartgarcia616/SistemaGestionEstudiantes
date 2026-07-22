package modelo;

public class Estudiante {
    // Atributos de la clase
    private String matricula;
    private String nombre;
    private String carrera;
    private double promedio;

    //Constructor de la clase
    public Estudiante(String matricula, String nombre, String carrera, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Metodo para mostrar la informacion del estudiante
    public void mostrarDatos () {
        System.out.println("Martricula; " + matricula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }

    //Metodo que actualiza el promedio del estudiante
    public void actualizarPromedio(double nuevoPromedio) {
        promedio = nuevoPromedio;
    }

    // Metodo que permite cambiar la carrera del estudiante
    public void cambiarCarrera(String nuevaCarrera) {
        carrera = nuevaCarrera;
    }
}
