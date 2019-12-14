package Ventanas;




public class Alimento1 {

    public static class Alimentos implements Comparable<Alimentos>{
        
       

        public String alimento;
        public float carb, vb12, prot, fib, cal, hie, magn, sod, pot, vb1, vb2, vbc;
        
        
        
        //constructor
        public Alimentos(String alimento, float carb, float prot, float fib, float cal, float hie, float magn, float sod, float pot, float vb1, float vb2, float vb12, float vbc) {
            this.alimento = alimento;
            this.carb = carb;
            this.vb12 = vb12;
            this.prot = prot;
            this.fib = fib;
            this.cal = cal;
            this.hie = hie;
            this.magn = magn;
            this.sod = sod;
            this.pot = pot;
            this.vb1 = vb1;
            this.vb2 = vb2;
            this.vbc = vbc;
            
        }

        
        
        //metodo para comparar, se hace una variable para que referencie el valor a comparar
        @Override
       public int compareTo(Alimentos o) {
            if (carb < o.carb) {
                return -1;
            }
            if (carb > o.carb) {
                return 1;
            }
            return 0;
        }
       
       public static void selectionSort(Alimentos[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               int min = i;
               for (int j = i + 1; j < arreglo.length; j++) {
                   if(arreglo[j].carb < arreglo[min].carb){
                       min = j;
                   }
               }
               Alimentos temp =  arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
           }
       }
       
       public int compareToProt(Alimentos o) {
            if (prot < o.prot) {
                return -1;
            }
            if (prot > o.prot) {
                return 1;
            }
            return 0;
        }
       
       public static void selectionSortProt(Alimentos[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               int min = i;
               for (int j = i + 1; j < arreglo.length; j++) {
                   if(arreglo[j].prot < arreglo[min].prot){
                       min = j;
                   }
               }
               Alimentos temp =  arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
           }
       }
       
       public int compareToFfibra(Alimentos o) {
            if (fib < o.fib) {
                return -1;
            }
            if (fib > o.fib) {
                return 1;
            }
            return 0;
        }
       
       public static void selectionSortFibra(Alimentos[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               int min = i;
               for (int j = i + 1; j < arreglo.length; j++) {
                   if(arreglo[j].fib < arreglo[min].fib){
                       min = j;
                   }
               }
               Alimentos temp =  arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
           }
       }
       
       public int compareToCalcio(Alimentos o) {
            if (cal < o.cal) {
                return -1;
            }
            if (cal > o.cal) {
                return 1;
            }
            return 0;
        }
       
       public static void selectionSortCalcio(Alimentos[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               int min = i;
               for (int j = i + 1; j < arreglo.length; j++) {
                   if(arreglo[j].cal < arreglo[min].cal){
                       min = j;
                   }
               }
               Alimentos temp =  arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
           }
       }
       
       public int compareToHierro(Alimentos o) {
            if (hie < o.hie) {
                return -1;
            }
            if (hie > o.hie) {
                return 1;
            }
            return 0;
        }
       
       public static void selectionSortHierro (Alimentos[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               int min = i;
               for (int j = i + 1; j < arreglo.length; j++) {
                   if(arreglo[j].hie < arreglo[min].hie){
                       min = j;
                   }
               }
               Alimentos temp =  arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
           }
    }
       
       public int compareToMagnesio(Alimentos o) {
            if (magn < o.magn) {
                return -1;
            }
            if (magn > o.magn) {
                return 1;
            }
            return 0;
        }
       
       public static void selectionSortMagnesio (Alimentos[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               int min = i;
               for (int j = i + 1; j < arreglo.length; j++) {
                   if(arreglo[j].magn < arreglo[min].magn){
                       min = j;
                   }
               }
               Alimentos temp =  arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
           }
    }
       
        public int compareToSodio(Alimentos o) {
            if (sod < o.sod) {
                return -1;
            }
            if (sod > o.sod) {
                return 1;
            }
            return 0;
        }
       
       public static void selectionSortSodio (Alimentos[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               int min = i;
               for (int j = i + 1; j < arreglo.length; j++) {
                   if(arreglo[j].sod < arreglo[min].sod){
                       min = j;
                   }
               }
               Alimentos temp =  arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
           }
    }
    
        public int compareToPotasio(Alimentos o) {
            if (pot < o.pot) {
                return -1;
            }
            if (pot > o.pot) {
                return 1;
            }
            return 0;
        }
       
       public static void selectionSortPotasio(Alimentos[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               int min = i;
               for (int j = i + 1; j < arreglo.length; j++) {
                   if(arreglo[j].pot < arreglo[min].pot){
                       min = j;
                   }
               }
               Alimentos temp =  arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
           }
    }
     
       public int compareToVb1(Alimentos o) {
            if (vb1 < o.vb1) {
                return -1;
            }
            if (vb1 > o.vb1) {
                return 1;
            }
            return 0;
        }
       
       public static void selectionSortVb1(Alimentos[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               int min = i;
               for (int j = i + 1; j < arreglo.length; j++) {
                   if(arreglo[j].vb1 < arreglo[min].vb1){
                       min = j;
                   }
               }
               Alimentos temp =  arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
           }
    }
       
    public int compareToVb2(Alimentos o) {
            if (vb2 < o.vb2) {
                return -1;
            }
            if (vb2 > o.vb2) {
                return 1;
            }
            return 0;
        }
       
       public static void selectionSortVb2(Alimentos[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               int min = i;
               for (int j = i + 1; j < arreglo.length; j++) {
                   if(arreglo[j].vb2 < arreglo[min].vb2){
                       min = j;
                   }
               }
               Alimentos temp =  arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
           }
    }

       public int compareToVb12(Alimentos o) {
            if (vb12 < o.vb12) {
                return -1;
            }
            if (vb12 > o.vb12) {
                return 1;
            }
            return 0;
        }
       
       public static void selectionSortVb12(Alimentos[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               int min = i;
               for (int j = i + 1; j < arreglo.length; j++) {
                   if(arreglo[j].vb12 < arreglo[min].vb12){
                       min = j;
                   }
               }
               Alimentos temp =  arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
           }
    }
       
       public int compareToVbC(Alimentos o) {
            if (vbc < o.vbc) {
                return -1;
            }
            if (vbc > o.vbc) {
                return 1;
            }
            return 0;
        }
       
       public static void selectionSortVbC(Alimentos[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               int min = i;
               for (int j = i + 1; j < arreglo.length; j++) {
                   if(arreglo[j].vbc < arreglo[min].vbc){
                       min = j;
                   }
               }
               Alimentos temp =  arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
           }
    }
   public static void imprimirArregloAlimentos(Alimentos[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(" - " + "." + arreglo[i].alimento + " - Carbohidratos:" + arreglo[i].carb + " - Vitamina B12:" + arreglo[i].vb12 + " - Proteina" + arreglo[i].prot + " - Fibra:" + arreglo[i].fib + " - Calcio:" + arreglo[i].cal + " - Hierro:" + arreglo[i].hie + " - Magensio:" + arreglo[i].magn + " - Sodio:" + arreglo[i].sod + " - Potasio:" + arreglo[i].pot + "Vitamina B1:" + arreglo[i].vb1 + " - Vitamina B2:" + arreglo[i].vb2 + " - Vitamina C" + arreglo[i].vbc);
        }
    } 
    
     public static Alimentos arregloAlimentos[] = {
        new Alimentos("Fresas", 2.91f, 0f, 1.85f, 1.67f, 4.10f, 6.13f, 41.25f, .09f, 8.25f, 6.67f, 6.67f, 56.22f), 
        new Alimentos("Naranja", 1.85f, 0f, 1.72f, 5.6f, 2.15f, 5.75f, 49.25f, .09f, 8.05f, 2.5f, 3.85f, 61.03f),
        new Alimentos("Platano", 6.67f, 0f, 2.25f, 8.5f, .73f, 7.38f, 92.5f, .06f, 18.5f, 4.17f, 5.38f, 12.78f),
        new Alimentos("Melon", 4.05f, 0f, 1.87f, 2.43f, 1.56f, 4.38f, 77.5f, 1.06f, 15.5f, 4.17f, .77f, 35.67f),
        new Alimentos("Manzana", 3.72f, 0f, .66f, 6.73f, .55f, 7f, 30f, .07f, 6f, 3.33f, 2.31f, 13.78f),
        new Alimentos("Papaya", 3.2f, 0f, 1.27f, 6f, 2.4f, 1.25f, 64.25f, .19f, 12.85f, 2.25f, 2.46f, 68.67f),
        new Alimentos("Pera", 3.46f, 0f, .91f, 7.33f, .96f, 3.75f, 29f, .13f, 5.8f, 1.67f, 2.31f, 5.78f),
        new Alimentos("Piña", 3.4f, 0f, .93f, 6.33f, 1.45f, 5.13f, 43.75f, .13f, 8.75f, 6.67f, 2.31f, 16.66f),
        new Alimentos("Guayaba", 3.88f, 0f, 1.74f, 18f, 1.7f, 7.5f, 72.5f, .25f, 14.5f, 2.5f, 21000f, 303.33f),
        new Alimentos("Moras", 2.04f, 0f, 2.53f, 10.53f, 4.4f, 11.25f, 47.5f, .15f, 9.5f, 2.5f, 3.08f, 18.89f),
        new Alimentos("Durazno", 9.5f, 0f, 0.9f, 1.5f, 0f, 0f, 0f, 0f, 0.01f, 0f, 0f, 0f),
        new Alimentos("Mango", 4.18f, 0f, 1.34f, 5.67f, 1.2f, 5f, 42.5f, .31f, 8.5f, 4.17f, 3.85f, 41.11f),
        new Alimentos("Elote", 27.94f, 0f, 17.82f, 28.5f, 1.5f, 53.75f, 82.5f, .38f, 16.5f, 10.83f, 6.15f, 0f),
        new Alimentos("Chile", 0.85f, 0f, 1.7f, 6.33f, 3f, 15f, 55f, .44f, 11f, 5.83f, 6.15f, 133.33f),
        new Alimentos("Tomate", 1.14f, 0f, 1.87f, 4.67f, 1.06f, 8.75f, 60.5f, .56f, 20.54f, 5.83f, 0f, 29.56f),
        new Alimentos("Cebolla", 1.73f, 0f, 2.53f, 6f, 2.54f, 3.38f, 40.5f, .19f, .16f, 5.83f, 2.31f, 7.67f),
        new Alimentos("Brocoli", .87f, 0f, 7.55f, 10f, 5.8f, 10.75f, 69.75f, 1.38f, 15.89f, 7.5f, 13.85f, 111.11f),
        new Alimentos("Aguacate", .13f, 0f, 3.99f, 21.1f, 1.2f, 6.13f, 121.75f, .29f, 1.33f, 6.67f, 6.15f, 6.67f),
        new Alimentos("Papa", 4.83f, 0f, 4.97f, 6.9f, .64f, 5.38f, 104.5f, .17f, 9.67f, 9.17f, 3.85f, 18.89f),
        new Alimentos("Calabaza", 1.5f, 0f, 2.4f, 7.2f, 2.2f, 10f, 76f, .19f, 14.18f, 4.17f, 5.38f, 13.33f),
        new Alimentos("Zanahoria", 1.55f, 0f, 1.43f, 2.07f, 2.7f, 6.25f, 54.75f, 3.25f, 48.56f, 5f, 4.62f, 4.22f),
        new Alimentos("Apio", .81f, 0f, 2.53f, 4.67f, 4.1f, 5f, 80f, 6.25f, .92f, 4.17f, 6.15f, 4.44f),
        new Alimentos("Lechuga", .46f, 0f, 2.91f, 5f, 3.47f, 12.5f, 55f, .19f, 20.78f, 5f, 5.38f, 14.44f),
        new Alimentos("Champiñones", .18f, 0f, 9.02f, 7.2f, 1.08f, 12.5f, 97.5f, .49f, 0f, 8.33f, 23.85f, 4.44f),
        new Alimentos("Res", 0.0f, 2.6f, 19.0f, 0.0f, 0.0f, 2.6f, 21.0f, 72.0f, 318.0f, 0.05f, 0.14f, 0.0f),
        new Alimentos("Pescado", 0.0f, 1.58f, 20.08f, 0.0f, 10.0f, 0.56f, 27.0f, 52.0f, 302.0f, 0.04f, 0.06f, 0.0f),
        new Alimentos("Atun", 0f, 0f, 18.9f, 0f, 0.01f, 0.08f, 0.02f, 0.3f, 0.1f, 0f, 0f, 0f),
        new Alimentos("Cerdo", 0.0f, 2.1f, 36.64f, 0.0f, 0.0f, 0.9f, 13.0f, 515.0f, 470.0f, 0.79f, 0.2f, 0.0f),
        new Alimentos("Pollo", 0f, 12f, 32.7f, 0f, 0f, 0.7f, 0f, 396f, 254f, 13f, 24.6f, 0f),
        new Alimentos("Mariscos", 0.0f, 4.10f, 18.1f, 0.0f, 80.0f, 1.6f, 36.0f, 192.0f, 254.0f, 0.09f, 0.0f, 0.0f),
        new Alimentos("Pasta", 23.15f, 0f, 27.12f, 11.8f, 2.4f, 22.5f, 59f, .44f, 0f, 7.5f, 4.62f, 0f),
        new Alimentos("Pan", 52f, 0f, 7.5f, 3.5f, 0.2f, 0.03f, 0.02f, 0.5f, 0.03f, 0f, 0f, 0f),
        new Alimentos("Quinoa", 68.9f, 0.0f, 27.8f, 23.33f, 127.0f, 12.0f, 697.0f, 11.5f, 697.0f, 0.3f, 0.3f, 0.0f),
        new Alimentos("Arroz", 26.64f, 0f, 14.15f, 5.45f, 1.4f, 10f, 27.25f, .24f, 0f, 4.17f, 3.08f, 0f),
        new Alimentos("Trigo", 9.99f, 0f, 60.69f, 49.65f, 4.9f, 106.25f, 248.25f, .31f, 1.14f, 166.67f, 55.38f, 0f),
        new Alimentos("Maiz", 5.94f, 0f, 7.04f, 10f, .3f, 7.5f, 50f, 19f, 2f, 3.33f, 6.15f, 1.11f),
        new Alimentos("Frijoles", 62.4f, 0.0f, 21.6f, 15.2f, 123.0f, 5.0f, 1483.0f, 5.0f, 1483.0f, 0.9f, 2.0f, 0.0f),
        new Alimentos("Soya", 6.29f, 0.0f, 34.74f, 22.0f, 201.0f, 6.6f, 1799.0f, 4.7f, 1799.0f, 0.61f, 0.27f, 3.0f),
        new Alimentos("Alubias", 54.8f, 0.0f, 21.4f, 21.3f, 0.0f, 6.2f, 163.0f, 0.0f, 1160.0f, 0.5f, 2.4f, 0.0f),
        new Alimentos("Lentejas", 19.5f, 0f, 9f, 7.9f, 0.01f, 0.03f, 0.03f, 0.2f, 0.3f, 0f, 0f, 0f),
        new Alimentos("Habas", 19.6f, 0f, 7.6f, 5.4f, 0f, 0f, 0f, 0.1f, 0.02f, 0f, 0f, 0f),
        new Alimentos("Ejotes", 25f, 0f, 8.6f, 8.8f, 0f, 0f, 0f, 0.4f, 0.4f, 0f, 0f, 0f),
        new Alimentos("Garbanzos", 44.0f, 0.0f, 20.8f, 15.5f, 143.0f, 6.8f, 875.0f, 25.0f, 875.5f, 0.45f, 0.14f, 4.1f),
        new Alimentos("Cacahuates", 4.6f, 0f, 8.4f, 2.8f, 0.01f, 0f, 0.05f, 0.1f, 0.02f, 0f, 0f, 0f),
        new Alimentos("Leche", 4.8f, 0f, 3.1f, 0f, 0.1f, 0f, 0.01f, 0.1f, 0.1f, 0f, 0f, 0f),
        new Alimentos("Huevo", 1.1f, 0f, 12.6f, 0f, 0.05f, 0f, 0f, 0.1f, 0.01f, 0f, 0f, 0f),
        new Alimentos("Miel", 82.4f, 0f, 0.3f, 0.2f, 0f, 0f, 0f, 0.1f, 0.05f, 0f, 0f, 0f),
        new Alimentos("Queso", 5.6f, 0f, 21.6f, 0f, 0.6f, 0f, 0.02f, 0.6f, 0.05f, 0f, 0f, 0f),
        new Alimentos("Yogurt", 11.4f, 0f, 8.5f, 0f, 0.02f, 0f, 0f, 0.1f, 0.03f, 0f, 0f, 0f),
        new Alimentos("Palomitas", 77.9f, 0f, 12.9f, 14.5f, 0f, 0.01f, 0.1f, 0.03f, 0f, 0f, 0f, 0f),
        new Alimentos("Chocolate", 76.4f, 0f, 2.4f, 1.7f, 0.04f, 0f, 0.03f, 0.1f, 0.01f, 0f, 0f, 0f),
        new Alimentos("Galletas", 63.9f, 0f, 5.1f, 2.4f, 0.02f, 0f, 0f, 0.3f, 0.01f, 0f, 0f, 0f)
        };

    public static void main(String[] args) {
        System.out.println("Arreglo Normal");
        imprimirArregloAlimentos(arregloAlimentos);

        System.out.println("");
        Alimentos.selectionSort(arregloAlimentos);
        System.out.println("Arreglo Ordenado");
        imprimirArregloAlimentos(arregloAlimentos);
        

    }

        public String getAlimento() {
            return alimento;
        }

        public void setAlimento(String alimento) {
            this.alimento = alimento;
        }

        public float getCarb() {
            return carb;
        }

        public void setCarb(float carb) {
            this.carb = carb;
        }

        public float getVb12() {
            return vb12;
        }

        public void setVb12(float vb12) {
            this.vb12 = vb12;
        }

        public float getProt() {
            return prot;
        }

        public void setProt(float prot) {
            this.prot = prot;
        }

        public float getFib() {
            return fib;
        }

        public void setFib(float fib) {
            this.fib = fib;
        }

        public float getCal() {
            return cal;
        }

        public void setCal(float cal) {
            this.cal = cal;
        }

        public float getHie() {
            return hie;
        }

        public void setHie(float hie) {
            this.hie = hie;
        }

        public float getMagn() {
            return magn;
        }

        public void setMagn(float magn) {
            this.magn = magn;
        }

        public float getSod() {
            return sod;
        }

        public void setSod(float sod) {
            this.sod = sod;
        }

        public float getPot() {
            return pot;
        }

        public void setPot(float pot) {
            this.pot = pot;
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

        public float getVbc() {
            return vbc;
        }

        public void setVbc(float vbc) {
            this.vbc = vbc;
        }
    

}
}
