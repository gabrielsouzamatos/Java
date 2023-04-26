package Jogo;

import javax.swing.JFrame;

public class Janela {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Jogo da velha");
		frame.setSize(600,630);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.setBounds(0, 0, 600, 600);
		frame.add(jogo);
		
		frame.addMouseListener(jogo);

	}
}