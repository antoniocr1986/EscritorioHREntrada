package vistas;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author antonio minero
 */
public class MainForm extends javax.swing.JFrame {

    String palabra = "";

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        this.setTitle("Ventana Login usuarios");
        // Establece la ubicaci�n de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        jCheckBoxVerContrase�a.setEnabled(false);
        jButtonConfirmar.setEnabled(false);
        jPasswordField.setEnabled(false);   
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
        jLabelIPServidor = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelContrase�a = new javax.swing.JLabel();
        jTextFieldIPServidor = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jCheckBoxVerContrase�a = new javax.swing.JCheckBox();
        jPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 270));
        jPanel1.setPreferredSize(new java.awt.Dimension(340, 290));

        jLabelIPServidor.setText("IP Servidor");

        jLabelUsuario.setText("Usuario");

        jLabelContrase�a.setText("Contrase�a");

        jTextFieldIPServidor.setText("localhost");

        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyReleased(evt);
            }
        });

        jButtonConfirmar.setText("CONFIRMAR");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("LIMPIAR");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jCheckBoxVerContrase�a.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBoxVerContrase�a.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxVerContrase�a.setText("Ver contrase�a");
        jCheckBoxVerContrase�a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxVerContrase�aActionPerformed(evt);
            }
        });

        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyReleased(evt);
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
                        .addGap(21, 21, 21)
                        .addComponent(jButtonConfirmar)
                        .addGap(57, 57, 57)
                        .addComponent(jButtonLimpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIPServidor)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelContrase�a))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIPServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCheckBoxVerContrase�a))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIPServidor)
                    .addComponent(jTextFieldIPServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContrase�a)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxVerContrase�a)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonLimpiar))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 350, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void conexionSocket(FormUsuarioAdmin adminForm, FormUsuario usuarioForm){
        boolean salir = false;

        try {
            //IMPLEMENTA
            Socket socket = new Socket(jTextFieldIPServidor.getText(), 8888);

            BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));//flujo lectura del server
            BufferedWriter escriptor = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//flujo envio al server
            
            ObjectInputStream perEnt;
            
            String codigo = "0";
            
            ///Llegeix del servidor el mensaje de bienvenida, y la pregunta que nos hace ///           
            String mensajeServer = lector.readLine();
            
            //ahora escribimos en servidor , enviandole la palabra a buscar 
            String palabra = jTextFieldUsuario.getText();
            String pass = jPasswordField.getText();
            String number = null;

            String login = palabra + ":" + pass;

            escriptor.write(login);
            escriptor.newLine();
            escriptor.flush();

            //leemos la respuesta
            mensajeServer = lector.readLine();

            if (mensajeServer.equalsIgnoreCase("-1")) {
                JOptionPane.showMessageDialog(null, "El login es erroneo");//vemos el c�digo
                salir = true;
                lector.close();
                escriptor.close();
                socket.close();

            } else if (mensajeServer.equalsIgnoreCase("-2")) {
                JOptionPane.showMessageDialog(null,".El usuario ya esta conectado");//vemos el c�digo
                salir = true;
                lector.close();
                escriptor.close();
                socket.close();
            } else {
                codigo = mensajeServer;
                JOptionPane.showMessageDialog(null,"El codigo es: "+codigo);

                // Comprueba si la primera letra es una "u" o una "a"
                if (mensajeServer.charAt(0) == 'U'){
                     usuarioForm.setjLabel1(codigo);
                     usuarioForm.setVisible(true);
                }else if(mensajeServer.charAt(0) == 'A'){
                     adminForm.setjLabel1(codigo);//***
                     adminForm.setVisible(true);
                }                  
                this.setVisible(salir);  
                
                escriptor.write(palabra);
                escriptor.newLine();
                escriptor.flush();
                
                if (this.palabra.equalsIgnoreCase("exit")){
                    salir = true;
                    lector.close();
                    escriptor.close();
                    socket.close();
                }
                if (usuarioForm.getPalabra().equalsIgnoreCase("exit")||adminForm.getPalabra().equalsIgnoreCase("exit")){
                    this.palabra = "exit"; 
                    salir = true;
                    lector.close();
                    escriptor.close();
                    socket.close();
                }                                                 
            }
        }catch (ConnectException e) {
           Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, e);
        } catch (UnknownHostException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception e) {   
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void habilitarBotones() {
        if (!jTextFieldUsuario.getText().isEmpty() && !jPasswordField.getText().isEmpty()) {
            jButtonConfirmar.setEnabled(true);
            jCheckBoxVerContrase�a.setEnabled(true);
        } else {
            jButtonConfirmar.setEnabled(false);
        }
    }
    
    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
        FormUsuarioAdmin ventanaSecundariaAdmin= new FormUsuarioAdmin();
        FormUsuario ventanaSecundariaUser=new FormUsuario();
        try{
            // TODO add your handling code here:
            if (jTextFieldIPServidor.getText().isEmpty()||jTextFieldIPServidor.getText().isBlank()||jTextFieldIPServidor.getText() =="" ){
                   JOptionPane.showMessageDialog(null, 
                             "Rellena el campo IP.");
            }else{//Esta la ip rellena
                if (!jTextFieldUsuario.getText().equals("") && !jPasswordField.getText().equals("")) {                                                              
                        conexionSocket(ventanaSecundariaAdmin, ventanaSecundariaUser);
                    }
                }
        } catch (Exception ex) {
            Logger.getLogger(Exception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        jTextFieldUsuario.setText("");
        jPasswordField.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jCheckBoxVerContrase�aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVerContrase�aActionPerformed
        // TODO add your handling code here:
        if (jCheckBoxVerContrase�a.isSelected()) {
            jPasswordField.setEchoChar((char) 0);
        } else {
            jPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxVerContrase�aActionPerformed

    private void jTextFieldUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyReleased
        // TODO add your handling code here:
         jPasswordField.setEnabled(true);
    }//GEN-LAST:event_jTextFieldUsuarioKeyReleased

    private void jPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyReleased
        // TODO add your handling code here:
        habilitarBotones();
        if(jPasswordField.getText()==""||jPasswordField.getText().isEmpty()){
            jCheckBoxVerContrase�a.setEnabled(false);
        }
    }//GEN-LAST:event_jPasswordFieldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JCheckBox jCheckBoxVerContrase�a;
    private javax.swing.JLabel jLabelContrase�a;
    private javax.swing.JLabel jLabelIPServidor;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldIPServidor;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
