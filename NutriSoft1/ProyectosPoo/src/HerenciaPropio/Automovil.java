package HerenciaPropio;

// @Alejandra Ponce de Leon Carrasco
// @Ernesto Domínguez Meléndez
// @Luis Eduardo Valenzuela García

/* SUPERCLASE */

public class Automovil {
    
    private String marca;
    private float precio;
    private String color;
    private byte numeroDePuertas;
    
    public Automovil() {
        marca = "Ford";
        precio = 199999f;
        color = "Plateado";
        numeroDePuertas = 4;
    }
    
    public Automovil(String marca, float precio, String color, byte numeroDePuertas) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.numeroDePuertas = numeroDePuertas;
    }
    
    // Otros métodos
    public void guardarDatos(String marca, float precio, String color, byte numeroDePuertas) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.numeroDePuertas = numeroDePuertas;
    }
    
    public String obtenerDatos() {
        return "Marca: " + marca +
               "\nPrecio: $" + precio +
               "\nColor: " + color + 
               "\nNúmero de puertas: " + numeroDePuertas;
    }
}