package org.example.in;

import org.example.in.datos.EventosRaton;

import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends JFrame {
    private JLabel lblNombre;
    private TextField txtNombre;
    private Button btnBoton;

    public Principal(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        this.setLayout(new FlowLayout());
        lblNombre=new JLabel("Nombre: ");
        this.add(lblNombre);
        txtNombre=new TextField(30);
        this.add(txtNombre);
        btnBoton = new Button("Saludar");
        //btnBoton.addMouseListener(new EventosRaton());
        btnBoton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(txtNombre.getText());
                JOptionPane.showMessageDialog(null,"Hola "+txtNombre.getText());
            }
        });
        this.add(btnBoton);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }

}
