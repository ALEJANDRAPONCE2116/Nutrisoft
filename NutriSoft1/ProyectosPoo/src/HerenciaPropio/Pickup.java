package HerenciaPropio;

// @Alejandra Ponce de Leon Carrasco
// @Ernesto Domínguez Meléndez
// @Luis Eduardo Valenzuela García

/* SUBCLASE */

public class Pickup extends Automovil {
    
    private float tamañoDeCarga;
    private boolean todoterreno;
    
    public Pickup() {
        super();
        tamañoDeCarga = 1.5f;
        todoterreno = true;
    }
    
    public Pickup(String marca, float precio, String color, byte numeroDePuertas, float tamañoDeCarga, boolean todoterreno) {
        super(marca, precio, color, numeroDePuertas);
        this.tamañoDeCarga = tamañoDeCarga;
        this.todoterreno = todoterreno;
    }

    // Redefinición de otros métodos
    public void guardarDatos(String marca, float precio, String color, byte numeroDePuertas, float tamañoDeCarga, boolean todoterreno) {
        super.guardarDatos(marca, precio, color, numeroDePuertas);
        this.tamañoDeCarga = tamañoDeCarga;
        this.todoterreno = todoterreno;
    }
    
    public String obtenerDatos() {
        return super.obtenerDatos() + 
               "\nTamaño de carga (toneladas): " + tamañoDeCarga + "tn" +
               "\nTodoterreno: " + todoterreno;
    }
}