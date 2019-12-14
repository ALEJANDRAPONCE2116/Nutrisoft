package Ventanas;

import javax.swing.ImageIcon;

public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);//centrar
        setResizable(false);// no cambiar maximizar
        setTitle("Nutrisoft");//NOMBRE A LA PANTALLA

        setTotalCarbohidratos(); //asigna el valorl progressbar
        setTotalVitb12();
        setTotalProteina();
        setTotalFibra();
        setTotalCalcio();
        setTotalHierro();
        setTotalMagnesio();
        setTotalSodio();
        setTotalPotasio();
        setTotalVitb1();
        setTotalVitb2();
        setTotalVitC();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jpbCarbohidratos = new javax.swing.JProgressBar();
        jpbProteina = new javax.swing.JProgressBar();
        jpbCalcio = new javax.swing.JProgressBar();
        jpbHierro = new javax.swing.JProgressBar();
        jpbFibra = new javax.swing.JProgressBar();
        jpbSodio = new javax.swing.JProgressBar();
        jpbMagnesio = new javax.swing.JProgressBar();
        jpbVB1 = new javax.swing.JProgressBar();
        jpbVB2 = new javax.swing.JProgressBar();
        jpbVB12 = new javax.swing.JProgressBar();
        jpbVC = new javax.swing.JProgressBar();
        btnVolver = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jpbPotasio = new javax.swing.JProgressBar();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Carbohidratos");

        jLabel2.setText("Proteina");

        jLabel3.setText("Fibra");

        jLabel4.setText("Calcio");

        jLabel5.setText("Sodio");

        jLabel6.setText("Hierro");

        jLabel7.setText("Magnesio");

        jLabel8.setText("Vitamina B1");

        jLabel9.setText("Vitamina B2");

        jLabel11.setText("Vitamina B12");

        jLabel12.setText("Vitamina C");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel15.setText("Potasio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(45, 45, 45)
                                .addComponent(jpbMagnesio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(68, 68, 68)
                                .addComponent(jpbSodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(57, 57, 57)
                                .addComponent(jpbPotasio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(32, 32, 32)
                                .addComponent(jpbVB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(32, 32, 32)
                                .addComponent(jpbVB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(25, 25, 25)
                                .addComponent(jpbVB12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(39, 39, 39)
                                .addComponent(jpbVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19)
                                .addComponent(jpbCarbohidratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(jpbProteina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(72, 72, 72)
                                .addComponent(jpbFibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(65, 65, 65)
                                .addComponent(jpbCalcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(65, 65, 65)
                                .addComponent(jpbHierro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbCarbohidratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbProteina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbFibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbCalcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbHierro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbMagnesio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbSodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbPotasio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbVB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbVB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbVB12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpbVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver)
                            .addComponent(btnCerrar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        //new Comidas1().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    //CARBOHIDRATOS 
    private void setTotalCarbohidratos() { //metodo sumar su suma los ejeme los elementos del arreglo
        int totalCartValue = sumarCarbohidratos();
        jpbCarbohidratos.setValue(totalCartValue);
    }

    public int sumarCarbohidratos() {
        int totalCarbohidratos = (int) ListaPrin.lista1.sumarCarboHidratos();  //+aAsigna el valor obtenido del progressbar
        return totalCarbohidratos;
    }

    //VITAMINA B12    m
    private void setTotalVitb12() {
        int totalCartValue = sumarVitb12();
        jpbVB12.setValue(totalCartValue);
    }

    public int sumarVitb12() {
        int totalVitb12 = (int) ListaPrin.lista1.sumarVb12();
        return totalVitb12;
    }

    //PROTEINA
    private void setTotalProteina() {
        int totalCartValue = sumarVitb12();
        jpbProteina.setValue(totalCartValue);
    }

    public int sumarProteina() {
        int totalVitb12 = (int) ListaPrin.lista1.sumarProteina();
        return totalVitb12;
    }

    //FIBRA
    private void setTotalFibra() {
        int totalCartValue = sumarFibra();
        jpbFibra.setValue(totalCartValue);
    }

    public int sumarFibra() {
        int totalVitb12 = (int) ListaPrin.lista1.sumarProteina();
        return totalVitb12;
    }

    //CALCIO
    private void setTotalCalcio() {
        int totalCartValue = sumarCalcio();
        jpbCalcio.setValue(totalCartValue);
    }

    public int sumarCalcio() {
        int totalVitb12 = (int) ListaPrin.lista1.sumarCalcio();
        return totalVitb12;
    }

    //Hierro
    private void setTotalHierro() {
        int totalCartValue = sumarHierro();
        jpbHierro.setValue(totalCartValue);
    }

    public int sumarHierro() {
        int totalVitb12 = (int) ListaPrin.lista1.sumarHierro();
        return totalVitb12;
    }

    //MAGNESIO
    private void setTotalMagnesio() {
        int totalCartValue = sumarMagnesio();
        jpbMagnesio.setValue(totalCartValue);
    }

    public int sumarMagnesio() {
        int totalVitb12 = (int) ListaPrin.lista1.sumarMagnesio();
        return totalVitb12;
    }

    //SODIO
    private void setTotalSodio() {
        int totalCartValue = sumarSodio();
        jpbSodio.setValue(totalCartValue);
    }

    public int sumarSodio() {
        int totalVitb12 = (int) ListaPrin.lista1.sumarSodio();
        return totalVitb12;
    }

    //POTASIO
    private void setTotalPotasio() {
        int totalCartValue = sumarPotasio();
        jpbPotasio.setValue(totalCartValue);
    }

    public int sumarPotasio() {
        int totalVitb12 = (int) ListaPrin.lista1.sumarPotasio();
        return totalVitb12;
    }

    //VITAMINA B1
    private void setTotalVitb1() {
        int totalCartValue = sumarVitb1();
        jpbVB1.setValue(totalCartValue);
    }

    public int sumarVitb1() {
        int totalVitb12 = (int) ListaPrin.lista1.sumarVb1();
        return totalVitb12;
    }

    //VITAMINA B1
    private void setTotalVitb2() {
        int totalCartValue = sumarVitb2();
        jpbVB2.setValue(totalCartValue);
    }

    public int sumarVitb2() {
        int totalVitb12 = (int) ListaPrin.lista1.sumarVb2();
        return totalVitb12;
    }

    //VITAMINA B1
    private void setTotalVitC() {
        int totalCartValue = sumarVitC();
        jpbVC.setValue(totalCartValue);
    }

    public int sumarVitC() {
       int totalVitb12 = (int) ListaPrin.lista1.sumarVC();
        return totalVitb12;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    public static javax.swing.JProgressBar jpbCalcio;
    public static javax.swing.JProgressBar jpbCarbohidratos;
    public static javax.swing.JProgressBar jpbFibra;
    public static javax.swing.JProgressBar jpbHierro;
    public static javax.swing.JProgressBar jpbMagnesio;
    public static javax.swing.JProgressBar jpbPotasio;
    public static javax.swing.JProgressBar jpbProteina;
    public static javax.swing.JProgressBar jpbSodio;
    public static javax.swing.JProgressBar jpbVB1;
    public static javax.swing.JProgressBar jpbVB12;
    public static javax.swing.JProgressBar jpbVB2;
    public static javax.swing.JProgressBar jpbVC;
    // End of variables declaration//GEN-END:variables
}
