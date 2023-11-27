/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaRegistroParejas extends JFrame {

    private JPanel panelRegistroParejas;
    private JButton botonVolver;
    private JLabel eNombre;
    private JTextField campoNombre;
    private JComboBox<String> eGenero;
    private JLabel eCorreo;
    private JTextField campoCorreo;
    private JButton botonRegistrarse;
    private JLabel eUsuario;
    private JLabel eContrasena;
    private JTextField campoUsuario;
    private JTextField campoContrasena;

    public VentanaRegistroParejas() {
        setTitle("Registro Parejas");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
    }

    public void inicializarComponentes() {
        panelRegistroParejas = new JPanel(null);
        panelRegistroParejas.setBackground(new Color(251, 198, 248));
        panelRegistroParejas.setLayout(new FlowLayout());
        panelRegistroParejas.setVisible(true);

        botonVolver = new JButton("Volver");
        botonVolver.setActionCommand("VOLVER_REGISTROPAREJA");
        botonVolver.setBounds(40, 400, 100, 30);
        add(botonVolver);

        eNombre = new JLabel("Nombre: ");
        eNombre.setBounds(170, 90, 100, 20);
        add(eNombre);

        campoNombre = new JTextField("vaca1");
        campoNombre.setBounds(250, 90, 200, 20);
        add(campoNombre);

        eGenero = new JComboBox<String>();
        eGenero.addItem("Mujer");
        eGenero.addItem("Hombre");
        eGenero.setBounds(250, 140, 200, 30);
        add(eGenero);

        eUsuario = new JLabel("Usuario: ");
        eUsuario.setBounds(170, 200, 60, 10);
        add(eUsuario);

        campoUsuario = new JTextField("usuario");
        campoUsuario.setBounds(250, 200, 200, 20);
        add(campoUsuario);

        eContrasena = new JLabel("Contrasena: ");
        eContrasena.setBounds(150, 240, 90, 20);
        add(eContrasena);

        campoContrasena = new JTextField("contrasena");
        campoContrasena.setBounds(250, 240, 200, 20);
        add(campoContrasena);

        eCorreo = new JLabel("Correo: ");
        eCorreo.setBounds(170, 290, 100, 20);
        add(eCorreo);

        campoCorreo = new JTextField("correo@gmail.com");
        campoCorreo.setBounds(250, 290, 200, 20);
        add(campoCorreo);

        botonRegistrarse = new JButton("REGISTRAR PAREJA");
        botonRegistrarse.setActionCommand("PANEL_REGISTRAR_PAREJA");
        botonRegistrarse.setBounds(250, 350, 180, 30);
        add(botonRegistrarse);

        this.add(panelRegistroParejas);
    }
}
