package com.unifsa.tabalho2notabd;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame {
    private JTextField txtUsuario = new JTextField(20);
    private JPasswordField txtSenha = new JPasswordField(20);
    private JButton btnLogin = new JButton("Entrar");

    public LoginView() {
        setTitle("Login do Sistema");
        setLayout(new java.awt.FlowLayout());
        add(new JLabel("Usuário:")); add(txtUsuario);
        add(new JLabel("Senha:")); add(txtSenha);
        add(btnLogin);

        btnLogin.addActionListener((ActionEvent e) -> {
            String usuario = txtUsuario.getText();
            String senha = new String(txtSenha.getPassword());

            if(usuario.equals("admin") && senha.equals("123")) {
                new MenuPrincipalView().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos!", "Acesso Negado", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
        new LoginView().setVisible(true);
    });
    }
}