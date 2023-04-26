package br.edu.ifpr;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaTeste extends JFrame {

   private JPanel contentPane;
   private JTextField textField;
   private JTextField textField_1;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               TelaTeste frame = new TelaTeste();
               frame.setVisible(true);
            }
            catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public TelaTeste() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100,100,450,300);
      
      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      
      JMenu mnNewMenu = new JMenu("Cadastros");
      menuBar.add(mnNewMenu);
      
      JMenuItem mntmNewMenuItem_1 = new JMenuItem("Produtos");
      mntmNewMenuItem_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            TelaProduto telaProduto = new TelaProduto();
            telaProduto.setVisible(true);
         }
      });
      mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
      mnNewMenu.add(mntmNewMenuItem_1);
      
      JMenuItem mntmNewMenuItem_2 = new JMenuItem("Clientes");
      mnNewMenu.add(mntmNewMenuItem_2);
      
      JMenuItem mntmNewMenuItem_3 = new JMenuItem("Fornecedores");
      mnNewMenu.add(mntmNewMenuItem_3);
      
      JMenuItem mntmNewMenuItem_4 = new JMenuItem("Vendedores");
      mnNewMenu.add(mntmNewMenuItem_4);
      
      JMenu mnNewMenu_1 = new JMenu("Movimenta\u00E7\u00F5es");
      menuBar.add(mnNewMenu_1);
      
      JMenu mnNewMenu_2 = new JMenu("Relat\u00F3rios");
      menuBar.add(mnNewMenu_2);
      
      JMenu mnNewMenu_3 = new JMenu("Ajuda");
      menuBar.add(mnNewMenu_3);
      
      JMenuItem mntmNewMenuItem = new JMenuItem("Sobre");
      mntmNewMenuItem.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"Teste");
            TelaSobre telaSobre = new TelaSobre();
            telaSobre.setVisible(true);
         }
      });
      mnNewMenu_3.add(mntmNewMenuItem);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5,5,5,5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel labelUsuario = new JLabel("Usu\u00E1rio");
      labelUsuario.setHorizontalAlignment(SwingConstants.CENTER);
      labelUsuario.setForeground(new Color(0, 0, 139));
      labelUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
      labelUsuario.setBounds(41, 43, 63, 32);
      contentPane.add(labelUsuario);
      
      JLabel lblSenha = new JLabel("Senha");
      lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
      lblSenha.setForeground(new Color(0, 0, 139));
      lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
      lblSenha.setBounds(41, 98, 63, 32);
      contentPane.add(lblSenha);
      
      textField = new JTextField();
      textField.setHorizontalAlignment(SwingConstants.CENTER);
      textField.setBounds(113, 51, 240, 20);
      contentPane.add(textField);
      textField.setColumns(10);
      
      textField_1 = new JTextField();
      textField_1.setHorizontalAlignment(SwingConstants.CENTER);
      textField_1.setColumns(10);
      textField_1.setBounds(114, 106, 239, 20);
      contentPane.add(textField_1);
      
      JButton btnNewButton = new JButton("Entrar");
      btnNewButton.setBounds(106, 159, 89, 23);
      contentPane.add(btnNewButton);
      
      JButton btnCriar = new JButton("Criar");
      btnCriar.setBounds(223, 159, 89, 23);
      contentPane.add(btnCriar);
   }
}
