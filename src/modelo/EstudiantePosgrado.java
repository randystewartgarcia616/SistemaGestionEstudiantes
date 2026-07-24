package modelo;

//Clase derivada que hereda atributos y métodos de la clase Estudiante
public class EstudiantePosgrado extends Estudiante {

    //Atributos exclusivos de los estudiantes de posgrado
    private String nivelPosgrado;
    private String temaInvestigacion;

    //Constructor de la clase derivada
    public EstudiantePosgrado(
            String matricula,
            String nombre,
            String carrera,
            double promedio,
            String nivelPosgrado,
            String temaInvestigacion
    ) {
        //Llamada al constructor de la clase base Estudiante
        super(matricula, nombre, carrera, promedio);

        this.nivelPosgrado = nivelPosgrado;
        this.temaInvestigacion = temaInvestigacion;
    }

    //Sobrescritura del metodo mostrarDatos de la clase base
    @Override
    public void mostrarDatos() {
        //Reutiliza el metodo de la clase Estudiante
        super.mostrarDatos();

        //Muestra los atributos exclusivos de esta clase
        System.out.println("Nivel de posgrado: " + nivelPosgrado);
        System.out.println("Tema de investigacion: "+ temaInvestigacion);
    }

        //Metodo exclusivo de la clase EstudiantePosgrado
        public void mostrarInvestigacion() {
            System.out.println(
                    getNombre() + " estudia un programa de " + nivelPosgrado +
                            " y desarrolla la investigación: " + temaInvestigacion + "."
            );
    }
}