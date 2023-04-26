package br.edu.ifpr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class TelaSobre extends JFrame {

   private JPanel contentPane;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               TelaSobre frame = new TelaSobre();
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
   public TelaSobre() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100,100,450,300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5,5,5,5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("Balacobaco Sistemas");
      lblNewLabel.setForeground(Color.GRAY);
      lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(124, 22, 152, 28);
      contentPane.add(lblNewLabel);
      
      JTextPane txtpnUmaEmpresaAtuando = new JTextPane();
      txtpnUmaEmpresaAtuando.setEditable(false);
      txtpnUmaEmpresaAtuando.setForeground(Color.BLACK);
      txtpnUmaEmpresaAtuando.setBackground(SystemColor.control);
      txtpnUmaEmpresaAtuando.setText("Uma empresa atuando no mercado desde 2013.\r\nFundada por Gabriel de Souza Matos\r\n(c) Balacobaco Sistemas\r\n");
      txtpnUmaEmpresaAtuando.setBounds(70, 76, 271, 119);
      contentPane.add(txtpnUmaEmpresaAtuando);
   }
}
