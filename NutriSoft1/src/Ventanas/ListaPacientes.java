package Ventanas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaPacientes {

    private NodoPacientes inicio = null, fin = null;

    public ListaPacientes() {
        inicio = null;
        fin = null;
    }

    public boolean vaciaono() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void limpiar() {
        inicio = null;
        fin = null;
    }

    public void añadir(NodoPacientes nodNuevo) {
        //primero debemos ver si la lista esta vacia
        if (vaciaono()) {
            inicio = nodNuevo;
            fin = nodNuevo;
        } else {
            fin.setSig(nodNuevo);
            fin = nodNuevo;
        }
    }

    public int numNodos() {
        int conta = 0;
        NodoPacientes temp = inicio;
        while (temp != null) {
            conta++;
            temp = temp.getSig();
        }
        return conta;
    }

    public void borraren(int posi) throws Exception {
        try {
            if (vaciaono() == true) {
                try {
                    throw new Exception("La lista está vacía");
                } catch (Exception ex) {
                    Logger.getLogger(ListaPacientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            int iTama = numNodos();
            if ((posi < 0) || posi >= iTama) {
                throw new Exception("La posición es inválida");
            }
            if (iTama == 1) {//SÓLO HAY UN NODO
                limpiar();
            } else {
                if (posi == 0) {//BORRAR EL PRIMER NODO
                    inicio = inicio.getSig();
                } else {
                    int iCont = 0;

                    NodoPacientes temp = inicio;
                    while (iCont < (posi - 1)) {
                        temp = temp.getSig();
                        iCont++;
                    }
                    temp.setSig(temp.getSig().getSig());
                    if (posi == (iTama - 1)) {
                        fin = temp;
                    }
                }
            }
            if (posi == 0) {
                inicio = inicio.getSig();
            }
            //UN SOLO NODO
            if (numNodos() == 1) {
                inicio = null;
                fin = null;
            }
            //BORRAR LA ULTIMA
        } catch (Exception e) {
            Logger.getLogger(ListaPacientes.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void imprimir() {
        NodoPacientes temp = inicio;
        if (temp != null) {
            System.out.print(temp.nom + "\t" + temp.nPas + "\t" + temp.sex + "\t" + temp.ed + "\t" + temp.pes + "\t" + temp.alt + "\t" + temp.act + "\n");
            temp = temp.getSig();
        }
    }

    public String Imprime() {
        NodoPacientes temp = inicio;
        String info = "";
        if (temp != null) {
            info = temp.nom + "\t" + temp.nPas + "\t" + temp.sex + "\t" + temp.ed + "\t" + temp.pes + "\t" + temp.alt + "\t" + temp.act + "\n";
            temp = temp.getSig();
        }
        return info;
    }
}
