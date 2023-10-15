package vistas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import paneles.PanelOtros;

import modelo.*;

/**
 *
 * @author antonio minero
 */
public class FormUsuario extends javax.swing.JFrame {
    
    String palabra ="";

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public JLabel getjLabel1() {
        return jLabelUserCode;
    }

    public void setjLabel1(String nuevoTexto) {
        jLabelUserCode.setText("Codigo: "+nuevoTexto);
    }
    
    /**
     * Creates new form FormUsuario
     */
    public FormUsuario() {
        this.setTitle("Logeado como usuario");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
        jButtonLogoutSession = new javax.swing.JButton();
        jLabelUserCode = new javax.swing.JLabel();
        jComboBoxTablas = new javax.swing.JComboBox<>();
        jLabelTablas = new javax.swing.JLabel();
        jLabelPalabra = new javax.swing.JLabel();
        jTextFieldPalabra = new javax.swing.JTextField();
        jLabelColumna = new javax.swing.JLabel();
        jTextFieldColumna = new javax.swing.JTextField();
        jTextFieldOrden = new javax.swing.JTextField();
        jLabelOrden = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();
        jLabelResultadoBusqueda = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonLogoutSession.setText("Logout Session");
        jButtonLogoutSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutSessionActionPerformed(evt);
            }
        });

        jLabelUserCode.setText("jLabelUserCode");

        jComboBoxTablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "empleados", "users", "jornada", "usertipe", "empresa" }));

        jLabelTablas.setText("Tabla:");

        jLabelPalabra.setText("Palabra:");

        jTextFieldPalabra.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldPalabra.setText("0");

        jLabelColumna.setText("Columna:");

        jTextFieldColumna.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldColumna.setText("0");

        jTextFieldOrden.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldOrden.setText("0");

        jLabelOrden.setText("Orden:");

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultado);

        jLabelResultadoBusqueda.setText("RESULTADO B�SQUEDA");

        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPalabra)
                                    .addComponent(jLabelTablas))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelColumna)
                                    .addComponent(jLabelOrden))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldOrden)
                                    .addComponent(jTextFieldColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelResultadoBusqueda)
                                .addGap(55, 55, 55))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelUserCode)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(jButtonLogoutSession)
                        .addGap(23, 23, 23)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelUserCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTablas))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPalabra)
                            .addComponent(jTextFieldPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelColumna))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelOrden)
                            .addComponent(jTextFieldOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelResultadoBusqueda)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogoutSession)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
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

    private void jButtonLogoutSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutSessionActionPerformed
        //Enviamos datos al servidor para que sepas que hemos cerrado sesion
         try {
            //IMPLEMENTA
            Socket socket = new Socket("localhost", 8888);//***Poner el metodo get del campo de texto de IPServidor

            // Obtener flujos de entrada y salida.
            BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter escriptor = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            // Aqu� enviamos la se�al de "logout" al servidor.
            String logoutSignal = "exit";
            escriptor.write(logoutSignal);
            escriptor.newLine();
            escriptor.flush();

            // Resto de la l�gica de cierre de sesi�n.
            lector.close();
            escriptor.close();
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }       
        palabra = "exit";

        //Cerramos ventana actual y abrimos la principal
        this.setVisible(false);
        
        MainForm mainForm = new MainForm();
        mainForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainForm.setLocation(mainForm.getX(),mainForm.getY()); 
        mainForm.setVisible(true);     
        mainForm.setPalabra(palabra);
        
        
        JOptionPane.showMessageDialog(null,"Palabra: "+ palabra+"Palabra: "+mainForm.getPalabra());
    }//GEN-LAST:event_jButtonLogoutSessionActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            // TODO add your handling code here:
            Socket socket = new Socket("localhost", 8888);//***
            BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));//flujo lectura del server
            BufferedWriter escriptor = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//flujo envio al server
            
            ObjectInputStream perEnt;
            
            
            String codigoUserRecibido = jLabelUserCode.getText(); //el codigo recibido tiene que ser el mismo que le hemos asignado
            String nombreTabla = jComboBoxTablas.getSelectedItem().toString(); //Ser� el numero de tabla. (ej: 1->empleados 2->users 3-jornada 4-usertipe 5->empresa)
            String columna = jTextFieldColumna.getText(); //sera la palabra que busquemos(ej: juan,1234567D), si ponemos 0 sera todos los de la tabla
            String palabraAbuscar = jTextFieldPalabra.getText();// si es el caso ser� la columna (,dni,nom,etc), si no hay ponemos 0
            String orden = jTextFieldOrden.getText();// si es el caso el orden, si no hay ponemos 0
            
            if (codigoUserRecibido.equals("")) {
                codigoUserRecibido = "0";
            }
            switch (nombreTabla) {
                case "empleados":
                    if (columna.equals("") || columna == null) {
                        columna = "0";
                    }
                    if (palabraAbuscar.equals("") || palabraAbuscar == null) {
                        palabraAbuscar = "0";
                    }
                    if (orden.equals("") || orden == null) {
                        orden = "0";
                    }
                    
                    String palabra = codigoUserRecibido + ":" + nombreTabla + ":" + columna + ":" + palabraAbuscar + ":" + orden;
                    
                    //ahora si enviamos al server los datos que queremos, sin errores
                    escriptor.write(palabra);
                    escriptor.newLine();
                    escriptor.flush();
                    System.out.println("Le enviamos esto al server: " + palabra);
                    
                    List<Empleados> listaPersonas = new ArrayList<>();
                    
                    perEnt = new ObjectInputStream(socket.getInputStream());
                    listaPersonas = (ArrayList) perEnt.readObject();
                    System.out.println("____________________________________________________________________");
                    //recibo objeto
                    for (int i = 0; i < listaPersonas.size(); i++) {
                        System.out.println("Dni: " + listaPersonas.get(i).getDni() + "\n"
                                + "Nombre: " + listaPersonas.get(i).getNom() + "\n"
                                        + "Apellido: " + listaPersonas.get(i).getApellido() + "\n"
                                                + "Nombre empresa: " + listaPersonas.get(i).getNomEmpresa() + "\n"
                                                        + "Departamento: " + listaPersonas.get(i).getDepartament() + "\n"
                                                                + "Codigo tarjeta: " + listaPersonas.get(i).getCodiCard() + "\n"
                                                                        + "Mail: " + listaPersonas.get(i).getMail() + "\n"
                                                                                + "Tel�fono: " + listaPersonas.get(i).getTelephone() + "\n");
                        System.out.println("____________________________________________________________________");
                    }
                    break;
                    
                case "users":
                    if (columna.equals("") || columna == null) {
                        columna = "0";
                    }
                    if (palabraAbuscar.equals("") || palabraAbuscar == null) {
                        palabraAbuscar = "0";
                    }
                    if (orden.equals("") || orden == null) {
                        orden = "0";
                    }
                    
                    palabra = codigoUserRecibido + ":" + nombreTabla + ":" + columna + ":" + palabraAbuscar + ":" + orden;
                    
                    //ahora si enviamos al server los datos que queremos, sin errores
                    escriptor.write(palabra);
                    escriptor.newLine();
                    escriptor.flush();
                    System.out.println("Le enviamos esto al server: " + palabra);
                    List<Users> listaUsers = new ArrayList<>();
                    perEnt = new ObjectInputStream(socket.getInputStream());
                    listaUsers = (ArrayList) perEnt.readObject();
                    System.out.println("____________________________________________________________________");
                    //recibo objeto
                    for (int i = 0; i < listaUsers.size(); i++) {
                        System.out.println("Login: " + listaUsers.get(i).getLogin() + "\n"
                                + "Password: " + listaUsers.get(i).getPass() + "\n"
                                        + "Tipo de user: " + listaUsers.get(i).getNumType() + "\n"
                                                + "DNI: " + listaUsers.get(i).getDni());
                        System.out.println("____________________________________________________________________");
                    }
                    break;
                    
                case "empresa":
                    if (columna.equals("") || columna == null) {
                        columna = "0";
                    }
                    if (palabraAbuscar.equals("") || palabraAbuscar == null) {
                        palabraAbuscar = "0";
                    }
                    if (orden.equals("") || orden == null) {
                        orden = "0";
                    }
                    
                    palabra = codigoUserRecibido + ":" + nombreTabla + ":" + columna + ":" + palabraAbuscar + ":" + orden;
                    
                    //ahora si enviamos al server los datos que queremos, sin errores
                    escriptor.write(palabra);
                    escriptor.newLine();
                    escriptor.flush();
                    System.out.println("Le enviamos esto al server: " + palabra);
                    List<Empresa> listaEmpresa = new ArrayList<>();
                    perEnt = new ObjectInputStream(socket.getInputStream());
                    listaEmpresa = (ArrayList) perEnt.readObject();
                    System.out.println("____________________________________________________________________");
                    //recibo objeto
                    for (int i = 0; i < listaEmpresa.size(); i++) {
                        System.out.println("Nombre empresa: " + listaEmpresa.get(i).getNom() + "\n"
                                + "Direcci�n: " + listaEmpresa.get(i).getAddress() + "\n"
                                        + "Tel�fono: " + listaEmpresa.get(i).getTelephon());
                        System.out.println("____________________________________________________________________");
                    }
                    break;
                case "jornada":
                    if (columna.equals("") || columna == null) {
                        columna = "0";
                    }
                    if (palabraAbuscar.equals("") || palabraAbuscar == null) {
                        palabraAbuscar = "0";
                    }
                    if (orden.equals("") || orden == null) {
                        orden = "0";
                    }
                    
                    palabra = codigoUserRecibido + ":" + nombreTabla + ":" + columna + ":" + palabraAbuscar + ":" + orden;
                    
                    //ahora si enviamos al server los datos que queremos, sin errores
                    escriptor.write(palabra);
                    escriptor.newLine();
                    escriptor.flush();
                    System.out.println("Le enviamos esto al server: " + palabra);
                    List<Jornada> listaJorandas = new ArrayList<>();
                    perEnt = new ObjectInputStream(socket.getInputStream());
                    listaJorandas = (ArrayList) perEnt.readObject();
                    System.out.println("____________________________________________________________________");
                    //recibo objeto
                    for (int i = 0; i < listaJorandas.size(); i++) {
                        System.out.println("Dni: " + listaJorandas.get(i).getDni() + "\n"
                                + "Nombre: " + listaJorandas.get(i).getNom() + "\n"
                                        + "Apellido: " + listaJorandas.get(i).getApellido() + "\n"
                                                + "C�digo tarjeta: " + listaJorandas.get(i).getCodiCard() + "\n"
                                                        + "Hora entrada: " + listaJorandas.get(i).getHoraEntrada() + "\n"
                                                                + "Hora salida: " + listaJorandas.get(i).getHoraSalida() + "\n"
                                                                        + "Total: " + listaJorandas.get(i).getTotalTiempo() + "\n"
                                                                                + "Fecha: " + listaJorandas.get(i).getFecha());
                        System.out.println("____________________________________________________________________");
                    }
                    break;
            }
            socket.close();
        }  catch (UnknownHostException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonLogoutSession;
    private javax.swing.JComboBox<String> jComboBoxTablas;
    private javax.swing.JLabel jLabelColumna;
    private javax.swing.JLabel jLabelOrden;
    private javax.swing.JLabel jLabelPalabra;
    private javax.swing.JLabel jLabelResultadoBusqueda;
    private javax.swing.JLabel jLabelTablas;
    private javax.swing.JLabel jLabelUserCode;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResultado;
    private javax.swing.JTextField jTextFieldColumna;
    private javax.swing.JTextField jTextFieldOrden;
    private javax.swing.JTextField jTextFieldPalabra;
    // End of variables declaration//GEN-END:variables
}
