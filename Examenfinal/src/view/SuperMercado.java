/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alejo
 */
public class SuperMercado extends JFrame {

    private JPanel panelSuperMercado;
    private JLabel eSuperMercado;
    
    public SuperMercado() {

        setTitle("SuperMercado");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    
    public void inicializarComponentes() {
        panelSuperMercado = new JPanel(null);
        panelSuperMercado.setBackground(Color.red);
        panelSuperMercado.setLayout(new FlowLayout());
        panelSuperMercado.setVisible(true);
        
        

    }

}
