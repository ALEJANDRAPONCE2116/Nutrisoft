
package Ventanas;
public class Alimento {
    public String nombre;
    public float carbohidratos;
    public float proteina;
    public float fibra;
    public float calcio;
    public float hierro;
    public float magnesio;
    public float sodio;
    public float potasio;
    public float vb1;
    public float vb2;
    public float vb12;
    public float vbc;

    public Alimento(float carbohidratos,float vb12,float proteina,float fibra,float calcio,float hierro,float magnesio,float sodio,float potasio,float vb1,float vb2,float vbc) {
        this.carbohidratos=carbohidratos;
        this.vb12=vb12;
        this.proteina=proteina;
        this.fibra=fibra;
        this.calcio=calcio;
        this.hierro=hierro;
        this.magnesio=magnesio;
        this.sodio=sodio;
        this.potasio=potasio;
        this.vb1=vb1;
        this.vb2=vb2;
        this.vbc=vbc;
    }

    public float getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(float carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public float getProteina() {
        return proteina;
    }

    public void setProteina(float proteina) {
        this.proteina = proteina;
    }

    public float getFibra() {
        return fibra;
    }

    public void setFibra(float fibra) {
        this.fibra = fibra;
    }

    public float getCalcio() {
        return calcio;
    }

    public void setCalcio(float calcio) {
        this.calcio = calcio;
    }

    public float getHierro() {
        return hierro;
    }

    public void setHierro(float hierro) {
        this.hierro = hierro;
    }

    public float getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(float magnesio) {
        this.magnesio = magnesio;
    }

    public float getSodio() {
        return sodio;
    }

    public void setSodio(float sodio) {
        this.sodio = sodio;
    }

    public float getPotasio() {
        return potasio;
    }

    public void setPotasio(float potasio) {
        this.potasio = potasio;
    }

    public float getVb1() {
        return vb1;
    }

    public void setVb1(float vb1) {
        this.vb1 = vb1;
    }

    public float getVb2() {
        return vb2;
    }

    public void setVb2(float vb2) {
        this.vb2 = vb2;
    }

    public float getVb12() {
        return vb12;
    }

    public void setVb12(float vb12) {
        this.vb12 = vb12;
    }

    public float getVbc() {
        return vbc;
    }

    public void setVbc(float vbc) {
        this.vbc = vbc;
    }
    
   
    }

