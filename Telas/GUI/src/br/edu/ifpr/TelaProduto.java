package br.edu.ifpr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;

public class TelaProduto extends JFrame {

   private JPanel contentPane;
   private JTable table;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               TelaProduto frame = new TelaProduto();
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
   public TelaProduto() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100,100,450,300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5,5,5,5));

      setContentPane(contentPane);
      contentPane.setLayout(new BorderLayout(0, 0));
      
      JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
      contentPane.add(tabbedPane, BorderLayout.CENTER);
      
      JPanel panel = new JPanel();
      tabbedPane.addTab("Listagem", null, panel, null);
      
      table = new JTable();
      table.setModel(new DefaultTableModel(
         new Object[][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
         },
         new String[] {
            "New column", "New column", "New column", "New column"
         }
      ));
      panel.add(table);
      
      JPanel panel_1 = new JPanel();
      tabbedPane.addTab("Cadastro", null, panel_1, null);
      panel_1.setLayout(null);
      
      JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
      lblDescrio.setHorizontalAlignment(SwingConstants.CENTER);
      lblDescrio.setForeground(SystemColor.desktop);
      lblDescrio.setFont(new Font("Tahoma", Font.PLAIN, 14));
      lblDescrio.setBounds(32, 11, 63, 32);
      panel_1.add(lblDescrio);
      
      textField = new JTextField();
      textField.setHorizontalAlignment(SwingConstants.CENTER);
      textField.setColumns(10);
      textField.setBounds(104, 19, 275, 20);
      panel_1.add(textField);
      
      JLabel lblEstoque = new JLabel("Estoque ");
      lblEstoque.setHorizontalAlignment(SwingConstants.CENTER);
      lblEstoque.setForeground(SystemColor.desktop);
      lblEstoque.setFont(new Font("Tahoma", Font.PLAIN, 14));
      lblEstoque.setBounds(32, 54, 63, 32);
      panel_1.add(lblEstoque);
      
      textField_1 = new JTextField();
      textField_1.setHorizontalAlignment(SwingConstants.CENTER);
      textField_1.setColumns(10);
      textField_1.setBounds(104, 62, 275, 20);
      panel_1.add(textField_1);
      
      JLabel lblPreo = new JLabel("Pre\u00E7o");
      lblPreo.setHorizontalAlignment(SwingConstants.CENTER);
      lblPreo.setForeground(SystemColor.desktop);
      lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
      lblPreo.setBounds(32, 97, 63, 32);
      panel_1.add(lblPreo);
      
      textField_2 = new JTextField();
      textField_2.setHorizontalAlignment(SwingConstants.CENTER);
      textField_2.setColumns(10);
      textField_2.setBounds(104, 105, 275, 20);
      panel_1.add(textField_2);
      
      JButton btnCadastro = new JButton("Salvar");
      btnCadastro.setBounds(57, 166, 89, 23);
      panel_1.add(btnCadastro);
      
      JButton btnExcluir = new JButton("Apagar");
      btnExcluir.setBounds(168, 166, 89, 23);
      panel_1.add(btnExcluir);
      
      JButton btnCancelar = new JButton("Cancelar");
      btnCancelar.setBounds(278, 166, 89, 23);
      panel_1.add(btnCancelar);
   }
}
