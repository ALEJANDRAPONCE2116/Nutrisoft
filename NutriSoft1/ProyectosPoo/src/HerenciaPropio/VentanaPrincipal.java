package HerenciaPropio;

// @Alejandra Ponce de Leon Carrasco
// @Ernesto Domínguez Meléndez
// @Luis Eduardo Valenzuela García

/* VENTANA PRINCIPAL*/

public class VentanaPrincipal extends java.awt.Frame {
    
    Pickup pickup;
    Sedan sedan;
    Hatchback hatchback;

    public VentanaPrincipal() {
        initComponents();
        btnGenerarReporte.setEnabled(false);
        this.setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCapturarPickup = new java.awt.Button();
        btnCapturarSedan = new java.awt.Button();
        btnCapturarHatchback = new java.awt.Button();
        btnGenerarReporte = new java.awt.Button();
        txaDatos = new java.awt.TextArea();
        btnLimpiarCampos = new java.awt.Button();

        setResizable(false);
        setTitle("Características de vehículos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        btnCapturarPickup.setLabel("Capturar datos de Pickup");
        btnCapturarPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarPickupActionPerformed(evt);
            }
        });

        btnCapturarSedan.setLabel("Capturar datos de Sedán");
        btnCapturarSedan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarSedanActionPerformed(evt);
            }
        });

        btnCapturarHatchback.setLabel("Capturar datos de Hatchback");
        btnCapturarHatchback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarHatchbackActionPerformed(evt);
            }
        });

        btnGenerarReporte.setLabel("Generar reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        txaDatos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txaDatos.setText("Seleccione el tipo de vehículo del que \ndesea generar un reporte. Solo puede \ngenerarse el reporte de un tipo de \nvehículo a la vez.");

        btnLimpiarCampos.setLabel("Limpiar campos");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGenerarReporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapturarPickup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapturarSedan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapturarHatchback, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCapturarPickup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCapturarSedan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCapturarHatchback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void btnCapturarPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarPickupActionPerformed
        pickup = new Pickup();
        new VentanaPickup(pickup).setVisible(true);
        btnGenerarReporte.setEnabled(true);
    }//GEN-LAST:event_btnCapturarPickupActionPerformed

    private void btnCapturarSedanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarSedanActionPerformed
        sedan = new Sedan();
        new VentanaSedan(sedan).setVisible(true);
        btnGenerarReporte.setEnabled(true);
    }//GEN-LAST:event_btnCapturarSedanActionPerformed

    private void btnCapturarHatchbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarHatchbackActionPerformed
        hatchback = new Hatchback();
        new VentanaHatchback(hatchback).setVisible(true);
        btnGenerarReporte.setEnabled(true);
    }//GEN-LAST:event_btnCapturarHatchbackActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        
        if(pickup != null)
        txaDatos.setText(pickup.obtenerDatos());
        
        if(sedan != null)
        txaDatos.setText(sedan.obtenerDatos());
        
        if(hatchback != null)
        txaDatos.setText(hatchback.obtenerDatos());

        pickup = null;
        sedan = null;
        hatchback = null;
        System.gc();

    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        txaDatos.setText("Seleccione el tipo de vehículo del que" +
                         "\ndesea generar un reporte. Solo puede" +
                         "\ngenerarse el reporte de un tipo de" +
                         "\nvehículo a la vez.");
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCapturarHatchback;
    private java.awt.Button btnCapturarPickup;
    private java.awt.Button btnCapturarSedan;
    private java.awt.Button btnGenerarReporte;
    private java.awt.Button btnLimpiarCampos;
    private java.awt.TextArea txaDatos;
    // End of variables declaration//GEN-END:variables
}