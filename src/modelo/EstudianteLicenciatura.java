package modelo;

//Clase derivada que hereda atributos y metodos de la clase Estudiante
public class EstudianteLicenciatura extends Estudiante {

    //Atributos exclusivos de los estudiantes de licenciatura
    private int semestre;
    private int creditosCursados;

    //Constructor de la clase derivada
    public EstudianteLicenciatura(
            String matricula,
            String nombre,
            String carrera,
            double promedio,
            int semestre,
            int creditosCursados
    ) {

        //Llamada al constructos de la clase base Estudiante
        super(matricula, nombre, carrera, promedio);

        this.semestre = semestre;
        this.creditosCursados = creditosCursados;
    }

    //Sobrescritura del metodo mostrarDatos de la clase base
    @Override
    public void mostrarDatos() {
        //Reutiliza el metodo de la clase Estudiante
        super.mostrarDatos();

        //Muestra los atributos exclusivos de esta clase
        System.out.println("Semestre: " + semestre);
        System.out.println("Créditos cursados: " + creditosCursados);
    }

    //Metodo exclusivo de la clase EstudianteLicenciatura
    public void mostrarAvanceAcademico() {
        System.out.println(
                getNombre() + " cursa el semestre " + semestre +
                        " y ha completado " + creditosCursados + " créditos."
        );
    }
}