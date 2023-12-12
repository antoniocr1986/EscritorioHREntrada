package vistas;

import CRUD.Update;
import java.io.BufferedWriter;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Antonio Company Rodriguez
 * 
 * Clase para crear ventanas para cambio de contrase�a del usuario logueado
 */
public class CambiarPasswordForm extends javax.swing.JFrame {

    private final String DIRECTORIOACTUAL = System.getProperty("user.dir");
    private final String RUTAIMAGEN = DIRECTORIOACTUAL + "/img/HREntradaIcono.jpg";
    
    private String codigoUserRecibido;
    private JComboBox jComboBoxTipoOperacion;
    private FormVentanasUsuario ventana;
    private String user;
    private String []insertEmpresas;
    private BufferedWriter escriptor;
    private ObjectInputStream perEnt;
    private Socket socket;
    private JTextArea jTextAreaUpdate;  
    
    /**
     * Creates new form CambiarPasswordForm
     * A�adiremos caracter�sticas iniciales como la posici�n centrada, el t�tulo y el icono personalizados
     * 
     * @param jComboBoxTipoOperacion desplegable de la ventana con el tipo de operacion CRUD a realizar
     * @param ventana Ventana del tipo FormVentanasUsuario que tendremos abierta mientras creamos la nueva ventana
     * @param user �s un string con el nombre del usuario que haya iniciado sesi�n que pasaremos
     * por par�metro al crear un tipo de ventanas de este
     * @param insertEmpresas array de String que contiene todos los valores para el update
     * @param escriptor BufferedWriter de contacto con el server
     * @param perEnt tipo de objeto ObjectInputStream recibido
     * @param socket Objeto tipo Socket para la conexi�n
     * @param jTextAreaUpdate textArea en el que mostraremos los datos al usuario por la aplicaci�n gr�fica
     */
    
    public CambiarPasswordForm( JComboBox jComboBoxTipoOperacion, FormVentanasUsuario ventana, String user, String insertEmpresas[], BufferedWriter escriptor, ObjectInputStream perEnt, Socket socket, JTextArea jTextAreaUpdate) {
        this.jComboBoxTipoOperacion=jComboBoxTipoOperacion;
        this.ventana=ventana;
        this.user=user;
        this.insertEmpresas=insertEmpresas;
        this.escriptor=escriptor;
        this.perEnt = perEnt;
        this.socket = socket;
        this.jTextAreaUpdate=jTextAreaUpdate;
        
        setLocationRelativeTo(null);
        setTitle("Cambiar contrase�a usuario: "+user);
        setResizable(false);
        initComponents();
        
        jButtonConfirmarNuevaContrase�a.setEnabled(false);
        jCheckBoxVerContrase�as.setEnabled(false);
        
        //A�adir icono
        ImageIcon icono = new ImageIcon(RUTAIMAGEN);
        setIconImage(icono.getImage());
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

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });

        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyReleased(evt);
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

    /**
    * Acci�n ejecutada al clicar en el bot�n confirmar nueva contrase�a, que comprueba
    * que las dos contrase�as escritas en los jPasswordFields sean iguales y muestra
    * un JOptionPane informando si lo s�n o no lo s�n.
    *
    * @param evt Evento de acci�n generado al interactuar con el boton
    * 
    */
    
    private void jButtonConfirmarNuevaContrase�aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarNuevaContrase�aActionPerformed

        char[] password1 = jPasswordField1.getPassword();
        char[] password2 = jPasswordField2.getPassword();
        
        // Convierte los caracteres a cadenas
        String passwordString1 = new String(password1);
        String passwordString2 = new String(password2);
                
       // Compara las cadenas
        if (passwordString1.equals(passwordString2)) { 
            ventana.setCambioPass(true);   
            ventana.setSelect(false);
            ventana.setInsert(false);
            ventana.setUpdate(false);
            ventana.setDelete(false);
            ventana.setPasswordCambioPass (jPasswordField1.getText());              
            ventana.ejecutarAccion();            
            this.dispose();
            
        } else {
            JOptionPane.showMessageDialog(null, "Las contrase�as no son iguales.");
        }       
    }//GEN-LAST:event_jButtonConfirmarNuevaContrase�aActionPerformed

    /**
    * M�todo que lo que hace es si el checkBox determinado esta seleccionado dejaremos ver
    * los car�cteres de jPasswordField1 y jPasswordField2, en cambio sino esta seleccionado
    * lo que haremos ser� poner todos los car�cteres de su contenido como '*'
    *
    * @param evt Evento de acci�n generado al interactuar con el JCheckBox
    */
    
    private void jCheckBoxVerContrase�asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVerContrase�asActionPerformed
 
        if (jCheckBoxVerContrase�as.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);
            jPasswordField2.setEchoChar((char) 0);
        } else {
            jPasswordField1.setEchoChar('*');
            jPasswordField2.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxVerContrase�asActionPerformed

    /**
    * Habilitaremos o no el boton de confirmar contrase�a y el checkbox seg�n
    * las condiciones de los m�todos internos.
    *
    * @param evt Evento de acci�n generado al teclear algo en la Contrase�a
    */
    
    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
      
        habilitarDeshabilitarBotonConfirmarContrase�a();
        habilitarDeshabilitarCheckBoxVerContrase�as();
    }//GEN-LAST:event_jPasswordField1KeyReleased

    /**
    * Habilitaremos o no el boton de confirmar contrase�a y el checkbox seg�n
    * las condiciones de los m�todos internos.
    *
    * @param evt Evento de acci�n generado al teclear algo en la Contrase�a2
    */
    
    private void jPasswordField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyReleased
       
        habilitarDeshabilitarBotonConfirmarContrase�a();
        habilitarDeshabilitarCheckBoxVerContrase�as();
    }//GEN-LAST:event_jPasswordField2KeyReleased

    /**
    * Habilita o deshabilita el bot�n de confirmar cambio de contrase�a
    * dependiendo de si alguna de las contrase�as introducida esta vac�a.
    *
    */
    
    public void habilitarDeshabilitarBotonConfirmarContrase�a(){
        if ((jPasswordField1.getText().equals(""))||(jPasswordField2.getText().equals(""))){
            jButtonConfirmarNuevaContrase�a.setEnabled(false);
        }else{
            jButtonConfirmarNuevaContrase�a.setEnabled(true);
        }
    }
    
    /**
    * Habilita o deshabilita el checkBox para ver contrase�as dependiendo de si alguna de las 
    * contrase�as introducida no esta vac�a.
    *
    */
    
    public void habilitarDeshabilitarCheckBoxVerContrase�as(){
        if ((!jPasswordField1.getText().equals(""))||(!jPasswordField2.getText().equals(""))){
            jCheckBoxVerContrase�as.setEnabled(true);
        }
        else{
             jCheckBoxVerContrase�as.setEnabled(false);
        }
    }
    
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
