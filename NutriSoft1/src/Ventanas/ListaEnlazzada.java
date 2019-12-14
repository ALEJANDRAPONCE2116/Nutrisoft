package Ventanas;

import javax.swing.JOptionPane;

public class ListaEnlazzada {

    public NodoAlimento inicio;
    public int tamanoLista;
    public int siguiente;
     private NodoAlimento fin;
    private NodoAlimento anterior;
    private NodoAlimento cabezaAlimento;
    //otros
    float[] arregloCarb;

    // inicializar lista
    public ListaEnlazzada() {
        tamanoLista = 0;
        cabezaAlimento = null;
    }

    public float sumarCarboHidratos() {
        NodoAlimento actual = inicio;
        float suma = 0;
        for (int i = 0; i < tamanoLista; i++) {
            //float[] carbo = null;
            suma += actual.getCarbohidratos();
            actual = actual.getNext();
        }
        return suma;

    }

    public float sumarProteina() {
        NodoAlimento actual = inicio;
        float suma = 0;
        for (int i = 0; i < tamanoLista; i++) {
            //float[] carbo = null;
            suma += actual.getProteina();
            actual = actual.getNext();
        }
        return suma;
    }

    public float sumarfibra() {
        NodoAlimento actual = inicio;
        float suma = 0;
        for (int i = 0; i < tamanoLista; i++) {
            //float[] carbo = null;
            suma += actual.getFibra();
            actual = actual.getNext();
        }
        return suma;

    }

    public float sumarCalcio() {
        NodoAlimento actual = inicio;
        float suma = 0;
        for (int i = 0; i < tamanoLista; i++) {
            //float[] carbo = null;
            suma += actual.getCalcio();
            actual = actual.getNext();
        }
        return suma;

    }

    public float sumarHierro() {
        NodoAlimento actual = inicio;
        float suma = 0;
        for (int i = 0; i < tamanoLista; i++) {
            //float[] carbo = null;
            suma += actual.getHierro();
            actual = actual.getNext();
        }
        return suma;

    }

    public float sumarMagnesio() {
        NodoAlimento actual = inicio;
        float suma = 0;
        for (int i = 0; i < tamanoLista; i++) {
            //float[] carbo = null;
            suma += actual.getMagnesio();
            actual = actual.getNext();
        }
        return suma;
    }

    public float sumarSodio() {
        NodoAlimento actual = inicio;
        float suma = 0;
        for (int i = 0; i < tamanoLista; i++) {
            //float[] carbo = null;
            suma += actual.getSodio();
            actual = actual.getNext();
        }
        return suma;
    }

    public float sumarPotasio() {
        NodoAlimento actual = inicio;
        float suma = 0;
        for (int i = 0; i < tamanoLista; i++) {
            //float[] carbo = null;
            suma += actual.getPotasio();
            actual = actual.getNext();
        }
        return suma;
    }

    public float sumarVb1() {
        NodoAlimento actual = inicio;
        float suma = 0;
        for (int i = 0; i < tamanoLista; i++) {
            //float[] carbo = null;
            suma += actual.getVb1();
            actual = actual.getNext();
        }
        return suma;
    }

    public float sumarVb2() {
        NodoAlimento actual = inicio;
        float suma = 0;
        for (int i = 0; i < tamanoLista; i++) {
            //float[] carbo = null;
            suma += actual.getVb2();
            actual = actual.getNext();
        }
        return suma;
    }

    public float sumarVb12() {
        NodoAlimento actual = inicio;
        float suma = 0;
        for (int i = 0; i < tamanoLista; i++) {
            //float[] carbo = null;
            suma += actual.getVb12();
            actual = actual.getNext();
        }
        return suma;
    }

    public float sumarVC() {
        NodoAlimento actual = inicio;
        float suma = 0;
        for (int i = 0; i < tamanoLista; i++) {
            //float[] carbo = null;
            suma += actual.getVbc();
            actual = actual.getNext();
        }
        return suma;
    }

    public int findAtCarboHidratos(int pos) {
        //verificar
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return (int) temp.getCarbohidratos();
    }

    public int findAtVB12(int pos) {
        //verificar
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return (int) temp.getVb12();
    }

    public int findAtproteina(int pos) {
        //verificar
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return (int) temp.getProteina();
    }

    public int findAtFibra(int pos) {
        //verificar
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return (int) temp.getFibra();
    }

    public int findAtCalcio(int pos) {
        //verificar
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return (int) temp.getCalcio();
    }

    public int findAtHierro(int pos) {
        //verificar
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return (int) temp.getHierro();
    }

    public int findAtMagnesio(int pos) {
        //verificar
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return (int) temp.getMagnesio();
    }

    public int findAtSodio(int pos) {
        //verificar
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return (int) temp.getSodio();
    }

    public int findAtPotasio(int pos) {
        //verificar
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return (int) temp.getPotasio();
    }

    public int findAtPotasioVb1(int pos) {
        //verificar
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return (int) temp.getVb1();
    }

    public int findAtPotasioVb2(int pos) {
        //verificar
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return (int) temp.getVb2();
    }

    public int findAtPotasioVc(int pos) {
        //verificar
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return (int) temp.getVbc();
    }

    //Agrega elementos a la lista
    public void add(String nombre, float carbohidratos, float vb12, float proteina, float fibra, float calcio, float hierro, float magnesio, float sodio, float potasio, float vb1, float vb2, float vbc) {
        NodoAlimento actual = inicio;
        NodoAlimento anterior = null;
        NodoAlimento nuevoNodo = new NodoAlimento();
        // Setear datos
        nuevoNodo.setNombre(nombre);
        nuevoNodo.setCarbohidratos(carbohidratos); //recibe todos los valores del alomento //el nuevo nodo va a mostrar el atributo carbohidrato
        nuevoNodo.setVb12(vb12);
        nuevoNodo.setProteina(proteina);
        nuevoNodo.setFibra(fibra);
        nuevoNodo.setCalcio(calcio);
        nuevoNodo.setHierro(hierro);
        nuevoNodo.setMagnesio(magnesio);
        nuevoNodo.setSodio(sodio);
        nuevoNodo.setPotasio(potasio);
        nuevoNodo.setVb1(vb1);
        nuevoNodo.setVb2(vb2);
        nuevoNodo.setVbc(vbc);

        //Verifica si la lista esta vacia 
        if (isEmpty()) {
            inicio = nuevoNodo; //el elemento ingresado va a ser el inicio
            tamanoLista++;
        } else {
            for (int i = 0; i < tamanoLista; i++) {
                    if (anterior == null) {
                        nuevoNodo.setNext(actual);
                        inicio = nuevoNodo;
                        tamanoLista++;
                        break;
                    }
                 else  {
                    if (actual.getNext() == null) {
                        actual.setNext(nuevoNodo);
                        nuevoNodo.setNext(null);
                        tamanoLista++;
                        break;
                    }
                    anterior = actual;
                    actual = actual.getNext();

                }
            }
        }

    }

    //imprimir lista
    public void print() {
        NodoAlimento NodoTemporal = inicio;
        if (inicio == null) {
        } else {
            for (int i = 0; i < tamanoLista; i++) {
                NodoTemporal = NodoTemporal.getNext();
            }

        }
        System.out.println();
    }

    //devuelve true si está vacia
    public boolean isEmpty() {
        return (tamanoLista == 0);
    }

    public int size() {
        int iCont = 0;
        NodoAlimento temp = inicio;
        while (temp != null) {
            iCont++;
            temp = temp.getSiguiente();
        }
        return iCont;
    }

    //Vaciar la lista 
    public void Clear(NodoAlimento fin) {
        inicio = null;
        fin = null;
    }

    public void addBegin(NodoAlimento nuevo, NodoAlimento fin) {
        if (isEmpty()) {
            nuevo = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;

        }
    }

    public void insertAt(int pos, NodoAlimento nuevo) throws Exception {// quien use este metodo es responsable de la excepcion que genere
        int iTama = size();
        if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es invalida");
        }
        if (pos == 0) {
            //  addBegin(nuevo);
        } else {
            int iCont = 0;
            NodoAlimento temp = inicio;

            while (iCont < (pos - 1)) {
                temp = temp.getSiguiente();
                iCont++;
            }
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
        }
    }
    public void deleteAt(int pos) {
        // BORRAR LA PRIMERA
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista est+a vacia");
        }
        int iTama = size();
        if ((pos < 0) || (pos >= iTama)) {
            JOptionPane.showMessageDialog(null, "La posicion es invalida");
        }
        if (iTama == 1) {//solo hay un nodo
            Clear(inicio);
        } else {// muchos nodos 
            if (pos == 0)// borrar el primer nodo
            {
                inicio = inicio.getSiguiente();
            } else {
                int iCont = 0;
                NodoAlimento temp = inicio;
                while (iCont < (pos - 1)) {
                    temp = temp.getSiguiente();
                    iCont++;
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if (pos == iTama - 1) {
                    fin = temp;
                }
            }
        }
    }
}
