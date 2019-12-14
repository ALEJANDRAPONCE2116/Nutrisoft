package HerenciaPropio;

// @Alejandra Ponce de Leon Carrasco
// @Ernesto Domínguez Meléndez
// @Luis Eduardo Valenzuela García

/* SUBCLASE */

public class Hatchback extends Automovil {
    
    private short tamañoDeCajuela;
    
    public Hatchback() {
        super();
        tamañoDeCajuela = 120;
    }
    
    public Hatchback(String marca, float precio, String color, byte numeroDePuertas, short tamañoDeCajuela) {
        super(marca, precio, color, numeroDePuertas);
        this.tamañoDeCajuela = tamañoDeCajuela;
    }
    
    public short getTamañoDeCajuela() {
        return tamañoDeCajuela;
    }
    
    public void setTamañoDeCajuela(short tamañoDeCajuela) {
        this.tamañoDeCajuela = tamañoDeCajuela;
    }
    
    // Redefinición de otros métodos
    public void guardarDatos(String marca, float precio, String color, byte numeroDePuertas, short tamañoDeCajuela) {
        super.guardarDatos(marca, precio, color, numeroDePuertas);
        this.tamañoDeCajuela = tamañoDeCajuela;
    }
    
    public String obtenerDatos() {
        return super.obtenerDatos() + 
               "\nTamaño de cajuela (litros): " + tamañoDeCajuela + "lt"; 
    }
}