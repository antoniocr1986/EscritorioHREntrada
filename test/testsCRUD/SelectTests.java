package testsCRUD;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import CRUD.Select;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import logs.ConexionSocket;
import logs.Logout;
import vistas.FormVentanasUsuario;
import vistas.MainForm;

/**
 *Clase para comprobar operaciones tipo Select
 * 
 * @author Antonio Company Rodriguez
 */

public class SelectTests {
    private Select select;
    private StringWriter stringWriter;
    private BufferedReader lector;
    private BufferedWriter escriptor;
    private JTextArea textArea;
    private Socket socket;
    
    @Test
    public void testMostrarTablaSinFiltro() throws IOException, ClassNotFoundException {
        String ip = "localhost";
        String user = "admin";
        String password = "admin";

        MainForm mainForm = new MainForm();
        mainForm.setCodigo("A12354"); // Código de usuario válido para la prueba
        JTextField jTextFieldIPServidor = new JTextField(ip);
        JTextField jTextFieldUsuario = new JTextField(user);
        JPasswordField jPasswordField = new JPasswordField(password);
        FormVentanasUsuario usuarioFormPestañas = new FormVentanasUsuario(user,password);

        ConexionSocket.conexionSocket(mainForm, usuarioFormPestañas, jTextFieldIPServidor, jTextFieldUsuario, jPasswordField);
        
        socket = mainForm.getSocket();
        lector = new BufferedReader(new InputStreamReader( MainForm.getSocket().getInputStream()));
        escriptor = new BufferedWriter(new OutputStreamWriter( MainForm.getSocket().getOutputStream()));
        
        Select.mostrarTablaSinFiltro("dni", "12345678A", "operacion", "0", escriptor, "usuario", socket, textArea);

        // Verifica que el resultado esperado se encuentra en el textArea
        assertTrue(textArea.getText().contains("Dni: 12345678A"));
        
        Logout.logout(usuarioFormPestañas);
    }
    
    @Test
    public void testMostrarTablaEmpleados1Filtro() throws IOException, ClassNotFoundException {
        String ip = "localhost";
        String user = "admin";
        String password = "admin";

        MainForm mainForm = new MainForm();
        mainForm.setCodigo("A12354"); // Código de usuario válido para la prueba
        JTextField jTextFieldIPServidor = new JTextField(ip);
        JTextField jTextFieldUsuario = new JTextField(user);
        JPasswordField jPasswordField = new JPasswordField(password);
        FormVentanasUsuario usuarioFormPestañas = new FormVentanasUsuario(user,password);

        ConexionSocket.conexionSocket(mainForm, usuarioFormPestañas, jTextFieldIPServidor, jTextFieldUsuario, jPasswordField);
        
        socket = mainForm.getSocket();
        escriptor = new BufferedWriter(new OutputStreamWriter( MainForm.getSocket().getOutputStream()));
        
        Select.mostrarTablaEmpleados1Filtro("0", "dni", "usuario", "123", "operacion", escriptor, textArea, null, socket);

        // Verificamos que el resultado esperado se encuentra en el textArea
        assertTrue(textArea.getText().contains("Dni: 12345678A"));
        
        Logout.logout(usuarioFormPestañas);
    }

    @Test
    public void testMostrarTablaUsers1Filtro() throws IOException, ClassNotFoundException {
        String ip = "localhost";
        String user = "admin";
        String password = "admin";

        MainForm mainForm = new MainForm();
        mainForm.setCodigo("A12354"); // Código de usuario válido para la prueba
        JTextField jTextFieldIPServidor = new JTextField(ip);
        JTextField jTextFieldUsuario = new JTextField(user);
        JPasswordField jPasswordField = new JPasswordField(password);
        FormVentanasUsuario usuarioFormPestañas = new FormVentanasUsuario(user,password);

        ConexionSocket.conexionSocket(mainForm, usuarioFormPestañas, jTextFieldIPServidor, jTextFieldUsuario, jPasswordField);
        
        socket = mainForm.getSocket();
        escriptor = new BufferedWriter(new OutputStreamWriter( MainForm.getSocket().getOutputStream()));
        
        Select.mostrarTablaUsers1Filtro("1", "dni", "usuario", "123", "operacion", escriptor, textArea, null, socket);

        // Verificamos que el resultado esperado se encuentra en el textArea
        assertTrue(textArea.getText().contains("Dni: 12345678A"));
        
        Logout.logout(usuarioFormPestañas);
    }
    
    @Test
    public void testMostrarTablaEmpresa1Filtro() throws IOException, ClassNotFoundException {
        String ip = "localhost";
        String user = "admin";
        String password = "admin";
        String codigo = "A12354";

        MainForm mainForm = new MainForm();
        mainForm.setCodigo(codigo); // Código de usuario válido para la prueba
        JTextField jTextFieldIPServidor = new JTextField(ip);
        JTextField jTextFieldUsuario = new JTextField(user);
        JPasswordField jPasswordField = new JPasswordField(password);
        FormVentanasUsuario usuarioFormPestañas = new FormVentanasUsuario(user,password);

        ConexionSocket.conexionSocket(mainForm, usuarioFormPestañas, jTextFieldIPServidor, jTextFieldUsuario, jPasswordField);
        
        socket = mainForm.getSocket();
        escriptor = new BufferedWriter(new OutputStreamWriter( MainForm.getSocket().getOutputStream()));
        
        Select.mostrarTablaEmpresa1Filtro("2", "nom", codigo, "Grandvalira", "operacion", escriptor, textArea, null, socket);

        // Verificamos que el resultado esperado se encuentra en el textArea
        assertTrue(textArea.getText().contains("Grandvalira"));
        
        Logout.logout(usuarioFormPestañas);
    }
    
    @Test
    public void testMostrarTablaJornada1Filtro() throws IOException, ClassNotFoundException {
        String ip = "localhost";
        String user = "admin";
        String password = "admin";
        String codigo = "A12354";

        MainForm mainForm = new MainForm();
        mainForm.setCodigo(codigo); // Código de usuario válido para la prueba
        JTextField jTextFieldIPServidor = new JTextField(ip);
        JTextField jTextFieldUsuario = new JTextField(user);
        JPasswordField jPasswordField = new JPasswordField(password);
        FormVentanasUsuario usuarioFormPestañas = new FormVentanasUsuario(user,password);

        ConexionSocket.conexionSocket(mainForm, usuarioFormPestañas, jTextFieldIPServidor, jTextFieldUsuario, jPasswordField);
        
        socket = mainForm.getSocket();
        escriptor = new BufferedWriter(new OutputStreamWriter( MainForm.getSocket().getOutputStream()));
        
        Select.mostrarTablaJornada1Filtro("3", "dni", codigo, "12345679B", "operacion", escriptor, textArea, null, socket);

        // Verificamos que el resultado esperado se encuentra en el textArea
        assertTrue(textArea.getText().contains("12345679B"));
        
        Logout.logout(usuarioFormPestañas);
    }
}
