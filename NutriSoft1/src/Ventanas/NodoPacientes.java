package Ventanas;

public class NodoPacientes {

    public String nom, sex, act;
    public int nPas, ed, pes, alt;
    private NodoPacientes sig;

    public NodoPacientes() {
        sig = null;
    }

    public NodoPacientes(String nombre, String sexo, String actividad, int peso, int altura, int nPasi, int edad) {
        nom = nombre;
        sex = sexo;
        act = actividad;
        pes = peso;
        alt = altura;
        nPas = nPasi;
        ed = edad;
        sig = null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public float getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    public float getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public int getnPas() {
        return nPas;
    }

    public void setnPas(int nPas) {
        this.nPas = nPas;
    }

    public int getEd() {
        return ed;
    }

    public void setEd(int ed) {
        this.ed = ed;
    }

    public NodoPacientes getSig() {
        return sig;
    }

    public void setSig(NodoPacientes sig) {
        this.sig = sig;
    }

}
