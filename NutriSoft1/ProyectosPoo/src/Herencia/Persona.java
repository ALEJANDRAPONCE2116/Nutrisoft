package Herencia;

public class Persona {
    
    private String nombre;
    private char sexo;
    private byte edad;
    public Persona() {
        nombre = "Alejandra";
        sexo = 'F';
        edad = 20;
    }
    
    public Persona(String nombre, char sexo, byte edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
    public void guardarDatos(String nombre, char sexo, byte edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    public String obtenerDatos() {
        return "Nombre: " + nombre +"\nSexo: " + sexo + "\nEdad: " + edad;
    }
}