package Herencia;

/* SUBCLASE */
public class Profesor extends Persona {
    
    // Declaración de atributos
    private int numempleado;
    private String depadmin;
    
    // Constructores
    public Profesor() {
        super();
        numempleado = 4;
        depadmin = "Ciencias básicas";
    }
    
    public Profesor(short numeroDeEmpleado, String departamentoDeAdscripcion, String nombre, char sexo, byte edad) {
        super(nombre, sexo, edad);
        this.numempleado = numeroDeEmpleado;
        this.depadmin = departamentoDeAdscripcion;
    }
    
    public void guardarDatos(short numeroDeEmpleado, String departamentoDeAdscripcion, String nombre, char sexo, byte edad) {
        super.guardarDatos(nombre, sexo, edad);
        this.depadmin = departamentoDeAdscripcion;
        this.numempleado = numeroDeEmpleado;
    }
    
    public String obtenerDatos() {
        return "Número de empleado: " + numempleado + "\n" + 
               super.obtenerDatos() + 
               "\nDepartamento de adscripción: " + depadmin + "\n\n";
    }

    public int getNumempleado() {
        return numempleado;
    }

    public void setNumempleado(int numempleado) {
        this.numempleado = numempleado;
    }

    public String getDepadmin() {
        return depadmin;
    }

    public void setDepadmin(String depadmin) {
        this.depadmin = depadmin;
    }
    
    
    
}