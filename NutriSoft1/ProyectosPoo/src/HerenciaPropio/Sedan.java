package HerenciaPropio;

// @Alejandra Ponce de Leon Carrasco
// @Ernesto Domínguez Meléndez
// @Luis Eduardo Valenzuela García

/* SUBCLASE */

public class Sedan extends Automovil {
    
    private boolean quemacocos;
    
    public Sedan() {
        quemacocos = true;
    }
    
    public Sedan(String marca, float precio, String color, byte numeroDePuertas, boolean quemacocos) {
        super(marca, precio, color, numeroDePuertas);
        this.quemacocos = quemacocos;
    }

    // Redefinición de otros métodos
    public void guardarDatos(String marca, float precio, String color, byte numeroDePuertas, boolean quemacocos) {
        super.guardarDatos(marca, precio, color, numeroDePuertas);
        this.quemacocos = quemacocos;
    }
    
    public String obtenerDatos() {
        return super.obtenerDatos() + 
               "\nQuemacocos: " + quemacocos; 
    }
}