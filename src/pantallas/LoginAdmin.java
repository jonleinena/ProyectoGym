package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logneg.Administrador;
import logneg.Factura;
import logneg.UsuarioGym;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

/**
 * 
 * @author Nora Royo
 * @author Victor Martinez
 *
 */
public class LoginAdmin extends JFrame {
	private ArrayList<UsuarioGym> usuarioBD = new ArrayList<UsuarioGym>();
	private ArrayList<Administrador> adminBD = new ArrayList<Administrador>();
	private ArrayList<Factura> facturasBD = new ArrayList<Factura>();
	private PantallaPrincipal padre;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	


	/**
	 * Create the frame.
	 */
	public LoginAdmin(ArrayList<UsuarioGym> usuario, ArrayList<Factura> fac,ArrayList<Administrador> admin, PantallaPrincipal padre) {
		this.usuarioBD=usuario;
		this.facturasBD=fac;
		this.adminBD=admin;
		this.padre= padre;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(62, 80, 146, 26);
		textField.setFont(new Font("Century Gothic", Font.BOLD, 12));
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(62, 151, 146, 26);
		passwordField.setFont(new Font("Century Gothic", Font.BOLD, 12));
		contentPane.add(passwordField);
		
		JLabel lblUsuario = new JLabel("Usuario ");
		lblUsuario.setBounds(62, 59, 69, 20);
		lblUsuario.setFont(new Font("Century Gothic", Font.BOLD, 16));
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a ");
		
		lblContrasea.setBounds(62, 132, 146, 20);
		lblContrasea.setFont(new Font("Century Gothic", Font.BOLD, 16));
		contentPane.add(lblContrasea);
	}
}
