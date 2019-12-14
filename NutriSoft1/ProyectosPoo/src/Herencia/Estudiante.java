package Herencia;

public class Estudiante extends Persona {
    
    private int numcontrol;
    private String carrera;
    
    public Estudiante() {
        super();
        numcontrol = 18550720;
        carrera = "Ingeniería en Sistemas Computacionales";
    }
    
    public Estudiante(int numcontrol, String nombre, char sexo, byte edad, String carrera) {
        super(nombre, sexo, edad);
        this.numcontrol = numcontrol;
        this.carrera = carrera;
    }
    public int getNumeroDeControl() {
        return numcontrol;
    }

    public void setNumeroDeControl(int numcontrol) {
        this.numcontrol = numcontrol;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    // Redefinición de otros métodos
    public void guardarDatos(int numc, String nombre, char sexo, byte edad, String carr) {
        super.guardarDatos(nombre, sexo, edad);
        this.numcontrol = numc;
        this.carrera = carr;
    }
    
    public String obtenerDatos() {
        return "Número de control: " + numcontrol + "\n" + super.obtenerDatos() + "\nCarrera: " + carrera + "\n\n";
    }
}