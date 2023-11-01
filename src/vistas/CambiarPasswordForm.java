package vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author anton
 */
public class CambiarPasswordForm extends javax.swing.JFrame {

    /**
     * Creates new form CambiarPasswordForm
     */
    public CambiarPasswordForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonConfirmarNuevaContrase�a = new javax.swing.JButton();
        jLabelContrase�a = new javax.swing.JLabel();
        jLabelRepetirContrase�a = new javax.swing.JLabel();
        jCheckBoxVerContrase�as = new javax.swing.JCheckBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonConfirmarNuevaContrase�a.setText("Confirmar nueva contrase�a");
        jButtonConfirmarNuevaContrase�a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarNuevaContrase�aActionPerformed(evt);
            }
        });

        jLabelContrase�a.setText("Contrase�a:");

        jLabelRepetirContrase�a.setText("Repetir contrase�a:");

        jCheckBoxVerContrase�as.setText("Ver contrase�as");
        jCheckBoxVerContrase�as.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxVerContrase�asActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBoxVerContrase�as)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmarNuevaContrase�a)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelContrase�a)
                            .addComponent(jLabelRepetirContrase�a))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jPasswordField2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContrase�a)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRepetirContrase�a)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmarNuevaContrase�a)
                    .addComponent(jCheckBoxVerContrase�as))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarNuevaContrase�aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarNuevaContrase�aActionPerformed
        // TODO add your handling code here:
        char[] password1 = jPasswordField1.getPassword();
        char[] password2 = jPasswordField2.getPassword();
        
        // Convierte los caracteres a cadenas
        String passwordString1 = new String(password1);
        String passwordString2 = new String(password2);
                
       // Compara las cadenas
        if (passwordString1.equals(passwordString2)) {
            JOptionPane.showMessageDialog(this, "Las contrase�as son iguales.");
        } else {
            JOptionPane.showMessageDialog(null, "Las contrase�as no son iguales.");
        }

        
    }//GEN-LAST:event_jButtonConfirmarNuevaContrase�aActionPerformed

    private void jCheckBoxVerContrase�asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVerContrase�asActionPerformed
        // TODO add your handling code here:
        if (jCheckBoxVerContrase�as.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);
            jPasswordField2.setEchoChar((char) 0);
        } else {
            jPasswordField1.setEchoChar('*');
            jPasswordField2.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxVerContrase�asActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarNuevaContrase�a;
    private javax.swing.JCheckBox jCheckBoxVerContrase�as;
    private javax.swing.JLabel jLabelContrase�a;
    private javax.swing.JLabel jLabelRepetirContrase�a;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    // End of variables declaration//GEN-END:variables
}
