package vista;
public class VentanaPrincipal extends javax.swing.JFrame {
    public VentanaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnAgregar = new javax.swing.JMenuItem();
        mnEliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnBuscarPorTipo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Manipulación");

        mnAgregar.setText("Agregar juego");
        mnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregarActionPerformed(evt);
            }
        });
        jMenu1.add(mnAgregar);

        mnEliminar.setText("Eliminar Juego");
        mnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(mnEliminar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Busqueda");

        jMenuItem1.setText("Buscar juego por nombre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        mnBuscarPorTipo.setText("Buscar por tipo de juego");
        mnBuscarPorTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBuscarPorTipoActionPerformed(evt);
            }
        });
        jMenu2.add(mnBuscarPorTipo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        

    private void mnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregarActionPerformed
        new VentanaAgregar().setVisible(true);
    }//GEN-LAST:event_mnAgregarActionPerformed

    private void mnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEliminarActionPerformed
        new VentanaEliminar().setVisible(true);
    }//GEN-LAST:event_mnEliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new VentanaBuscar().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnBuscarPorTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBuscarPorTipoActionPerformed
        new VentanaBuscarPorTipo().setVisible(true);
    }//GEN-LAST:event_mnBuscarPorTipoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnAgregar;
    private javax.swing.JMenuItem mnBuscarPorTipo;
    private javax.swing.JMenuItem mnEliminar;
    // End of variables declaration//GEN-END:variables
}

