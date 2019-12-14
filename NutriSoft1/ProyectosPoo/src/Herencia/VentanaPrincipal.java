package Herencia;


    import javax.swing.JOptionPane;

public class VentanaPrincipal extends java.awt.Frame {

    Estudiante estudiante;
    Profesor profesor;
    
    public VentanaPrincipal() {
        
        initComponents();
        btnrep.setEnabled(false);
        
        Estudiante e, e2;
        Profesor d;
        Persona p;
        
        e = new Estudiante();
        e2 = e;
        d = new Profesor();
        
        JOptionPane.showMessageDialog(null, e2.obtenerDatos());
        e2.setNombre("Perico de los palotes");
        
        /* boolean y = 4 > 5;
        System.out.println(y);
        
        int x = 4 * 5;
        System.out.println(x); */
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btndatest = new java.awt.Button();
        btndatprof = new java.awt.Button();
        btnrep = new java.awt.Button();
        txaDatos = new java.awt.TextArea();

        setResizable(false);
        setTitle("Generador de reportes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        btndatest.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btndatest.setLabel("Capturar datos del estudiante");
        btndatest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatestActionPerformed(evt);
            }
        });

        btndatprof.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btndatprof.setLabel("Capturar datos del profesor");
        btndatprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatprofActionPerformed(evt);
            }
        });

        btnrep.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnrep.setLabel("Generar reporte");
        btnrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrepActionPerformed(evt);
            }
        });

        txaDatos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btndatprof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndatest, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnrep, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndatest, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndatprof, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        setSize(new java.awt.Dimension(366, 380));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void btndatestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatestActionPerformed
        estudiante = new Estudiante();
        new VentanaEstudiante(estudiante).setVisible(true);
        btnrep.setEnabled(true);
    }//GEN-LAST:event_btndatestActionPerformed

    private void btndatprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatprofActionPerformed
        profesor = new Profesor();
        new VentanaProfesor(profesor).setVisible(true);
        btnrep.setEnabled(true);
    }//GEN-LAST:event_btndatprofActionPerformed

    private void btnrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrepActionPerformed
        if (estudiante != null)
        txaDatos.setText(estudiante.obtenerDatos());
        
        if (profesor != null)
        txaDatos.append(profesor.obtenerDatos());
        
        estudiante = null;
        profesor = null;
        System.gc();
    }//GEN-LAST:event_btnrepActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btndatest;
    private java.awt.Button btndatprof;
    private java.awt.Button btnrep;
    private java.awt.TextArea txaDatos;
    // End of variables declaration//GEN-END:variables
}